package com.example.demo.annotationdemo.model;

import org.springframework.stereotype.Component;

@Component
public class TestModel {
    private int id;
    private String Name;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
