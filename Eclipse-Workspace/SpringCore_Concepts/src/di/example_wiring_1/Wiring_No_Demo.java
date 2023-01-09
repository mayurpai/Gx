package di.example_wiring_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Wiring_No_Demo {

	public static void main(String[] args) {
		// Get bean object auto-wiring : no
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_wiring_no.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		
		System.out.println(employee);

	}

}
