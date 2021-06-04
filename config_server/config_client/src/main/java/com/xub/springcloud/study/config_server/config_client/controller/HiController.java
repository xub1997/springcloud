package com.xub.springcloud.study.config_server.config_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqingxu
 * @desc HiController
 * @date 2021/6/4 14:25
 */
@RestController
public class HiController {

    @Autowired
    private Environment environment;

    @GetMapping("/hi")
    public String hi(){
        return environment.getProperty("config");
    }
}
