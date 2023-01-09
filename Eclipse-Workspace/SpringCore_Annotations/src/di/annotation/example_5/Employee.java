package di.annotation.example_5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	// Instance variables
	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	@Autowired
	private Address homeAddress;
	
	@Autowired
	private Address officeAddress;
	
	// Parameterized Constructor 
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	//--------------Missing elements-----------//
	//Use the post construct annotation
	@PostConstruct
	public void myInit() {
		System.out.println("@PostConstruct invoked to Initialize Employee Bean");
	}
	
	//Use predestroy annotation
	@PreDestroy
	public void myDestroy() {
		System.out.println("@PreDestroy invoked for cleaning up the resources consumed by Bean if any");
	}
	
	
	// Getter and setter methods
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "] \n" 
				+ "Home Address : " + getHomeAddress() + "\n"
				+ "Office Address : " + getOfficeAddress() + "\n";
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	
}
