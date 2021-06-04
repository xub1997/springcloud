package com.xub.springcloud.study.zuul.zuul_hi_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqingxu
 * @desc ZuulHiServiceApplication
 * @date 2021/6/4 10:15
 */
@EnableEurekaClient
@SpringBootApplication
public class ZuulHiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulHiServiceApplication.class, args);
    }
}
