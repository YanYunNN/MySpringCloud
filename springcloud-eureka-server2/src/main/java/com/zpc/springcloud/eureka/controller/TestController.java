package com.zpc.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test01")
    public String fun1(){
        return "这是Eureka注册中心！！";
    }
}
