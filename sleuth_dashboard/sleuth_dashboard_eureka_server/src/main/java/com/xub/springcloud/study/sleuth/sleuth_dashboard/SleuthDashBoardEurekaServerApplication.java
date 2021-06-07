package com.xub.springcloud.study.sleuth.sleuth_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqingxu
 * @desc SleuthDashBoardEurekaServerApplication
 * @date 2021/6/7 14:03
 */
@EnableEurekaServer
@SpringBootApplication
public class SleuthDashBoardEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthDashBoardEurekaServerApplication.class, args);
    }
}
