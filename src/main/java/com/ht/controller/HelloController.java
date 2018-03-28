package com.ht.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ht.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth Qiu
 * @time 2018/3/28
 **/

@RestController
@RequestMapping("hello")
public class HelloController {

    //因为要调用远端的服务  所以要使用阿里巴巴提供的@Reference注解
    @Reference
    private HelloService helloService;

    @RequestMapping("sayhello")
    public String sayhello(){

        return helloService.sayHello("world");
    }

}
