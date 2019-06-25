package com.lyn.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.lyn.web","com.lyn.common"})
@ServletComponentScan(basePackages = "com.lyn.web.filter")
@Import(FdfsClientConfig.class)
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
