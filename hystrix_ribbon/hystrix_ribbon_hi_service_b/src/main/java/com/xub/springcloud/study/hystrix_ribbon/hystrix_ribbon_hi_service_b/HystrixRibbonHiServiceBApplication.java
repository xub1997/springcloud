package com.xub.springcloud.study.hystrix_ribbon.hystrix_ribbon_hi_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HystrixRibbonHiServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixRibbonHiServiceBApplication.class, args);
    }
}
