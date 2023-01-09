package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.CardioDiagnosisDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.CardioDiagnosis;

public class CardioDiagnosisDaoImpl implements CardioDiagnosisDao {

	public CardioDiagnosisDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveCardioDiagnosis(CardioDiagnosis cardioDiagnosis) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(cardioDiagnosis);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateCardioDiagnosis(CardioDiagnosis cardioDiagnosis) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(cardioDiagnosis);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteCardioDiagnosis(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		CardioDiagnosis cardioDiagnosis = new CardioDiagnosis();
		cardioDiagnosis = session.get(CardioDiagnosis.class, id);
		session.delete(cardioDiagnosis);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<CardioDiagnosis> getCardioDiagnosis() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<CardioDiagnosis> cardioDiagnosis = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<CardioDiagnosis> query = session.createQuery("from CardioDiagnosis");
		cardioDiagnosis = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return cardioDiagnosis;
	}

}
