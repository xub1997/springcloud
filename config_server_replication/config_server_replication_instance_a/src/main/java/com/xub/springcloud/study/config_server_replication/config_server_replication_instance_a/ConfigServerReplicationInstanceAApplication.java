package com.xub.springcloud.study.config_server_replication.config_server_replication_instance_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqingxu
 * @desc ConfigServerApplication
 * @date 2021/6/4 14:10
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerReplicationInstanceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerReplicationInstanceAApplication.class, args);
    }
}
