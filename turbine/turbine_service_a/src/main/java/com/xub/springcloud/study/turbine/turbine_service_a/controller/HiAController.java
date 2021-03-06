package com.xub.springcloud.study.turbine.turbine_service_a.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqingxu
 * @desc HiController
 * @date 2021/6/7 14:10
 */
@RestController
public class HiAController {

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam(value = "name",defaultValue = "") String name) {
        return "hi " + name + " ,i am turbine service a";
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
