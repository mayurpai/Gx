package di.example_wiring_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Wiring_byName_Demo {

	public static void main(String[] args) {
		// Get bean object with auto-wiring mode : byName
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_byName.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		
		System.out.println(employee);

	}

}
