package com.lyn.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyn.customer.api.entity.CustomerInfo;
import com.lyn.customer.api.service.CustomerService;
import com.lyn.customer.service.mapper.CustomerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = CustomerService.class)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    @Override
    public String test(String name) {
        return "Hello,"+name+",this is a message from the customer module";
    }

    @Override
    public CustomerInfo findCustomerInfoByPrimary(Integer customerId) throws Exception {
        return customerInfoMapper.selectByPrimaryKey(customerId);
    }
}