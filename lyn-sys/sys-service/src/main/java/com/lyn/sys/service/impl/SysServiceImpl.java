package com.lyn.sys.service.impl;

import com.lyn.sys.api.service.SysService;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = SysService.class)
public class SysServiceImpl implements SysService {

    @Override
    public String test(String name) {
        return "Hello,"+name+",this is a message from the System module";
    }
}