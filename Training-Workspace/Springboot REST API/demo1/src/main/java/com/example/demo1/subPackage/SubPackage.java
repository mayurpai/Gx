package com.example.demo1.subPackage;

import org.springframework.stereotype.Component;

@Component
public class SubPackage {
    public String getMessage() {
        return "Hello SubPackage!";
    }
}
