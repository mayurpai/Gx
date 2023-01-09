package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.CardioDiagnosis;

public interface CardioDiagnosisDao {

	public void saveCardioDiagnosis(CardioDiagnosis cardioDiagnosis);
	public void updateCardioDiagnosis(CardioDiagnosis cardioDiagnosis);
	public void deleteCardioDiagnosis(int id);
	public List<CardioDiagnosis> getCardioDiagnosis();

}
