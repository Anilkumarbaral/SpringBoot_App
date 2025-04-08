package com.example.SpringBoot_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/welcome")
    public String welComeMsg(){
        return "Hello Anil Welcome to IT industry";
    }

    @GetMapping("/greet")
    public String greetMsg(){
        return "HI Anil Good Morning...";
    }
}
