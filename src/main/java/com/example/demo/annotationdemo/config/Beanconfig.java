package com.example.demo.annotationdemo.config;

import com.example.demo.annotationdemo.bean.FirstBean;
import com.example.demo.annotationdemo.bean.SecondBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class Beanconfig {
    @Lazy
    @Bean
    public FirstBean firstBean(){
        return new FirstBean();
    }
    @Bean
    public SecondBean secondBean(){
        return new SecondBean();
    }
}
