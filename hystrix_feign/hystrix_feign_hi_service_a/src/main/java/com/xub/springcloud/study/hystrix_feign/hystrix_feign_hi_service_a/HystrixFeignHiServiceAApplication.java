package com.xub.springcloud.study.hystrix_feign.hystrix_feign_hi_service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HystrixFeignHiServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignHiServiceAApplication.class, args);
    }
}
