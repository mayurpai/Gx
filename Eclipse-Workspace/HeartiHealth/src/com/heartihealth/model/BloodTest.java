package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateTime;
	private int bloodPressure;
	private int fbs;
	private int thal;
	private int serumCholestrol;

	
	public BloodTest(int id, LocalDateTime dateTime, int bloodPressure, int fbs, int thal, int serumCholestrol) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.bloodPressure = bloodPressure;
		this.fbs = fbs;
		this.thal = thal;
		this.serumCholestrol = serumCholestrol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public int getFbs() {
		return fbs;
	}

	public void setFbs(int fbs) {
		this.fbs = fbs;
	}

	public int getThal() {
		return thal;
	}

	public void setThal(int thal) {
		this.thal = thal;
	}

	public int getSerumCholestrol() {
		return serumCholestrol;
	}

	public void setSerumCholestrol(int serumCholestrol) {
		this.serumCholestrol = serumCholestrol;
	}

	@Override
	public String toString() {
		return "\nBloodTest [id=" + id + ", dateTime=" + dateTime + ", bloodPressure=" + bloodPressure + ", fbs=" + fbs
				+ ", thal=" + thal + ", serumCholestrol=" + serumCholestrol + "]";
	}

	public BloodTest() {
		// TODO Auto-generated constructor stub
	}

}
