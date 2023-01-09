package di.example.context.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_Aware_Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_app_context.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);

	}
}
