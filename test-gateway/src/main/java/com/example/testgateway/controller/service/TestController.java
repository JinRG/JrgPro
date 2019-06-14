package com.example.testgateway.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("/setkey/{key}/{value}")
    public String set(@PathVariable("key") String key, @PathVariable("value") String value) throws Exception{
        redisTemplate.opsForValue().set(key,value);
        return "success";
    }

    @RequestMapping("/getkey/{key}")
    public String get(@PathVariable("key") String key) throws Exception {
        return redisTemplate.opsForValue().get(key);
    }
}
