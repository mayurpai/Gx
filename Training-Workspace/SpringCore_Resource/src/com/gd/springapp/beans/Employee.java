package com.gd.springapp.beans;

public class Employee {
	// Identify Fields /Instance Variables
	private long id;
	private String name;
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
