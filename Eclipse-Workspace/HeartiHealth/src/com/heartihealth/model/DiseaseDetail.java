package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiseaseDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime diagnoseDate;
	private LocalDateTime recoveredDate;
	private boolean isRecovered;

	
	
	
	public DiseaseDetail(int id, LocalDateTime diagnoseDate, LocalDateTime recoveredDate, boolean isRecovered) {
		super();
		this.id = id;
		this.diagnoseDate = diagnoseDate;
		this.recoveredDate = recoveredDate;
		this.isRecovered = isRecovered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDiagnoseDate() {
		return diagnoseDate;
	}

	public void setDiagnoseDate(LocalDateTime diagnoseDate) {
		this.diagnoseDate = diagnoseDate;
	}

	public LocalDateTime getRecoveredDate() {
		return recoveredDate;
	}

	public void setRecoveredDate(LocalDateTime recoveredDate) {
		this.recoveredDate = recoveredDate;
	}

	public boolean isRecovered() {
		return isRecovered;
	}

	public void setRecovered(boolean isRecovered) {
		this.isRecovered = isRecovered;
	}

	public DiseaseDetail() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nDiseaseDetail [id=" + id + ", diagnoseDate=" + diagnoseDate + ", recoveredDate=" + recoveredDate
				+ ", isRecovered=" + isRecovered + "]";
	}

}
