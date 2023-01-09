package di.example.configure1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	// Instance variables
	private int employeeId;
	private String employeeName;
	private double salary;

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
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing afterPropertiesSet");
				System.out.println(toString());
		//
		//
		salary = (salary >10000) ? salary : 10000;
		System.out.println("Initialization code is being executed");	
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Cleanup code is being executed"); 
		
	}
}
