package di.annotation.example_9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee { 

		// Instance variables 
		@Value("11") 
		private long id; 
	
		@Value("Chandra Shekhar H M") 
		private String name; 

		@Value("1000") 
		private float salary; 

		// Default Constructor 
		public Employee() {} 

		// Getter and setter methods 
		public long getId() { 
		return id; 	
		} 

		public void setId(long id) { 	
		this.id = id; 	
		} 

		public String getName() { 		
		return name; 		
		} 

		public void setName(String name) { 		
		this.name = name; 		
		} 

		public float getSalary() { 
		return salary; 
		} 
		
		public void setSalary(float salary) { 
		this.salary = salary; 
		} 
		
		@Override 
		public String toString() { 
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]"; 
		} 

} 