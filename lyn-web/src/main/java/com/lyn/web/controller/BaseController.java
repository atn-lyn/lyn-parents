package com.lyn.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyn.common.cache.CacheService;
import com.lyn.common.utils.ResultUtils;
import com.lyn.customer.api.entity.CustomerInfo;
import com.lyn.customer.api.service.CustomerService;
import com.lyn.goods.api.entity.GoodsInfo;
import com.lyn.goods.api.service.GoodsService;
import com.lyn.order.api.entity.OrderInfo;
import com.lyn.order.api.service.OrderService;
import com.lyn.sys.api.entity.UserInfo;
import com.lyn.sys.api.service.SysService;
import com.lyn.sys.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@Controller
@RestController
@RequestMapping("/api/lyn/")
public class BaseController {

    @Reference(version = "1.0.0")
    private SysService sysService;

    @Reference(version = "1.0.0")
    private UserService userService;

    @Reference(version = "1.0.0")
    private CustomerService customerService;

    @Reference(version = "1.0.0")
    private GoodsService goodsService;

    @Reference(version = "1.0.0")
    private OrderService orderService;

    @Autowired
    private CacheService cacheService;

    @RequestMapping(value = "sys", method = RequestMethod.GET)
    public Object testSys(HttpServletRequest request) {
        String name = request.getParameter("name");
        return sysService.test(name);
    }

    @RequestMapping(value = "cust", method = RequestMethod.GET)
    public Object testCust(HttpServletRequest request) {
        String name = request.getParameter("name");
        return customerService.test(name);
    }

    @RequestMapping(value = "goods", method = RequestMethod.GET)
    public Object testGoods(HttpServletRequest request) {
        String name = request.getParameter("name");
        return goodsService.test(name);
    }

    @RequestMapping(value = "order", method = RequestMethod.GET)
    public Object testOorder(HttpServletRequest request) {
        String name = request.getParameter("name");
        return orderService.test(name);
    }

    @RequestMapping(value = "userinfo", method = RequestMethod.GET)
    public Object user(HttpServletRequest request) throws Exception {
        String userId = request.getParameter("id");
        UserInfo user = userService.findUserInfoById(Integer.parseInt(userId));
        return ResultUtils.success(user);
    }

    @RequestMapping(value = "customerinfo", method = RequestMethod.GET)
    public Object customer(HttpServletRequest request) throws Exception {
        String customerId = request.getParameter("id");
        CustomerInfo customerInfo = customerService.findCustomerInfoByPrimary(Integer.parseInt(customerId));
        return ResultUtils.success(customerInfo);
    }

    @RequestMapping(value = "goodsinfo", method = RequestMethod.GET)
    public Object goods(HttpServletRequest request) throws Exception {
        String id = request.getParameter("id");
        GoodsInfo goods = (GoodsInfo) cacheService.getCacheByKey("lyn_goods:"+id);
        if(null == goods){
            goods = goodsService.findGoodsInfoByPrimary(Integer.parseInt(id));
            cacheService.setCacheToRedis("lyn_goods:"+id,goods,1800);
        }
        return ResultUtils.success(goods);
    }

    @RequestMapping(value = "orderinfo", method = RequestMethod.GET)
    public Object order(HttpServletRequest request) throws Exception {
        String id = request.getParameter("id");
        OrderInfo order = orderService.findOrderInfoByPromary(Integer.parseInt(id));
        return ResultUtils.success(order);
    }
}