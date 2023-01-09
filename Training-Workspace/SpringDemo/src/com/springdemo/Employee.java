package com.springdemo;

import java.util.List;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Employee implements ApplicationContextAware, BeanNameAware {

  private ApplicationContext context;
  private int empId;
  private String empName;
  private double salary;
  private Address homeAddress;
  private Address officeAddress;
  private String beanName;

  // private List<Address> addressList;

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Address getHomeAddress() {
    return homeAddress;
  }

  // @Required
  @Autowired
  @Qualifier("home")
  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  public Address getOfficeAddress() {
    return officeAddress;
  }

  public void setOfficeAddress(Address officeAddress) {
    this.officeAddress = officeAddress;
  }

  @Override
  public String toString() {
    return (
      "Employee [empId=" +
      empId +
      ", empName=" +
      empName +
      ", salary=" +
      salary +
      ", homeAddress=" +
      homeAddress +
      ", officeAddress=" +
      officeAddress +
      "]"
    );
  }

  // @Override
  // public String toString() {
  //   return (
  //     "Employee [empId=" +
  //     empId +
  //     ", empName=" +
  //     empName +
  //     ", salary=" +
  //     salary +
  //     ", addressList=" +
  //     addressList +
  //     "]"
  //   );
  // }

  // public List<Address> getAddressList() {
  //   return addressList;
  // }

  // public void setAddressList(List<Address> addressList) {
  //   this.addressList = addressList;
  // }

  public Employee() {
    super();
  }

  public Employee(int empId, String empName, double salary) {
    super();
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
  }

  public Employee(
    int empId,
    String empName,
    double salary,
    Address homeAddress,
    Address officeAddress
  ) {
    this.empId = empId;
    this.empName = empName;
    this.salary = salary;
    this.homeAddress = homeAddress;
    this.officeAddress = officeAddress;
  }

  @Override
  public void setApplicationContext(ApplicationContext context)
    throws BeansException {
    this.context = context;
    this.homeAddress = (Address) this.context.getBean("homeAddress");
    this.officeAddress = (Address) this.context.getBean("officeAddress");
  }

  @Override
  public void setBeanName(String beanName) {
    System.out.println("Bean: " + beanName);
  }
}
