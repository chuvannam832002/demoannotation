package com.example.demo.annotationdemo.main;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    int id ;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
