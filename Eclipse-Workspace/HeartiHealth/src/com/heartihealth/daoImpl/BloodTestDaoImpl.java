package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.BloodTestDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.BloodTest;

public class BloodTestDaoImpl implements BloodTestDao {

	public BloodTestDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveBloodTest(BloodTest bloodTest) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(bloodTest);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateBloodTest(BloodTest bloodTest) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(bloodTest);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteBloodTest(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		BloodTest bloodTest = new BloodTest();
		bloodTest = session.get(BloodTest.class, id);
		session.delete(bloodTest);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<BloodTest> getBloodTest() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<BloodTest> bloodTests = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<BloodTest> query = session.createQuery("from BloodTest");
		bloodTests = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return bloodTests;
	}

}
