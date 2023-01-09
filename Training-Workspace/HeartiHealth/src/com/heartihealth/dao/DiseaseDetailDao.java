package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.DiseaseDetail;

public interface DiseaseDetailDao {

	public void saveDiseaseDetail(DiseaseDetail diseaseDetail);
	public void updateDiseaseDetail(DiseaseDetail diseaseDetail);
	public void deleteDiseaseDetail(int id);
	public List<DiseaseDetail> getDiseaseDetail();

}
