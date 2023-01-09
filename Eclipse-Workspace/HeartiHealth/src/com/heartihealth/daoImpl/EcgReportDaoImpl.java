package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.EcgReportDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.EcgReport;

public class EcgReportDaoImpl implements EcgReportDao {

	public EcgReportDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveEcgReport(EcgReport ecgReport) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(ecgReport);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateEcgReport(EcgReport ecgReport) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(ecgReport);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteEcgReport(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		EcgReport ecgReport = new EcgReport();
		ecgReport = session.get(EcgReport.class, id);
		session.delete(ecgReport);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<EcgReport> getEcgReport() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<EcgReport> ecgReports = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<EcgReport> query = session.createQuery("from EcgReport");
		ecgReports = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return ecgReports;
	}

}
