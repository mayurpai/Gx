package com.training.galaxe;

import com.training.galaxe.app.ProductApp;
import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Employee;
import com.training.galaxe.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

// Driver Is Specific To A Particular Database
// Username
// Password
// Directory

// Hibernate Is A Third Party Open-Source ORM Framework But Under The Hood It Would Be Doing It Through JDBC Itself.
//
// Advantages:
// 1. You Don't Have To Write A Lot Of Lines Of Codes.
// 2. You Don't Need To Create A Table

public class Client {

  public Client() {}

  public static void main(String[] args) {
    ////		Play Around With One Object If Update Is Written In HibernateUtil
    ////		Product product = new Product(18187, "Bottle", 100, 99);
    //		Employee employee = new Employee(1, "Mayur", "Bangalore", 100);
    ////		Product productTwo = new Product(18189, "Cup", 70, 129);
    //		SessionFactory sf = HibernateUtil.getSessionFactory();
    //		Session session = sf.openSession();
    //		Transaction t = session.beginTransaction();
    ////		session.save(product);
    //		session.save(employee);
    ////		session.save(productTwo);
    //		t.commit();
    //
    //		System.out.println("Congrats, Data Successfully Saved!");

    ProductApp productApp = new ProductApp();
    productApp.startProductApp();
  }
}
