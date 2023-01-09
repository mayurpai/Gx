package di.annotation.example_9;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 

@Configuration 
public class SpringConfiguration { 
	
		@Bean("employee") 
		public Employee createEmployee() { 
		return new Employee(); 
		} 
		
		@Bean("empService") 
		public EmployeeService createEmployeeService() { 		
		return new EmployeeService(); 		
		} 
	
		@Bean("empDao") 
		public EmployeeDao createEmployeeDao() { 
		return new EmployeeDao(); 
		} 

} 
