package com.xub.springcloud.study.sleuth.sleuth_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author liqingxu
 * @desc SleuthDashBoardInstanceApplication
 * @date 2021/6/7 14:04
 */
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class SleuthDashBoardInstanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthDashBoardInstanceApplication.class, args);
    }
}
