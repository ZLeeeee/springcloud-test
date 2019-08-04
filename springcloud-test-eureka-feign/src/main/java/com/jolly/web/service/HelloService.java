package com.jolly.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-service")
@RequestMapping(value = "/test")
public interface HelloService {
    @GetMapping(value = "/hello")
    String hello();
}
