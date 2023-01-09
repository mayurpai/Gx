package di.annotation.example_9;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

@Service 
public class EmployeeService { 

			@Autowired 			
			private EmployeeDao employeeDao; 
						
			public void addEmployee(Employee employee) { 			
			employeeDao.saveEmployee(employee); 			
			} 
			
			public List<Employee> getAllEmployees() { 			
			return employeeDao.findEmployees(); 			
			} 
			
			public EmployeeDao getEmployeeDao() { 			
			return employeeDao; 			
			} 
			
			public void setEmployeeDao(EmployeeDao employeeDao) { 			
			this.employeeDao = employeeDao; 			
			} 

} 
