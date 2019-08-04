package com.jolly.web.service.impl;

import com.jolly.web.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloServiceHy implements HelloService {
    @Override
    public String hello() {
        return "error";
    }
}
