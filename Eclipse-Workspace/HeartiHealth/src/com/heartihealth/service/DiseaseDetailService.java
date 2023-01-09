package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.DiseaseDetail;

public interface DiseaseDetailService {

	public void addDiseaseDetail(DiseaseDetail diseaseDetail);
	public void editDiseaseDetail(DiseaseDetail diseaseDetail);
	public void removeDiseaseDetail(int id);
	public List<DiseaseDetail> getAllDiseaseDetail();

}
