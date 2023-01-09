package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.EcgReport;

public interface EcgReportService {

	public void addEcgReport(EcgReport ecgReport);
	public void editEcgReport(EcgReport ecgReport);
	public void removeEcgReport(int id);
	public List<EcgReport> getAllEcgReport();

}
