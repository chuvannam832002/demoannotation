package com.example.demo.annotationdemo.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    GirlReposirity girlReposirity;
    public Girl findgirlbyiduppercase(int id) {
        Girl girl = girlReposirity.findbyid(id);
        girl.setName(girl.getName().toUpperCase());
        return  girl;
    }
}
