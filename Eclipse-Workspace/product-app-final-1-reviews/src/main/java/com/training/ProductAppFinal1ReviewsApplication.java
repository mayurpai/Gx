package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
//@CrossOrigin("*")
@EnableFeignClients
public class ProductAppFinal1ReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinal1ReviewsApplication.class, args);
		System.out.println("Reviews App Running");
	}

}

// Actuator Is Used For Monitoring Purpose / Expose Operational Information
// Use Case: How Many Beans Are Available? 
// (List Of Stuffs That Can Be Done Using The Actuators) 
// http://localhost:9091/actuator Will Give Us A List Of Actuator Details Running Over The App
// http://localhost:9091/actuator/* -> * Can Be Anything That Is Available As A End Point In The Actuator
// http://localhost:9091/actuator/health -> To Get Status (UP)