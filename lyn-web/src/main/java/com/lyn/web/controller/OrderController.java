package com.lyn.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyn.common.exception.ExceptionEnum;
import com.lyn.common.utils.RequestStr;
import com.lyn.common.utils.ResultUtils;
import com.lyn.goods.api.entity.GoodsSpecs;
import com.lyn.goods.api.service.GoodsService;
import com.lyn.order.api.service.OrderService;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.web.constants.WebConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
/**
 * <p>请添加描述信息</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/7/18 0018
 * @since jdk1.8
 */
@RestController
@RequestMapping("/api/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "preorder",method = RequestMethod.POST)
    public Object preorder(HttpServletRequest request) throws Exception {
        UserInfo loginUser = (UserInfo) request.getAttribute(WebConstant.LOGIN_SESSION);
        String requestStr = RequestStr.getRequestStr(request);
        JSONObject jsonObj = JSONObject.parseObject(requestStr);
        if(StringUtils.isEmpty(jsonObj.getString("goodsId")) || StringUtils.isEmpty(jsonObj.getString("specsId"))){
            return ResultUtils.exception(ExceptionEnum.PARAM_ERROR);
        } else {
            GoodsSpecs goodsSpecs = goodsService.findGoodsSpecsByPrimary(Integer.parseInt(jsonObj.getString("specsId")));
            if(!goodsSpecs.getStatus()){
                return ResultUtils.fail("当前规格不可销售!");
            } else if(goodsSpecs.getStock() <= 0){
                return ResultUtils.fail("当前规格已售完!");
            } else {
                //todo code
                return null;
            }
        }
    }
}
