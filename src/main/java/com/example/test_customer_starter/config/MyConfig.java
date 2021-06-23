package com.example.test_customer_starter.config;

import com.atguigu.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    //当容器有这个组件时，默认的依赖组件不生效，而是使用自定义的组件
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();

        return helloService;

    }

}
