package com.xub.springcloud.study.sleuth.sleuth_service_b;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqingxu
 * @desc ZipkinServiceBApplication
 * @date 2021/6/7 11:03
 */
@SpringBootApplication
public class SleuthServiceBApplication {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    public static void main(String[] args) {
        SpringApplication.run(SleuthServiceBApplication.class, args);
    }
}
