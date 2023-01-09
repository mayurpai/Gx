package com.employee.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotExist;
import com.employee.exception.NoEmployeeListExist;

public interface EmployeeService {
	public List<Employee> getAllEmployees() throws NoEmployeeListExist;

	public boolean isEmployeeExists(int employeeNumber);

	public String saveEmployee() throws IOException, FileNotFoundException;

	public String deleteEmployee(int employeeNumber) throws EmployeeNotExist;
	
	public String deleteAllEmployees() throws NoEmployeeListExist;

	public Employee getEmployeeByEmployeeNumber(int employeeNumber) throws EmployeeNotExist;

	public List<Employee> sortByNameAscending() throws NoEmployeeListExist;

	public Stream<Employee> sortByEmployeeSalaryDescending() throws NoEmployeeListExist;

	public Stream<Employee> sortByEmployeeSalaryAscending() throws NoEmployeeListExist;
}
