package com.gd.springapp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gd.springapp.beans.Address;
import com.gd.springapp.beans.Employee;

public class TestMain1 {

	public static void main(String[] args) {
		// Load the bean config
		Resource resource = new ClassPathResource("beans.xml");

		// Get the bean factory
		BeanFactory factory = new XmlBeanFactory(resource);

		// Get the bean object
		Employee emp = (Employee) factory.getBean("employee");
		Address address = (Address) factory.getBean("homeAddressId");

		// Display bean object state
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Salary : " + emp.getSalary());

		System.out.println("Door No : " + address.getDoorNo());
		System.out.println("Street Name : " + address.getStreetName());
		System.out.println("City : " + address.getCity());
	}

}
