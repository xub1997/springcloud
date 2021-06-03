package com.xub.springcloud.study.hystrix_feign.hystrix_feign_consumer.service.impl;

import com.xub.springcloud.study.hystrix_feign.hystrix_feign_consumer.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @author liqingxu
 * @desc HiServiceImpl
 * @date 2021/6/3 11:52
 */
@Service
public class HiHystrixServiceImpl implements HiService {
    @Override
    public String hi(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
