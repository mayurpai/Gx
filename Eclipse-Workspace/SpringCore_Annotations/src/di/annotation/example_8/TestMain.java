package di.annotation.example_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Get employee details
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_8.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		
		
		// Configure property example8.properties
		String property1Name = "greeting";
		String property2Name = "details.heading";
		String property3Name = "details.empId";
		String property4Name = "details.empName";
		String property5Name = "details.empSalary";
		
		//----------------Edit the Messages and understandings---------------------
		String default1Message = "Greeting Message !";
		String default2Message = "Heading";
		String default3Message = "1";
		String default4Message = "Not Available";
		String default5Message = "0.0";
		
		String finalGreetMessage = context.getMessage(property1Name, null, default1Message, null);
		String heading = context.getMessage(property2Name, null, default2Message, null);
		String empId = context.getMessage(property3Name, new Object[] {employee.getEmployeeId()}, default3Message, null);
		String empName = context.getMessage(property4Name, new Object[] {employee.getEmployeeName()}, default4Message, null);
		String empSalary = context.getMessage(property5Name, new Object[] {employee.getSalary()}, default5Message, null);
		
		System.out.println(heading);
		System.out.println(empId);
		System.out.println(finalGreetMessage + " " + empName);
		System.out.println(empSalary);
		
		
	}
}


