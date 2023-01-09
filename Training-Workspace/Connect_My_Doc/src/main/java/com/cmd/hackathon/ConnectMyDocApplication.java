package com.cmd.hackathon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cmd.hackathon.mapper.ClinicMapper;
import com.cmd.hackathon.mapper.ClinicMapperImpl;

@SpringBootApplication
public class ConnectMyDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectMyDocApplication.class, args);
		System.out.println("Connect My Doc Application Running!");
	}
	
	@Bean
	public ClinicMapper getmapper() {
		return new ClinicMapperImpl();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//	}

//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}

}
