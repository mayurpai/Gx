package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.heartihealth.dao.AddressInfoDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.AddressInfo;

public class AddressInfoDaoImpl implements AddressInfoDao {

	public AddressInfoDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveAddressInfo(AddressInfo addressInfo) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(addressInfo);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateAddressInfo(AddressInfo addressInfo) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(addressInfo);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteAddressInfo(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		AddressInfo addressInfo = new AddressInfo();
		addressInfo = session.get(AddressInfo.class, id);
		session.delete(addressInfo);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");

	}

	@Override
	public List<AddressInfo> getAddressInfo() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		List<AddressInfo> addressInfos = new ArrayList<>();
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<AddressInfo> query = session.createQuery("from AddressInfo");
		addressInfos = query.list();

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return addressInfos;
	}

}
