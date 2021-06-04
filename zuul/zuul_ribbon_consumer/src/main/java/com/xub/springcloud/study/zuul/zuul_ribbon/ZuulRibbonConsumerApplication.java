package com.xub.springcloud.study.zuul.zuul_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqingxu
 * @desc ZuulRibbonApplication
 * @date 2021/6/4 9:54
 */
@EnableEurekaClient
@SpringBootApplication
public class ZuulRibbonConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulRibbonConsumerApplication.class, args);
    }
}
