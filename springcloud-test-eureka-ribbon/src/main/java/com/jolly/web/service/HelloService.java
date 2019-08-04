package com.jolly.web.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate template;
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(){
        return template.getForObject("http://hello-service/test/hello",String.class);
    }
    public String helloError(){
        return "error";
    }
}
