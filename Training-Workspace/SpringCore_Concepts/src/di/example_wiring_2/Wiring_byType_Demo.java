package di.example_wiring_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Wiring_byType_Demo {

	public static void main(String[] args) {
		// Get bean object with auto-wiring mode : byType
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_byType.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		
		System.out.println(employee);

	}

}
