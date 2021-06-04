package com.xub.springcloud.study.config_server.config_server_instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liqingxu
 * @desc ConfigServerApplication
 * @date 2021/6/4 14:10
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerInstanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerInstanceApplication.class, args);
    }
}
