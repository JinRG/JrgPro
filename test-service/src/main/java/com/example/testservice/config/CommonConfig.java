package com.example.testservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/*
*
* 当加载这个类的时候会加载相应的配置文件，目前只引入了dubbo的配置
* */
@Configuration
@ImportResource(locations={ "classpath:dubbo.xml" })
public class CommonConfig {
}
