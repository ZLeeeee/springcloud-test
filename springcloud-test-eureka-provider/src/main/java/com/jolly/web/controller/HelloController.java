package com.jolly.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class HelloController {
    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/hello")
    public String hello(){
        log.info("/hello:");
        return "hello";
    }
}
