package com.example.testuserservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestUserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUserserviceApplication.class, args);
        log.info("testuser模块启动成功");
    }

}
