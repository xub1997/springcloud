package com.xub.springcloud.study.feign.feign_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FeignEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaServerApplication.class, args);
    }

}
