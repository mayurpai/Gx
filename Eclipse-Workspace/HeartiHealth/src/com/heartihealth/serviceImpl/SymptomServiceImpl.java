package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.SymptomDao;
import com.heartihealth.daoImpl.SymptomDaoImpl;
import com.heartihealth.model.Symptom;
import com.heartihealth.service.SymptomService;

public class SymptomServiceImpl implements SymptomService {

	SymptomDao symptomDao = new SymptomDaoImpl();
	
	public SymptomServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSymptom(Symptom symptom) {
		// TODO Auto-generated method stub
		symptomDao.saveSymptom(symptom);
	}

	@Override
	public void editSymptom(Symptom symptom) {
		// TODO Auto-generated method stub
		symptomDao.updateSymptom(symptom);
	}

	@Override
	public void removeSymptom(int id) {
		// TODO Auto-generated method stub
		symptomDao.deleteSymptom(id);
	}

	@Override
	public List<Symptom> getAllSymptom() {
		// TODO Auto-generated method stub
		return symptomDao.getSymptom();
	}

}
