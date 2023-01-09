package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody
@RestController
public class HelloWorldController {

    // GET HTTP Method
    // http://localhost:8080/hello-world

    // @GetMapping Is Used To Create A REST API
    // Several Other Ones Are: @DeleteMapping, @PostMapping, @PutMapping

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
