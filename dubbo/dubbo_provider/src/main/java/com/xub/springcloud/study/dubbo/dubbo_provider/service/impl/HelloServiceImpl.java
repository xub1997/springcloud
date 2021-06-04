package com.xub.springcloud.study.dubbo.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xub.springcloud.study.dubbo.dubbo_api.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return String.format("hello, %s", name);
    }
}
