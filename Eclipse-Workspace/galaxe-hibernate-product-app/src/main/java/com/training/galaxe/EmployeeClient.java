package com.training.galaxe;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.ContractEmployee;
import com.training.galaxe.model.Employee;
import com.training.galaxe.model.RegularEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeClient {

  public EmployeeClient() {}

  public static void main(String[] args) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();

    Employee employee = new Employee();
    employee.setName("Mayur");

    RegularEmployee regularEmployee = new RegularEmployee();
    regularEmployee.setName("Kavya");
    regularEmployee.setSalary(33000);
    regularEmployee.setBonus(29000);

    ContractEmployee contractEmployee = new ContractEmployee();
    contractEmployee.setName("Tufail");
    contractEmployee.setPayPerHour(1000);
    contractEmployee.setContractDuration("128");

    session.save(employee);
    session.save(regularEmployee);
    session.save(contractEmployee);

    transaction.commit();
    session.close();
    sf.close();
    System.out.println("Done");
  }
}
