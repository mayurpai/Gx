package di.annotation.example_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get employee details
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_6.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		//Address address = (Address)context.getBean("address");
		//System.out.println(address);
	}
}
