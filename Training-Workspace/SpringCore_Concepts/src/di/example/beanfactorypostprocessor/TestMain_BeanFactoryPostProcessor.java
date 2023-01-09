package di.example.beanfactorypostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain_BeanFactoryPostProcessor {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_beanfactorypostprocessor.xml"); 
		Employee employee = (Employee) context.getBean("employee");
		
		
		System.out.println(employee);
		context.registerShutdownHook();
	}
}
