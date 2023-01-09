package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.BloodTestDao;
import com.heartihealth.daoImpl.BloodTestDaoImpl;
import com.heartihealth.model.BloodTest;
import com.heartihealth.service.BloodTestService;

public class BloodTestServiceImpl implements BloodTestService {
	
	BloodTestDao bloodTestDao = new BloodTestDaoImpl();

	public BloodTestServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addBloodTest(BloodTest bloodTest) {
		// TODO Auto-generated method stub
		bloodTestDao.saveBloodTest(bloodTest);
	}

	@Override
	public void editBloodTest(BloodTest bloodTest) {
		// TODO Auto-generated method stub
		bloodTestDao.updateBloodTest(bloodTest);
	}

	@Override
	public void removeBloodTest(int id) {
		// TODO Auto-generated method stub
		bloodTestDao.deleteBloodTest(id);
	}

	@Override
	public List<BloodTest> getAllBloodTest() {
		// TODO Auto-generated method stub
		return bloodTestDao.getBloodTest();
	}

}
