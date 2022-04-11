package com.xub.springcloud.study.nacos_feign.nacos_feign_consumer.api;

import com.xub.springcloud.study.nacos_feign.nacos_feign_consumer.service.HiService;
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
        return hiService.hi(name);
    }
}
