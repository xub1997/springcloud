package com.xub.springcloud.study.config_server_replication.config_replication_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqingxu
 * @desc ConfigClientApplication
 * @date 2021/6/4 14:09
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigReplicationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigReplicationClientApplication.class, args);
    }
}
