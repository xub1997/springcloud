package com.xub.springcloud.study.hystrix_feign.hystrix_feign_consumer.service;

import com.xub.springcloud.study.hystrix_feign.hystrix_feign_consumer.service.impl.HiHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ribbon-hi-service", fallback = HiHystrixServiceImpl.class)
public interface HiService {

    @GetMapping("/hi/{name}")
    String hi(@PathVariable("name") String name);
}
