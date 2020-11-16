package com.xub.springcloud.study.dubbo.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xub.springcloud.study.dubbo.dubbo_api.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable("name")String name){
        return helloService.sayHello(name);
    }
}
