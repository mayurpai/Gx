package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.EcgReport;

public interface EcgReportDao {

	public void saveEcgReport(EcgReport ecgReport);
	public void updateEcgReport(EcgReport ecgReport);
	public void deleteEcgReport(int id);
	public List<EcgReport> getEcgReport();

}
