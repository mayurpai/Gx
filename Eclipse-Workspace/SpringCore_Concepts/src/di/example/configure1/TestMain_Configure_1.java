package di.example.configure1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import di.example.configure1.Employee;

public class TestMain_Configure_1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_configure_1.xml"); 
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		context.registerShutdownHook();
	}
}
