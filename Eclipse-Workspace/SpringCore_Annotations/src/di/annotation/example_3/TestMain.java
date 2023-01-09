package di.annotation.example_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get bean object
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_3.xml");

		// Get the employee
		Employee employee = (Employee) context.getBean("employee");

		// Display the employee details
		System.out.println(employee);

	}

}
