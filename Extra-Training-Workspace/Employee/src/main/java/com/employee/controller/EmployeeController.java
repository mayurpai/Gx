package com.employee.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotExist;
import com.employee.exception.NoEmployeeListExist;
import com.employee.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("employee/api/v1")
public class EmployeeController {

	@Autowired
	Employee employee;

	@Autowired
	EmployeeService employeeService;

	@PostMapping("POST")
	public ResponseEntity<String> saveEmployee() {
		ResponseEntity<String> responseEntity;
		String message;
		try {
			message = employeeService.saveEmployee();
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (FileNotFoundException e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		} catch (IOException e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@GetMapping("GET")
	public ResponseEntity<?> getAllEmployee() {
		List<Employee> employee;
		ResponseEntity<List<Employee>> responseEntity;
		ResponseEntity<String> responseEntityString;
		try {
			employee = employeeService.getAllEmployees();
			responseEntity = new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
			return responseEntity;
		} catch (NoEmployeeListExist e) {
			String errorMessage = e.getMessage();
			responseEntityString = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
			e.printStackTrace();
			return responseEntityString;
		}
	}

	@DeleteMapping("DELETE")
	public ResponseEntity<String> deleteAllEmployee() throws EmployeeNotExist {
		String message;
		ResponseEntity<String> responseEntity = null;
		try {
			message = employeeService.deleteAllEmployees();
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@DeleteMapping("DELETE/{employeeNumber}")
	public ResponseEntity<String> deleteEmployeeByEmployeeNumber(@PathVariable("employeeNumber") int employeeNumber) {
		ResponseEntity<String> responseEntity = null;
		String message;
		try {
			message = employeeService.deleteEmployee(employeeNumber);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} catch (EmployeeNotExist e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}

	@GetMapping("GET/{employeeNumber}")
	public ResponseEntity<?> getEmployeeByEmployeeNumber(@PathVariable("employeeNumber") int employeeNumber) {
		ResponseEntity<?> responseEntity = null;
		try {
			employee = employeeService.getEmployeeByEmployeeNumber(employeeNumber);
			responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (EmployeeNotExist e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntity;
	}

	@GetMapping("GET/sortByNameAscending")
	public ResponseEntity<?> getEmployeeDataInSortedOrderOfNameAscending() {
		List<Employee> employee;
		ResponseEntity<List<Employee>> responseEntity;
		ResponseEntity<String> responseEntityString;
		try {
			employee = employeeService.sortByNameAscending();
			responseEntity = new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
			return responseEntity;
		} catch (NoEmployeeListExist e) {
			String errorMessage = e.getMessage();
			responseEntityString = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
			e.printStackTrace();
			return responseEntityString;
		}
	}

	@GetMapping("GET/sortByEmployeeSalaryDescending")
	public ResponseEntity<?> getEmployeeDataInSortedOrderOfSalaryDescending() {
		Stream<Employee> employee;
		ResponseEntity<Stream<Employee>> responseEntity;
		ResponseEntity<String> responseEntityString;
		try {
			employee = employeeService.sortByEmployeeSalaryDescending();
			responseEntity = new ResponseEntity<Stream<Employee>>(employee, HttpStatus.OK);
			return responseEntity;
		} catch (NoEmployeeListExist e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntityString = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
			return responseEntityString;
		}
	}

	@GetMapping("GET/sortByEmployeeSalaryAscending")
	public ResponseEntity<?> getEmployeeDataInSortedOrderOfSalaryAscending() {
		Stream<Employee> employee;
		ResponseEntity<Stream<Employee>> responseEntity;
		ResponseEntity<String> responseEntityString;
		try {
			employee = employeeService.sortByEmployeeSalaryDescending();
			responseEntity = new ResponseEntity<Stream<Employee>>(employee, HttpStatus.OK);
			return responseEntity;
		} catch (NoEmployeeListExist e) {
			String errorMessage = e.getMessage();
			e.printStackTrace();
			responseEntityString = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
			return responseEntityString;
		}
	}

}
