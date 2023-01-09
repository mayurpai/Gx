package com.training.galaxe.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.training.galaxe.model.ContractEmployee;
import com.training.galaxe.model.Employee;
import com.training.galaxe.model.Product;
import com.training.galaxe.model.RegularEmployee;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

		// Hibernate Settings Equivalent To hibernate.cfg.xml's Properties
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/galaxe?useSSL=false");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

		// In Order To Connect To Oracle, We Just Have To Change The Above 5 Lines

		 settings.put(Environment.SHOW_SQL, "true");

		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		settings.put(Environment.HBM2DDL_AUTO, "update");
		// Every Time It Creates A New Table And Overrides -> create
		// It Doesn't Override -> update

		configuration.setProperties(settings);

		// Important Line To Connect The Product Class And Hibernate
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(RegularEmployee.class);
		configuration.addAnnotatedClass(ContractEmployee.class);

		// Required for mySQL 8
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// Required for mySQL 5
		// sessionFactory = configuration.buildSessionFactory();

		return sessionFactory;

	}
}