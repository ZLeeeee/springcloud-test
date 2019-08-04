package com.jolly.web.service;

import com.jolly.web.service.impl.HelloServiceHy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-service",fallback = HelloServiceHy.class)
public interface HelloService {
    @GetMapping(value = "/test/hello")
    String hello();
}
