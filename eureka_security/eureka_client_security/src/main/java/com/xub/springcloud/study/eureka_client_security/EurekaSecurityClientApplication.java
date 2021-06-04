package com.xub.springcloud.study.eureka_client_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqingxu
 * @desc Application
 * @date 2021/6/2 14:35
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaSecurityClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecurityClientApplication.class, args);
    }
}
