package com.xub.springcloud.study.gateway.gateway_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GatewayEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEurekaServerApplication.class, args);
    }

}
