package com.xub.springcloud.study.feign.feign_hi_service_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "hi !" + name+",this is service a";
    }
}
