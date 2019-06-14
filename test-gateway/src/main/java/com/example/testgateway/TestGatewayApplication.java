package com.example.testgateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGatewayApplication.class, args);
        log.info("网关启动成功");
    }

}
