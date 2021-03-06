package com.xub.springcloud.study.hystrix_feign.hystrix_feign_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HystrixFeignEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignEurekaServerApplication.class, args);
    }

}
