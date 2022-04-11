package com.xub.springcloud.study.nacos_feign.nacos_feign_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NacosFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignConsumerApplication.class, args);
    }

}
