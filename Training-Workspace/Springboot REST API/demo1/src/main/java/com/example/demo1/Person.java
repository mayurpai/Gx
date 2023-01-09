package com.example.demo1;

import java.util.Objects;

public class Person {

  private long privateID;

  @Override
  public String toString() {
    return "Person{" +
            "privateID=" + privateID +
            ", name='" + name + '\'' +
            ", salaryPaid=" + salaryPaid +
            ", salary=" + salary +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return privateID == person.privateID && Objects.equals(name, person.name) && Objects.equals(salaryPaid, person.salaryPaid) && Objects.equals(salary, person.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateID, name, salaryPaid, salary);
  }

  private String name;
  private Boolean salaryPaid;
  private Integer salary;

  public long getPrivateID() {
    return this.privateID;
  }

  public void setPrivateID(long privateID) {
    this.privateID = privateID;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getSalaryPaid() {
    return this.salaryPaid;
  }

  public void setSalaryPaid(Boolean salaryPaid) {
    this.salaryPaid = salaryPaid;
  }

  public Integer getSalary() {
    return this.salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public static void main(String[] args) {
    
  }
}
