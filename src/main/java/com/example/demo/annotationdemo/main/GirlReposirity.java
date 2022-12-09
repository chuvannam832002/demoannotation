package com.example.demo.annotationdemo.main;

import org.springframework.stereotype.Repository;

@Repository
public class GirlReposirity {
    public Girl findbyid(int id) {
        return  new Girl(1,"chunam",20);
    }
}
