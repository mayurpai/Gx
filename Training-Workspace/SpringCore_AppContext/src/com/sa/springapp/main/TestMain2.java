package com.sa.springapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sa.springapp.beans.Address;
import com.sa.springapp.beans.Employee;

public class TestMain2 {

	public static void main(String[] args) {
		// Load the bean context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Get the bean object
		Employee emp = (Employee) context.getBean("employee");
		Address address = (Address) context.getBean("address");

		// Display bean object state
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());

		System.out.println("Door No : " + address.getDoorNo());
		System.out.println("Street Name : " + address.getStreetName());
		System.out.println("City : " + address.getCity());

	}

}
