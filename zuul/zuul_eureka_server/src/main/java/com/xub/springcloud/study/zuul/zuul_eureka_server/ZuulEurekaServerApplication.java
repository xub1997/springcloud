package com.xub.springcloud.study.zuul.zuul_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqingxu
 * @desc ZuulEurekaServerApplication
 * @date 2021/6/4 9:40
 */
@EnableEurekaServer
@SpringBootApplication
public class ZuulEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaServerApplication.class, args);
    }
}
