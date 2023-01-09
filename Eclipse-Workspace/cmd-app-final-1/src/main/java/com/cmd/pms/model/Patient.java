package com.cmd.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Patient")
@Component
public class Patient {

	@Id
	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientBloodGroup;
	private String patientDate;
	private String patientImage;
	private String patientIssue;
	private String patientMobileNumber;
	private String patientTime;
	private String patientMedicalProblem;
	private String patientHeight;
	private String patientAllergy;
	private String patientCountry;
	private String patientStatus;
	private String patientEmail;
	private String patientGender;

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientBloodGroup=" + patientBloodGroup + ", patientDate=" + patientDate + ", patientEmail="
				+ patientEmail + ", patientGender=" + patientGender + ", patientImage=" + patientImage
				+ ", patientIssue=" + patientIssue + ", patientMobileNumber=" + patientMobileNumber + ", patientTime="
				+ patientTime + ", patientMedicalProblem=" + patientMedicalProblem + ", patientHeight=" + patientHeight
				+ ", patientAllergy=" + patientAllergy + ", patientCountry=" + patientCountry + ", patientStatus="
				+ patientStatus + "]";
	}

	public Patient(int patientId, String patientName, int patientAge, String patientBloodGroup, String patientDate,
			String patientEmail, String patientGender, String patientImage, String patientIssue,
			String patientMobileNumber, String patientTime, String patientMedicalProblem, String patientHeight,
			String patientAllergy, String patientCountry, String patientStatus) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientBloodGroup = patientBloodGroup;
		this.patientDate = patientDate;
		this.patientEmail = patientEmail;
		this.patientGender = patientGender;
		this.patientImage = patientImage;
		this.patientIssue = patientIssue;
		this.patientMobileNumber = patientMobileNumber;
		this.patientTime = patientTime;
		this.patientMedicalProblem = patientMedicalProblem;
		this.patientHeight = patientHeight;
		this.patientAllergy = patientAllergy;
		this.patientCountry = patientCountry;
		this.patientStatus = patientStatus;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}

	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}

	public String getPatientDate() {
		return patientDate;
	}

	public void setPatientDate(String patientDate) {
		this.patientDate = patientDate;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientImage() {
		return patientImage;
	}

	public void setPatientImage(String patientImage) {
		this.patientImage = patientImage;
	}

	public String getPatientIssue() {
		return patientIssue;
	}

	public void setPatientIssue(String patientIssue) {
		this.patientIssue = patientIssue;
	}

	public String getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientTime() {
		return patientTime;
	}

	public void setPatientTime(String patientTime) {
		this.patientTime = patientTime;
	}

	public String getPatientMedicalProblem() {
		return patientMedicalProblem;
	}

	public void setPatientMedicalProblem(String patientMedicalProblem) {
		this.patientMedicalProblem = patientMedicalProblem;
	}

	public String getPatientHeight() {
		return patientHeight;
	}

	public void setPatientHeight(String patientHeight) {
		this.patientHeight = patientHeight;
	}

	public String getPatientAllergy() {
		return patientAllergy;
	}

	public void setPatientAllergy(String patientAllergy) {
		this.patientAllergy = patientAllergy;
	}

	public String getPatientCountry() {
		return patientCountry;
	}

	public void setPatientCountry(String patientCountry) {
		this.patientCountry = patientCountry;
	}

	public String getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}

	public Patient() {
	}

}
