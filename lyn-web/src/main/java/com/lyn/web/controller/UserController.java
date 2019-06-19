package com.lyn.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.lyn.common.cache.CacheService;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.utils.RequestStr;
import com.lyn.common.utils.ResultUtils;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.sys.api.service.UserService;
import com.lyn.web.aspect.ExceptionHandler;
import com.lyn.web.constants.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/15 0015
 * @since jdk1.8
 */
@Controller
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Autowired
    private CacheService cacheService;

    @Autowired
    private ExceptionHandler exceptionHandler;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Object addUser(HttpServletRequest request) throws Exception {
        try {
            UserInfo loginUser = (UserInfo) request.getAttribute(WebConstant.LOGIN_SESSION);
            String requestStr = RequestStr.getRequestStr(request);
            JSONObject jsonObj = JSONObject.parseObject(requestStr);
            if (StringUtils.isEmpty(jsonObj.getString("userName"))
                    || StringUtils.isEmpty(jsonObj.getString("mobile"))
                    || StringUtils.isEmpty(jsonObj.getString("password"))) {
                return ResultUtils.exception(ExceptionEnum.PARAM_ERROR);
            } else {
                UserInfo userInfo = new UserInfo();
                userInfo.setUserName(jsonObj.getString("userName"));
                userInfo.setMobile(jsonObj.getString("mobile"));
                userInfo.setPassword(jsonObj.getString("password"));
                userInfo.setCreator(loginUser.getUserId());
                if (userService.addUser(userInfo) > 0) {
                    return ResultUtils.success("添加成功！");
                }
                return ResultUtils.fail("添加失败！");
            }
        }catch (Exception e){
            return exceptionHandler.exceptionGet(e);
        }
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public Object login(HttpServletRequest request) throws Exception {
        String requestStr = RequestStr.getRequestStr(request);
        JSONObject jsonObj = JSONObject.parseObject(requestStr);
        if(StringUtils.isEmpty(jsonObj.getString("mobile")) || StringUtils.isEmpty(jsonObj.getString("password"))){
            return ResultUtils.exception(ExceptionEnum.PARAM_ERROR);
        } else {
            UserInfo user = userService.login(jsonObj.getString("mobile"),jsonObj.getString("password"));
            if(null == user){
                return ResultUtils.fail("账号或密码错误！");
            }
            String token = UUID.randomUUID().toString().replace("-","");
            user.setToken(token);
            cacheService.setCacheToRedis(WebConstant.LOGIN_CACHE_PREFIX+token,user,WebConstant.USER_LOGIN_EXPIRES);
            return ResultUtils.success(token);
        }
    }
}
