package com.sa.springapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sa.springapp.beans.Address;
import com.sa.springapp.beans.Employee;

@Configuration
public class SpringConfiguration {

	@Bean("employee")
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean("address")
	public Address getAddress() {
		return new Address();
	}

}
