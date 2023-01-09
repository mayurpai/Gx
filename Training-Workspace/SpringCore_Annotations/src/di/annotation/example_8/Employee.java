package di.annotation.example_8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	// Instance variables
	private int employeeId;
	private String employeeName;
	private double salary;
	
	private MessageSource messageSource;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
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
		return "\nEmployee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "] \n";
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		String propertyId = messageSource.getMessage("propertyEmpId", null, "101", null);
		String propertyName = messageSource.getMessage("propertyEmpName", null, "Chandra", null);
		String propertySalary = messageSource.getMessage("propertySalary", null, "15000", null);
		
		int empId = Integer.parseInt(propertyId);
		double salary = Double.parseDouble(propertySalary);
		this.employeeId = empId;
		this.employeeName = propertyName;
		this.salary = salary;
		
	}

	@PostConstruct
	public void myInit() {
		System.out.println("@PostConstruct invoked to Initialize Employee Bean");
	}
	
	@PreDestroy	
	public void myDestroy() {
		System.out.println("@PreDestroy invoked for cleaning up the resources consumed by Bean if any");
	}

}
