package com.example.demo1;

import com.example.demo1.subPackage.SubPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
		SubPackage component = applicationContext.getBean(SubPackage.class);
		System.out.println(component.getMessage());
		System.out.println("Hello World!");
	}

}
