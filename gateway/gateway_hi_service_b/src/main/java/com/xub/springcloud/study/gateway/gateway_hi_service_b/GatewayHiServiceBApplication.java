package com.xub.springcloud.study.gateway.gateway_hi_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayHiServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayHiServiceBApplication.class, args);
    }
}
