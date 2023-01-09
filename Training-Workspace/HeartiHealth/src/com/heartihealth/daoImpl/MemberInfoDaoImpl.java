package com.heartihealth.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.criteria.Fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.heartihealth.dao.MemberInfoDao;
import com.heartihealth.hibernateUtil.HibernateUtil;
import com.heartihealth.model.MemberInfo;

public class MemberInfoDaoImpl implements MemberInfoDao {

	public MemberInfoDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveMemberInfo(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(memberInfo);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void updateMemberInfo(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.update(memberInfo);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public void deleteMemberInfo(int id) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		MemberInfo memberInfo = new MemberInfo();
		memberInfo = session.get(MemberInfo.class, id);
		session.delete(memberInfo);

		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
	}

	@Override
	public List<MemberInfo> getMemberInfo() {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<MemberInfo> memberInfoList = new ArrayList<>();
		
		Query query = session.createQuery("from MemberInfo");
		memberInfoList = query.list();
		System.out.println(memberInfoList);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Saved Successfully");
		return memberInfoList;
	}

}
