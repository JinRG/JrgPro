package com.example.testuserservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/*
*
* 当加载这个类的时候会加载相应的配置文件，目前只引入了dubbo、mapper接口包扫描的配置
* basePackages表示只扫描该包下面的接口，如果是类则不扫描
* */
@Configuration
@ImportResource(locations={ "classpath:dubbo.xml" })
@MapperScan(basePackages = "com.example.testuserservice.dao")
public class CommonConfig {
}
