package di.example_wiring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Wiring_Constructor_Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_wiring_constructor.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		
		System.out.println(employee);

	}

}
