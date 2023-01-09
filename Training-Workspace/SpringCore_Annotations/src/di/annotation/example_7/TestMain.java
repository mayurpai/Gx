package di.annotation.example_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get employee details
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_7.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		
		// Configure property example7.properties
		String propertyName = "greeting";
//		String propertyName = "greetin";
		String defaultMessage = "Greeting Message !";
		String finalMessage = context.getMessage(propertyName, null, defaultMessage, null);
		
		System.out.println(finalMessage + " " + employee.getEmployeeName());
	}
}
