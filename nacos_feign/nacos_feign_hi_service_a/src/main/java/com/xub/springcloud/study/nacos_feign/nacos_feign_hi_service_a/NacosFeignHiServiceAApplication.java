package com.xub.springcloud.study.nacos_feign.nacos_feign_hi_service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosFeignHiServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignHiServiceAApplication.class, args);
    }
}
