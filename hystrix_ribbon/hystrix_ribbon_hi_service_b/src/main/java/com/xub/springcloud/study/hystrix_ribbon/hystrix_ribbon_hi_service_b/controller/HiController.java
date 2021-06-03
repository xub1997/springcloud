package com.xub.springcloud.study.hystrix_ribbon.hystrix_ribbon_hi_service_b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "hi !" + name+",this is service b";
    }
}
