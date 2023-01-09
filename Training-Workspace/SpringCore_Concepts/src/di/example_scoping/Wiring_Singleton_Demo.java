package di.example_scoping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Wiring_Singleton_Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_bean_singleton.xml");
		Employee employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);

		System.out.println("Salary of employee changed : ");
		employee.setSalary(30000);
		System.out.println(employee);
		
		employee = (Employee) context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
