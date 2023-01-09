package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.XRayDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.XRay;

public class XRayDaoImpl implements XRayDao {

	public XRayDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveXRay(XRay xRay) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(xRay);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateXRay(XRay xRay) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(xRay);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteXRay(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		XRay xRay = new XRay();
		xRay = session.get(XRay.class, id);
		session.delete(xRay);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<XRay> getXRay() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<XRay> xRays = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<XRay> query = session.createQuery("from XRay");
		xRays = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return xRays;
	}

}
