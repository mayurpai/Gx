package di.example.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain_BeanPostProcessor {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_beanpostprocessor.xml"); 
		Employee employee = (Employee) context.getBean("employee");
		
		
		System.out.println(employee);
		context.registerShutdownHook();
	}
}
