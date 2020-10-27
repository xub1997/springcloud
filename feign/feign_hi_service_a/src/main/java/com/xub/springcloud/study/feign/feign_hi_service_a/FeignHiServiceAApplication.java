package com.xub.springcloud.study.feign.feign_hi_service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeignHiServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHiServiceAApplication.class, args);
    }
}
