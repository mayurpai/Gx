package com.heartihealth.hibernateUtil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.heartihealth.model.AddressInfo;
import com.heartihealth.model.BloodTest;
import com.heartihealth.model.CardioDiagnosis;
import com.heartihealth.model.DiseaseDetail;
import com.heartihealth.model.EcgReport;
import com.heartihealth.model.MemberInfo;
import com.heartihealth.model.Symptom;
import com.heartihealth.model.WearableDeviceData;
import com.heartihealth.model.XRay;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

		// Hibernate settings equivalent to hibernate.cfg.xml's properties
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/heartihealthlab?useSSL=false");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

		settings.put(Environment.SHOW_SQL, "true");

		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		settings.put(Environment.HBM2DDL_AUTO, "update");
		
//		-------------Connection Pool
		settings.put(Environment.C3P0_MIN_SIZE, 5); //Minimum size of pool
        settings.put(Environment.C3P0_MAX_SIZE, 10); //Maximum size of pool
        settings.put(Environment.C3P0_ACQUIRE_INCREMENT, 1); //Number of connections acquired at a time when pool is exhausted 
        settings.put(Environment.C3P0_TIMEOUT, 1800); //Connection idle time
        settings.put(Environment.C3P0_MAX_STATEMENTS, 150); //PreparedStatement cache size

        settings.put(Environment.C3P0_CONFIG_PREFIX + ".initialPoolSize", 5);
        
        
		configuration.setProperties(settings);

		// ***
//	        configuration.addAnnotatedClass(Customer.class);
		configuration.addAnnotatedClass(AddressInfo.class);
		configuration.addAnnotatedClass(BloodTest.class);
		configuration.addAnnotatedClass(CardioDiagnosis.class);
		configuration.addAnnotatedClass(DiseaseDetail.class);
		configuration.addAnnotatedClass(EcgReport.class);
		configuration.addAnnotatedClass(MemberInfo.class);
		configuration.addAnnotatedClass(Symptom.class);
		configuration.addAnnotatedClass(WearableDeviceData.class);
		configuration.addAnnotatedClass(XRay.class);
		// required for mysql 8

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder() //
				.applySettings(configuration.getProperties()).build(); // sessionFactory
																		// =
		configuration.buildSessionFactory(serviceRegistry);

		// mySQL5
		sessionFactory = configuration.buildSessionFactory();

		return sessionFactory;

	}
}
