package com.cmd.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cmd.hackathon.mapper.ClinicMapper;
import com.cmd.hackathon.mapper.ClinicMapperImpl;

@SpringBootApplication
public class ConnectMyDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMyDocApplication.class, args);
		System.out.println("Connect my doc is running on port number 9092");
	}

	@Bean
	public ClinicMapper getmapper() {
		return  new ClinicMapperImpl();
	}
}
