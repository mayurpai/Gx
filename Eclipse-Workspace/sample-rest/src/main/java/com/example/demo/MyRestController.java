package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@CrossOrigin(origins = "*")
public class MyRestController {

    @GetMapping("/")
    public Greeting greeting() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Good Morning");
        return greeting;
    }
}