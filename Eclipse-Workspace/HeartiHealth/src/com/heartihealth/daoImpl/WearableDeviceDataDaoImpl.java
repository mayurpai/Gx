package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.WearableDeviceDataDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.WearableDeviceData;

public class WearableDeviceDataDaoImpl implements WearableDeviceDataDao {

	public WearableDeviceDataDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveWearableDeviceData(WearableDeviceData wearableDeviceData) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(wearableDeviceData);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateWearableDeviceData(WearableDeviceData wearableDeviceData) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(wearableDeviceData);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteWearableDeviceData(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		WearableDeviceData wearableDeviceData = new WearableDeviceData();
		wearableDeviceData = session.get(WearableDeviceData.class, id);
		session.delete(wearableDeviceData);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<WearableDeviceData> getWearableDeviceData() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<WearableDeviceData> wearableDeviceDatas = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<WearableDeviceData> query = session.createQuery("from WearableDeviceData");
		wearableDeviceDatas = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return wearableDeviceDatas;
	}

}
