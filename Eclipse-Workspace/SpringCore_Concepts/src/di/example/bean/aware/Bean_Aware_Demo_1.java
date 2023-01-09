package di.example.bean.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_Aware_Demo_1 {

	public static void main(String[] args) {
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring_bean_aware_1.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
