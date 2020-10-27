package com.xub.springcloud.study.eureka_replication.eureka_server.hi_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "hi !" + name;
    }
}
