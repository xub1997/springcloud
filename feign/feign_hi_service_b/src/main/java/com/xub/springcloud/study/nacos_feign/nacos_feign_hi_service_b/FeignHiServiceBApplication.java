package com.xub.springcloud.study.nacos_feign.nacos_feign_hi_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeignHiServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHiServiceBApplication.class, args);
    }
}
