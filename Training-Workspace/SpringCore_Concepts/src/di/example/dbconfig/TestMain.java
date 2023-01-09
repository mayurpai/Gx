package di.example.dbconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) { 

		// Get property set in xml 

		ApplicationContext context =new ClassPathXmlApplicationContext("spring_dbconfig.xml"); 

		PropertyHandler handler = (PropertyHandler)context.getBean("dbConfigProperty"); 

		 

		// Get db configuration details 

		System.out.println(handler.getDbConfig().getProperty("url")); 

		System.out.println(handler.getDbConfig().getProperty("userName")); 

		System.out.println(handler.getDbConfig().getProperty("password")); 

		 

		} 

}
