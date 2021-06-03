package com.xub.springcloud.study.hystrix_ribbon.hystrix_ribbon_consumer.api;

import com.xub.springcloud.study.hystrix_ribbon.hystrix_ribbon_consumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return hiService.hiService(name);
    }
}
