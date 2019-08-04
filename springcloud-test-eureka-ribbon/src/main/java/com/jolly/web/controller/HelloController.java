package com.jolly.web.controller;

import com.jolly.web.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
@Slf4j
public class HelloController {
    @Autowired
    HelloService service;
    @GetMapping("/hello")
    public String hello(){
        log.info("/hello:ribbon");
        return service.hello();
    }

}
