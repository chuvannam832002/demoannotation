package com.example.demo.annotationdemo.bean;

import org.springframework.context.annotation.Bean;

public class FirstBean {

    public FirstBean(){
        System.out.println("Bean1");
    }
    public void test(){
        System.out.println("Bean1");
    }
}
