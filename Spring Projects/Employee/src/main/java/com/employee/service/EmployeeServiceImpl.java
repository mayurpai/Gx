package com.employee.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotExist;
import com.employee.exception.NoEmployeeListExist;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() throws NoEmployeeListExist {
		List<Employee> employees = employeeRepository.findAll();
		if (!employees.isEmpty()) {
			return employees;
		} else {
			throw new NoEmployeeListExist("No Employees Exists!");
		}
	}

	@Override
	public boolean isEmployeeExists(int employeeNumber) {
		Optional<Employee> employee = Optional.ofNullable(employeeRepository.findByEmployeeNumber(employeeNumber));
		return employee.isPresent();
	}

	@Override
	public String saveEmployee() throws IOException, FileNotFoundException {
		String line = "";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/Employee.csv"));
			try {
				while ((line = bufferedReader.readLine()) != null) {
					String[] employeeData = line.split(",");
//					employeeNumber,employeeName,employeeMobileNumber,employeeSalary,employeeGender,hireDate
					Employee e = new Employee(Integer.parseInt(employeeData[0]), employeeData[1],
							Long.parseLong(employeeData[2]), Double.parseDouble(employeeData[3]), employeeData[4],
							LocalDate.parse(employeeData[5], dateTimeFormatter));
					employeeRepository.save(e);
				}
			} catch (IOException e) {
				return e.getMessage();

			}
		} catch (FileNotFoundException e) {
			return e.getMessage();
		}
		return "CSV File Successfully Posted";
	}

	@Override
	public String deleteEmployee(int employeeNumber) throws EmployeeNotExist {
		if (isEmployeeExists(employeeNumber)) {
			employeeRepository.findByEmployeeNumber(employeeNumber);
			employeeRepository.deleteById(employeeNumber);
			return "Employee " + employeeNumber + " Deleted Successfully";
		} else {
			throw new EmployeeNotExist("No Such Employee With " + employeeNumber + " Exists!");

		}
	}

	@Override
	public Employee getEmployeeByEmployeeNumber(int employeeNumber) throws EmployeeNotExist {
		if (isEmployeeExists(employeeNumber)) {
			return employeeRepository.findByEmployeeNumber(employeeNumber);
		} else {
			throw new EmployeeNotExist("No Such Employee With " + employeeNumber + " Exists!");
		}

	}

	@Override
	public List<Employee> sortByNameAscending() throws NoEmployeeListExist {
		List<Employee> sortedEmployeesListByNameAscending = new ArrayList<Employee>();
		List<Employee> employees = getAllEmployees();
		if (!employees.isEmpty()) {
			Collections.sort(employees, (Employee objectOne,
					Employee objectTwo) -> (objectOne.getEmployeeName().compareTo(objectTwo.getEmployeeName())));
//		Collections.sort(employees, new SortByNameAscending());
			Iterator<Employee> employeeSortedByName = employees.iterator();
			while (employeeSortedByName.hasNext()) {
				sortedEmployeesListByNameAscending.add(employeeSortedByName.next());
			}
		} else {
			throw new NoEmployeeListExist("No Employees Exists!");
		}
		return sortedEmployeesListByNameAscending;
	}

	@Override
	public Stream<Employee> sortByEmployeeSalaryDescending() throws NoEmployeeListExist {
		List<Employee> employees = getAllEmployees();
		if (!employees.isEmpty()) {
			Stream<Employee> sortedEmployeesListBySalaryDescending = employees.stream()
					.sorted(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed());
			return sortedEmployeesListBySalaryDescending;
		} else {
			throw new NoEmployeeListExist("No Employees Exists!");
		}
	}

	@Override
	public Stream<Employee> sortByEmployeeSalaryAscending() throws NoEmployeeListExist {
		List<Employee> employees = getAllEmployees();
		if (!employees.isEmpty()) {
			Stream<Employee> sortedEmployeesListBySalaryDescending = employees.stream()
					.sorted(Comparator.comparingDouble(Employee::getEmployeeSalary));
			return sortedEmployeesListBySalaryDescending;
		} else {
			throw new NoEmployeeListExist("No Employees Exists!");
		}
	}

	@Override
	public String deleteAllEmployees() throws NoEmployeeListExist {
		List<Employee> employees = getAllEmployees();
		if (!employees.isEmpty()) {
			employeeRepository.deleteAll();
			return "All Details Deleted Successfully";
		} else {
			throw new NoEmployeeListExist("No Employees Exists!");
		}
	}

}
