package com.xub.springcloud.study.turbine.turbine_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liqingxu
 * @desc TurbineEurekaServerApplication
 * @date 2021/6/7 15:00
 */
@EnableEurekaServer
@SpringBootApplication
public class TurbineEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineEurekaServerApplication.class, args);
    }
}
