package com.sa.springapp.beans;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;

@Component("emp")
public class Employee {

	// Instance variables
	@Value("1001")
	private long id;

	@Value("Sowmya Shree B V")
	private String name;

	@Value("1000")
	private float salary;

	// Default Constructor
	public Employee() {
		super();
	}

	// Getter and setter methods
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
