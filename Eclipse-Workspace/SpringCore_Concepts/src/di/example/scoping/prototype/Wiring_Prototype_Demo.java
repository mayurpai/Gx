package di.example.scoping.prototype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Wiring_Prototype_Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_prototype.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);

		employee.setSalary(30000);
		System.out.println(employee);
		
		employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
