package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.DiseaseDetailDao;
import com.heartihealth.daoImpl.DiseaseDetailDaoImpl;
import com.heartihealth.model.DiseaseDetail;
import com.heartihealth.service.DiseaseDetailService;

public class DiseaseDetailServiceImpl implements DiseaseDetailService {

	DiseaseDetailDao diseaseDetailDao = new DiseaseDetailDaoImpl();
	
	
	
	public DiseaseDetailServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addDiseaseDetail(DiseaseDetail diseaseDetail) {
		// TODO Auto-generated method stub
		diseaseDetailDao.saveDiseaseDetail(diseaseDetail);
	}

	@Override
	public void editDiseaseDetail(DiseaseDetail diseaseDetail) {
		// TODO Auto-generated method stub
		diseaseDetailDao.updateDiseaseDetail(diseaseDetail);
	}

	@Override
	public void removeDiseaseDetail(int id) {
		// TODO Auto-generated method stub
		diseaseDetailDao.deleteDiseaseDetail(id);
	}

	@Override
	public List<DiseaseDetail> getAllDiseaseDetail() {
		// TODO Auto-generated method stub
		return diseaseDetailDao.getDiseaseDetail();
	}

}
