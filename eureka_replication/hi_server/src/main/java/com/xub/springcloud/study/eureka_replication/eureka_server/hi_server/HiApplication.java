package com.xub.springcloud.study.eureka_replication.eureka_server.hi_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiApplication.class, args);
    }
}
