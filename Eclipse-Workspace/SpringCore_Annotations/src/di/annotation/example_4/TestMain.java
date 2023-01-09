package di.annotation.example_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get bean object
		// Use suppress warning annotations and understand the difference
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_4.xml");
		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee);

	}

}
