package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.CardioDiagnosis;

public interface CardioDiagnosisService {

	public void addCardioDiagnosis(CardioDiagnosis cardioDiagnosis);
	public void editCardioDiagnosis(CardioDiagnosis cardioDiagnosis);
	public void removeCardioDiagnosis(int id);
	public List<CardioDiagnosis> getAllCardioDiagnosis();

}
