package com.lyn.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyn.order.api.entity.OrderInfo;
import com.lyn.order.api.service.OrderService;
import com.lyn.order.service.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public String test(String name) {
        return "Hello,"+name+",this is a message from the order module";
    }

    @Override
    public OrderInfo findOrderInfoByPromary(long orderId) throws Exception {
        return orderInfoMapper.selectByPrimaryKey(orderId);
    }
}