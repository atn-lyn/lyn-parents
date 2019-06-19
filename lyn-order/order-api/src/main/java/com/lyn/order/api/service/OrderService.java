package com.lyn.order.api.service;

import com.lyn.order.api.entity.OrderInfo;

public interface OrderService {

    String test(String name);

    OrderInfo findOrderInfoByPromary(Integer orderId) throws Exception;
}
