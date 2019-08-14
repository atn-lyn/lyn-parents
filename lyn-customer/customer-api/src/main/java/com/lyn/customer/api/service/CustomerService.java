package com.lyn.customer.api.service;

import com.lyn.customer.api.entity.CustomerInfo;

public interface CustomerService {

    String test(String name);

    CustomerInfo findCustomerInfoByPrimary(Integer customerId) throws Exception;
}
