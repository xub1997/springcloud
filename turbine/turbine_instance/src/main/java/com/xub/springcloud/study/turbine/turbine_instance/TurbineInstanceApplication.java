package com.xub.springcloud.study.turbine.turbine_instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author liqingxu
 * @desc TurbineInstanceApplication
 * @date 2021/6/7 15:01
 */
@EnableCircuitBreaker
@EnableTurbine
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class TurbineInstanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineInstanceApplication.class, args);
    }
}
