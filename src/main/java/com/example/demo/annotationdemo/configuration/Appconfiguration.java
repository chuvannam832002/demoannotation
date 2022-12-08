package com.example.demo.annotationdemo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
public class Appconfiguration {
    @Value("${server.port}")
    private String serverport;
    @Value("${intergration.service.url}")
    private String intergurationurl;

    public String getServerport() {
        return serverport;
    }

    public String getIntergurationurl() {
        return intergurationurl;
    }
}
