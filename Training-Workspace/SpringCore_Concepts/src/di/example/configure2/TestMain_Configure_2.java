package di.example.configure2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain_Configure_2 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_configure_2.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		context.registerShutdownHook();
	}
}
