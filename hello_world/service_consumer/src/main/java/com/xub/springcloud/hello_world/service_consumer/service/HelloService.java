package com.xub.springcloud.hello_world.service_consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 远程Hello服务客户端
 *
 */
@Component
@FeignClient(value = "HELLO-SERVICE-PROVIDER", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String hello(@PathVariable("name") String name);
}
