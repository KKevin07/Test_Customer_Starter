package com.example.test_customer_starter.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("MyApplicationListener... onApplicationEvent...");
    }
}
