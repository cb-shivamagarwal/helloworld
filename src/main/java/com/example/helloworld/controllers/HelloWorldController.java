package com.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String viewAllTransactions() {
        return "Hi There";
    }
}
