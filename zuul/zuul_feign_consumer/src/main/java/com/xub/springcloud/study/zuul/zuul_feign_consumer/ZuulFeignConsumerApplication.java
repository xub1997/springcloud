package com.xub.springcloud.study.zuul.zuul_feign_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liqingxu
 * @desc ZuulFeignApplication
 * @date 2021/6/4 9:52
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ZuulFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFeignConsumerApplication.class, args);
    }
}
