package com.xub.springcloud.study.turbine.turbine_service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author liqingxu
 * @desc TurbineServiceBApplication
 * @date 2021/6/7 15:02
 */
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class TurbineServiceBApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineServiceBApplication.class, args);
    }
}
