package di.annotation.example_9;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// Load the bean context
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		// Get the bean object
		Employee emp = context.getBean("employee", Employee.class);

		// Create employee service
		EmployeeService service = context.getBean("empService", EmployeeService.class);

		// add an employee using employee service
		service.addEmployee(emp);

		// Check number of employees added
		List<Employee> employees = service.getAllEmployees();

		System.out.println("Size is " + employees.size());

		// Display employees stored in service
		for (Employee employee : employees) {

			System.out.println(employee);

		}

	}

}
