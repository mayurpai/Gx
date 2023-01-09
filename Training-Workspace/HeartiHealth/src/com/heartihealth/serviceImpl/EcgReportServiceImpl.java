package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.EcgReportDao;
import com.heartihealth.daoImpl.EcgReportDaoImpl;
import com.heartihealth.model.EcgReport;
import com.heartihealth.service.EcgReportService;

public class EcgReportServiceImpl implements EcgReportService {

	EcgReportDao ecgReportDao = new EcgReportDaoImpl();
	
	public EcgReportServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEcgReport(EcgReport ecgReport) {
		// TODO Auto-generated method stub
		ecgReportDao.saveEcgReport(ecgReport);
	}

	@Override
	public void editEcgReport(EcgReport ecgReport) {
		// TODO Auto-generated method stub
		ecgReportDao.updateEcgReport(ecgReport);
	}

	@Override
	public void removeEcgReport(int id) {
		// TODO Auto-generated method stub
		ecgReportDao.deleteEcgReport(id);
	}

	@Override
	public List<EcgReport> getAllEcgReport() {
		// TODO Auto-generated method stub
		return ecgReportDao.getEcgReport();
	}

}
