package com.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {

  /**
   *                    @Component
   *                /       |       \
   *     @Controller     @Service   @Repository
   *
   * @Controller: Stereotype For Web Controller / Presentation Layer In Spring MVC (Presentation)
   * @Service: Stereotype For Service Layer (Service)
   * @Repository: Stereotype For DAO / Persistence Layer 
   *
   */
  public static void main(String[] args) {
    // Resource resource = new ClassPathResource("applicationContext.xml");
    // BeanFactory beanFactory = new XmlBeanFactory(new
    // FileSystemResource("applicationContext.xml"));
    // BeanFactory beanFactory = new XmlBeanFactory(resource);

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
      "applicationContext.xml"
    );
    // Student student = (Student) applicationContext.getBean("studentBean");
    Employee employeeOne = (Employee) applicationContext.getBean(
      "employeeBean"
    );
    // Employee employeeTwo = (Employee) applicationContext.getBean(
    //   "employeeBean"
    // );
    Student student = (Student) applicationContext.getBean("studentBeanList");
    Triangle traingle = (Triangle) applicationContext.getBean("triangle");
    // Circle circle = (Circle) applicationContext.getBean("circle");
    // School school = (School) applicationContext.getBean("school");
    // Employee employee = (Employee) applicationContext.getBean("GxEmployee");
    // student.displayInfo();
    // employeeOne.setSalary(30000);
    System.out.println(employeeOne);
    // System.out.println(employeeTwo);
    System.out.println(student);
    System.out.println(traingle);
    // System.out.println(circle);
    // System.out.println(school);

    // This Line Of Code Will Work With @PostConstruct And @PreDestroy And context Gets Destroyed On registerShutdownHook
    // AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // context.registerShutdownHook();
  }
}
