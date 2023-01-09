package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// REST: REpresentational State Transfer
@RestController
@RequestMapping("Hi")
// This Allows You To Have Same Mapping And URL Changes To // localhost:9090/Hi/welcome
public class WelcomeController {

    public WelcomeController() {    
        // TODO Auto-generated constructor stub
    }

    @GetMapping("/welcome") // localhost:9090/welcome
    // Mapping Should Not Be Same ("/") Is Already There!
    public String home() {
        return "Hi App!";
    }

}
