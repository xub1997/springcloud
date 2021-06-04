package com.xub.springcloud.study.hystrix_ribbon.hystrix_ribbon_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HystrixRibbonEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixRibbonEurekaServerApplication.class, args);
    }

}
