package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.targus.Bag;
import com.training.targus.Bill;
import com.training.targus.Customer;
import com.training.targus.Employee;
import com.training.targus.NoError;
import com.training.targus.Orders;
// SpringBootApplication Scans The Packages And It's Child
// @SpringBootApplication(scanBasePackages = "com.targus") // This Scans Only com.targus And Create Bean Only For That
// Package

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ProductAppGalaxeBatch1Application {
    
    @GetMapping
    public String homePage() {
        return "Hi Mayur";
    }

    @GetMapping("/welcome")
    public String home() {
        return "Hi GalaxE";
    }

    @Autowired(required = false)
    // Asking Spring Framework To Inject Bean 'Payment'
    // Object Is Created By Spring Framework
    // We Don't Have To Use new Keyword
    Payment payment;
    @Autowired(required = false)
    // Spring Won't Scan All Packages, Hence Bean Won't Get Created Unless You Use
    // @SpringBootApplication(scanBasePackages = "com.targus") Or Make It The Child
    // Making Child Is The Best Way
    Bag bag;
    @Autowired(required = false)
    Bill bill;
    @Autowired(required = false)
    Customer customer;
    @Autowired(required = false)
    Employee employee;
    @Autowired(required = false)
    Orders orders;
    @Autowired(required = false)
    NoError noError; // This Will Make The App Run Even If Bean Isn't Created
    // If Bean Is Created Then It Will Work
    // That Is Done By Writing @Component In The Respected Class
    // It Is A Good Practice To Write (required = false) For All @Autowired

    @GetMapping("/payment")
    public String payment() {
        return payment.pay();
    }

    @GetMapping("/bag")
    public String bag() {
        return bag.getDetails();
    }

    @GetMapping("/bill")
    public String bill() {
        return bill.getDetails();
    }

    @GetMapping("/customer")
    public String customer() {
        return customer.getDetails();
    }

    @GetMapping("/employee")
    public String employee() {
        return employee.getDetails();
    }

    @GetMapping("/orders")
    public String orders() {
        return orders.getDetails();
    }
    
    @GetMapping("/noerror")
    public String noerror() {
        return noError.getDetails();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductAppGalaxeBatch1Application.class, args);
    }

}
