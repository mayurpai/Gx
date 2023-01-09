package di.annotation.example_4;

//import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	// Instance variables
	private int employeeId;
	private String employeeName;
	private double salary;

	// Use autowired and understand the difference
	@Autowired
	private Address homeAddress;

	// Parameterized Constructor
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "] \n"
				+ "Home Address : " + homeAddress + "\n";
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

//	@Resource
	@Qualifier("homeAddressBean")
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
}
