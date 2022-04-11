package com.xub.springcloud.study.nacos_ribbon.nacos_ribbon_hi_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosRibbonHiServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRibbonHiServiceBApplication.class, args);
    }
}
