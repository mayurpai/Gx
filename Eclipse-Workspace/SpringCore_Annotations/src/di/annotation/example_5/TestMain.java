package di.annotation.example_5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// ---------Nothing to edit here just run the TestMain
		// Get bean object
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring_5.xml");
		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee);

		context.registerShutdownHook();
	}
}
