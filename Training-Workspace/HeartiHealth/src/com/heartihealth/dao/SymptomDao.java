package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.Symptom;

public interface SymptomDao {

	public void saveSymptom(Symptom symptom);
	public void updateSymptom(Symptom symptom);
	public void deleteSymptom(int id);
	public List<Symptom> getSymptom();

}
