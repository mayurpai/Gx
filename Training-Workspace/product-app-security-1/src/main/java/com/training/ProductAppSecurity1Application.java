package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductAppSecurity1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppSecurity1Application.class, args);
		System.out.println("Product App Security 1 Running");
		
	}

}

//Spring Security
//
//Authorization
//Authentication
//
//Inbuilt: Login Form Based On Login Security
//Custome Login Form

//Use Case: Custom Login Form And Also We Need To Implement Authorization And Authentication
//
//Spring MVC: Model View Controller
//
//RESTCONTROLLER -> JSON -> Another App
//CONTROLLER  -> HTML -> Use
