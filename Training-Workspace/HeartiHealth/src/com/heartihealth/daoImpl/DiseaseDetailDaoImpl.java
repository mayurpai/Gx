package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.DiseaseDetailDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.DiseaseDetail;

public class DiseaseDetailDaoImpl implements DiseaseDetailDao {

	public DiseaseDetailDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveDiseaseDetail(DiseaseDetail diseaseDetail) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(diseaseDetail);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateDiseaseDetail(DiseaseDetail diseaseDetail) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(diseaseDetail);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteDiseaseDetail(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		DiseaseDetail diseaseDetail = new DiseaseDetail();
		diseaseDetail = session.get(DiseaseDetail.class, id);
		session.delete(diseaseDetail);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<DiseaseDetail> getDiseaseDetail() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<DiseaseDetail> diseaseDetails = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<DiseaseDetail> query = session.createQuery("from DiseaseDetail");
		diseaseDetails = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return diseaseDetails;
	}

}
