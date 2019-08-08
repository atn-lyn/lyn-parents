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
        // Springboot整合Elasticsearch 在项目启动前设置一下的属性，防止报错
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(WebApplication.class,args);
    }
}
