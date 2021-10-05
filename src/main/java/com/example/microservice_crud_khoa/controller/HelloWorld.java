package com.example.microservice_crud_khoa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
//    @Value("${Welcome Y}")
//    private String welcome;

    @GetMapping("/")
    public String helloWorld(){
        return "welcome";
    }

}
