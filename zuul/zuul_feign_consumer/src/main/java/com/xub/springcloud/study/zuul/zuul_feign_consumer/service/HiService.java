package com.xub.springcloud.study.zuul.zuul_feign_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "zuul-hi-service")
public interface HiService {

    @GetMapping("/hi/{name}")
    String hi(@PathVariable("name") String name);
}
