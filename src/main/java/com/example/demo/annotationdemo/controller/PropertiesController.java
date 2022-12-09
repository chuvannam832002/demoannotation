package com.example.demo.annotationdemo.controller;

import com.example.demo.annotationdemo.service.PropertiesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    private PropertiesService propertiesService;

    public PropertiesController(PropertiesService propertiesService) {
        this.propertiesService = propertiesService;
    }
    @RequestMapping(value ="/properties",method = RequestMethod.GET)
    public String getproperties(){
        return propertiesService.getproperties();
    }
}
