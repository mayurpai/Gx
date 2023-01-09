package com.training.galaxe.dao;

import com.training.galaxe.config.HibernateUtil;
import com.training.galaxe.model.Product;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProductDAOImpl implements ProductDAO {

    public ProductDAOImpl() {
    }

    public void saveProduct(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public void updateProduct(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public void deleteProduct(int productID) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        product.setProductID(productID);
        session.delete(product);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    public Product getProduct(int productID) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        product.setPrice(100);
        System.out.println(product.getPrice()); // 100
        // This Won't Affect The Database As The State Is Still In Transient And Is
        // Local
        // Moreover, It Is Before The Session Started

        product = session.get(Product.class, productID);
        System.out.println(product.getPrice()); // Whatever Is There In The Database Gets Printed
        // Any Change Over Here Will Automatically By Synced With The Database
        // Change The Product Here
        product.setPrice(1000);
        product.setProductName("Always I Am Going To Come!");
        System.out.println(product.getPrice()); // 1000 -> This Is Stored In Database
        transaction.commit();
        session.close();
        sessionFactory.close();
        // This Line Won't Either Affect The Database, But Locally Update The Objects
        // Price
        product.setPrice(10000);
        System.out.println(product.getPrice()); // 10000 -> This Is Returned To The Caller But Not Database As The
                                                // Connection Is Already Closed
        return product;
    }

    public List<Product> getProduct() {
        // While Retrieving The Data You Don't Need To Use Transaction Only Required In
        // DML Operations
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Product");
        List<Product> allProducts = query.list();
        session.close();
        sessionFactory.close();
        return allProducts;
    }

    public List<Product> checkStockStatus(int minStock) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Product> searchByProduct(String productName, int productPrice) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(
                "from Product where productName = '" +
                        productName +
                        "' productPrice = '" +
                        productPrice +
                        "'");
        List<Product> allProducts = query.list();
        session.close();
        sessionFactory.close();
        return allProducts;
    }

    public List<Product> searchByProduct(int min, int max) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // SELECT * FROM PRODUCT;
        // Query query = session.createQuery("from Product");
        // Criteria criteria = session.createCriteria(Product.class);
        Criteria criteria = session.createCriteria(Product.class);
        // List<Product> product = criteria.list();

        // SELECT * FROM PRODUCT WHERE PRICE BETWEEN 40 AND 60;
        criteria.add(Restrictions.between("price", min, max));

        // This Has The Products Between The Range Of Min And Max
        List<Product> productTwo = criteria.list();
        return productTwo;
    }

    public List<Product> searchByProduct(String productName) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(
                "from Product where productName = '" + productName + "'");
        List<Product> allProducts = query.list();
        session.close();
        sessionFactory.close();
        return allProducts;
    }

    public boolean isProductExists(int productID) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class, productID);
        session.close();
        sessionFactory.close();
        if (product == null)
            return false;
        else
            return true;
    }
}
