package com.lyn.sys.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configurable
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.lyn.sys"})
public class SysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class,args);
    }
}
