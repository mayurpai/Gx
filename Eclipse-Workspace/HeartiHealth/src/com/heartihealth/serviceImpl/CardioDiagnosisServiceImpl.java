package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.CardioDiagnosisDao;
import com.heartihealth.daoImpl.CardioDiagnosisDaoImpl;
import com.heartihealth.model.CardioDiagnosis;
import com.heartihealth.service.CardioDiagnosisService;

public class CardioDiagnosisServiceImpl implements CardioDiagnosisService {

	CardioDiagnosisDao cardioDiagnosisDao = new CardioDiagnosisDaoImpl();
	
	public CardioDiagnosisServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCardioDiagnosis(CardioDiagnosis cardioDiagnosis) {
		// TODO Auto-generated method stub
		cardioDiagnosisDao.saveCardioDiagnosis(cardioDiagnosis);
	}

	@Override
	public void editCardioDiagnosis(CardioDiagnosis cardioDiagnosis) {
		// TODO Auto-generated method stub
		cardioDiagnosisDao.updateCardioDiagnosis(cardioDiagnosis);
	}

	@Override
	public void removeCardioDiagnosis(int id) {
		// TODO Auto-generated method stub
		cardioDiagnosisDao.deleteCardioDiagnosis(id);
	}

	@Override
	public List<CardioDiagnosis> getAllCardioDiagnosis() {
		// TODO Auto-generated method stub
		return cardioDiagnosisDao.getCardioDiagnosis();
	}

}
