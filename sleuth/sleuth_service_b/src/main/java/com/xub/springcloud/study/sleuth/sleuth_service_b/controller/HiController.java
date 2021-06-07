package com.xub.springcloud.study.sleuth.sleuth_service_b.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqingxu
 * @desc HiController
 * @date 2021/6/7 11:17
 */
@RestController
public class HiController {

    private Logger logger = LoggerFactory.getLogger(HiController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String home() {
        return "hi i'm service b!";
    }

    @RequestMapping("/trace")
    public String info() {
        return restTemplate.getForObject("http://localhost:8988/hi", String.class);
    }
}
