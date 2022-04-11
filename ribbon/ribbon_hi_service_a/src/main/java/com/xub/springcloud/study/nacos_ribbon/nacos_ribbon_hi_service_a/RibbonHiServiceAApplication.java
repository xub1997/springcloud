package com.xub.springcloud.study.nacos_ribbon.nacos_ribbon_hi_service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonHiServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHiServiceAApplication.class, args);
    }
}
