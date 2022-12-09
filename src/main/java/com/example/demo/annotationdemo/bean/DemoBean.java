package com.example.demo.annotationdemo.bean;

public class DemoBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public  void init(){
        System.out.println("do something");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
