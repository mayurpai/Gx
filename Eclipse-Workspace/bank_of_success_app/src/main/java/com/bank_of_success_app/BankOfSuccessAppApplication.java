package com.bank_of_success_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_of_success_app.model.Savings;

@RestController
@SpringBootApplication
public class BankOfSuccessAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOfSuccessAppApplication.class, args);
		Savings savings = new Savings();
		savings.setDateOfBirth("2021-11-13");
		System.out.println(savings.getDateOfBirth());
		System.out.println(savings.ageValidation());
		System.out.println("Bank Of Success Application Is Up & Running!");
	}

}
