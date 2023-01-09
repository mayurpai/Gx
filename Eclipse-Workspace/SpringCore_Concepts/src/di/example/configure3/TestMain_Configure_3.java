package di.example.configure3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.example.configure3.Employee;

public class TestMain_Configure_3 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_configure_3.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		context.registerShutdownHook();
	}
}
