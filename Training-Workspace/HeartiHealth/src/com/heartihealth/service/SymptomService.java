package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.Symptom;

public interface SymptomService {

	public void addSymptom(Symptom symptom);
	public void editSymptom(Symptom symptom);
	public void removeSymptom(int id);
	public List<Symptom> getAllSymptom();

}
