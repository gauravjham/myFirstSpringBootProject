package com.example.myFirstSpringBootProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World !!!!!";
    }
}
