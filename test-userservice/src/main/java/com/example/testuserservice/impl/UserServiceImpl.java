package com.example.testuserservice.impl;

import com.example.testapi.service.service.SaleService;
import com.example.testapi.service.userservice.UserService;
import com.example.testuserservice.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;//从bean工厂中取出
    @Override
    public void buySomeThing(String productId) throws Exception{
        ValueOperations<String, Person> operations = redisTemplate.opsForValue();

    }
}
