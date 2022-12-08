package com.example.demo.annotationdemo.service;

import com.example.demo.annotationdemo.configuration.Appconfiguration;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
    Appconfiguration appconfiguration;

    public PropertiesService(Appconfiguration appconfiguration) {
        this.appconfiguration = appconfiguration;
    }

    public String getproperties() {
        return appconfiguration.getIntergurationurl();
    }
}
