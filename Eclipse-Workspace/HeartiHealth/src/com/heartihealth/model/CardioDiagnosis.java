package com.heartihealth.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CardioDiagnosis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cardioArrestDetected;
	private LocalDateTime dateTime;
	
	

	public CardioDiagnosis(int id, int cardioArrestDetected, LocalDateTime dateTime,
			List<WearableDeviceData> wearableDeviceDataList, List<XRay> xrayDataList, List<Symptom> symptomList,
			List<BloodTest> bloodTestList, List<DiseaseDetail> diseaseDetailList, List<EcgReport> ecgReportList) {
		super();
		this.id = id;
		this.cardioArrestDetected = cardioArrestDetected;
		this.dateTime = dateTime;
		this.wearableDeviceDataList = wearableDeviceDataList;
		this.xrayDataList = xrayDataList;
		this.symptomList = symptomList;
		this.bloodTestList = bloodTestList;
		this.diseaseDetailList = diseaseDetailList;
		this.ecgReportList = ecgReportList;
	}

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<WearableDeviceData> wearableDeviceDataList = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<XRay> xrayDataList = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<Symptom> symptomList = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<BloodTest> bloodTestList = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<DiseaseDetail> diseaseDetailList = new ArrayList<>();

	@OneToMany
	@JoinColumn(name = "cardiagnosisCardioId", referencedColumnName = "id")
	List<EcgReport> ecgReportList = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<WearableDeviceData> getWearableDeviceDataList() {
		return wearableDeviceDataList;
	}

	public void setWearableDeviceDataList(List<WearableDeviceData> wearableDeviceDataList) {
		this.wearableDeviceDataList = wearableDeviceDataList;
	}

	public List<XRay> getXrayDataList() {
		return xrayDataList;
	}

	public void setXrayDataList(List<XRay> xrayDataList) {
		this.xrayDataList = xrayDataList;
	}

	public List<Symptom> getSymptomList() {
		return symptomList;
	}

	public void setSymptomList(List<Symptom> symptomList) {
		this.symptomList = symptomList;
	}

	public List<BloodTest> getBloodTestList() {
		return bloodTestList;
	}

	public void setBloodTestList(List<BloodTest> bloodTestList) {
		this.bloodTestList = bloodTestList;
	}

	public List<DiseaseDetail> getDiseaseDetailList() {
		return diseaseDetailList;
	}

	public void setDiseaseDetailList(List<DiseaseDetail> diseaseDetailList) {
		this.diseaseDetailList = diseaseDetailList;
	}

	public List<EcgReport> getEcgReportList() {
		return ecgReportList;
	}

	public void setEcgReportList(List<EcgReport> ecgReportList) {
		this.ecgReportList = ecgReportList;
	}

	public int getCardioArrestDetected() {
		return cardioArrestDetected;
	}

	public void setCardioArrestDetected(int cardioArrestDetected) {
		this.cardioArrestDetected = cardioArrestDetected;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public CardioDiagnosis() {
	}

	@Override
	public String toString() {
		return "\nCardioDiagnosis [id=" + id + ", cardioArrestDetected=" + cardioArrestDetected + ", dateTime=" + dateTime
				+ ", wearableDeviceDataList=" + wearableDeviceDataList + ", xrayDataList=" + xrayDataList
				+ ", symptomList=" + symptomList + ", bloodTestList=" + bloodTestList + ", diseaseDetailList="
				+ diseaseDetailList + ", ecgReportList=" + ecgReportList + "]";
	}

}
