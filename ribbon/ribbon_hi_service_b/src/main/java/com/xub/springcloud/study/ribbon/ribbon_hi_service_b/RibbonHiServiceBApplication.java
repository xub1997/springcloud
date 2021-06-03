package com.xub.springcloud.study.ribbon.ribbon_hi_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonHiServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHiServiceBApplication.class, args);
    }
}
