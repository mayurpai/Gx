package di.annotation.example_9;

import java.util.ArrayList; 
import java.util.List; 
import org.springframework.stereotype.Repository; 

@Repository 
public class EmployeeDao { 
		
		private List<Employee> employees; 
		
		public EmployeeDao() { 		
		this.employees = new ArrayList<Employee>(); 
		} 

		public void saveEmployee(Employee emp) { 	
		this.employees.add(emp); 	
		} 
		
		public List<Employee> findEmployees() { 		
		return employees; 
		} 

} 