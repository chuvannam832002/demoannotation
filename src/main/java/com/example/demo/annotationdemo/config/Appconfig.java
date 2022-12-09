package com.example.demo.annotationdemo.config;

import com.example.demo.annotationdemo.bean.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Appconfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public DemoBean getdemobean(){
        DemoBean demoBean = new DemoBean();
        demoBean.setMessage("Day la phan demo ve @Bean");
        return demoBean;
    }
}
