package com.lyn.web.filter;

import com.alibaba.fastjson.JSONObject;
import com.lyn.common.cache.CacheService;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.utils.SignUtils;
import com.lyn.common.utils.RequestStr;
import com.lyn.common.utils.ResultUtils;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.web.constants.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/14 0014
 * @since jdk1.8
 */
@WebFilter(filterName = "myFilter",urlPatterns = {"/api/*"})
public class MyFilter implements Filter {

    private String[] NO_FILTER_TOKEN = {"/login"};

    @Autowired
    private CacheService cacheService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //设置编码
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 表明它允许"http://xxx"发起跨域请求
        response.setHeader("Access-Control-Allow-Origin", "*");
        // 表明在xxx秒内，不需要再发送预检验请求，可以缓存该结果
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS");
        // 获取请求根
        String burl = request.getScheme() // 当前链接使用的协议
                + "://" + request.getServerName() + ":" + request.getLocalPort();// 服务器地址
        String uri = request.getRequestURL().toString();
        if(request.getMethod().equals("GET")){
            String jsonString = RequestStr.getParamJsonString(request);
            request.setAttribute("RequestStr",jsonString);
        }
        String requestStr = RequestStr.getRequestStr(request);
        //校验签名
        if(requestStr.indexOf("sign") != -1){
            //校验签名
            if(SignUtils.checkSign(requestStr)){
                //是否需要令牌
                UserInfo userInfo = null;
                if(isNeedToken(uri)){
                    //校验令牌
                    JSONObject jsonObj = JSONObject.parseObject(requestStr);
                    String token = jsonObj.getString("token");
                    userInfo = (UserInfo) cacheService.getCacheByKey(WebConstant.LOGIN_CACHE_PREFIX+token);
                    if(userInfo == null){
                        servletResponse.setContentType("application/json");
                        PrintWriter out = servletResponse.getWriter();
                        out.print(ResultUtils.exception(ExceptionEnum.LOGIN_ERROR).toString());
                        return;
                    }
                }
                request.setAttribute(WebConstant.LOGIN_SESSION,userInfo);
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                servletResponse.setContentType("application/json");
                PrintWriter out = servletResponse.getWriter();
                out.print(ResultUtils.exception(ExceptionEnum.SIGN_ERROR).toString());
                return;
            }
        }else {
            servletResponse.setContentType("application/json");
            PrintWriter out = servletResponse.getWriter();
            out.print(ResultUtils.error(1001,"缺少签名").toString());
            return;
        }
    }

    private boolean isNeedToken(String uri){
        if(uri.indexOf("/") != -1){
            for(String arr:NO_FILTER_TOKEN){
                if(uri.indexOf(arr) != -1){
                    return false;
                }
            }
        }
        return true;
    }
}
