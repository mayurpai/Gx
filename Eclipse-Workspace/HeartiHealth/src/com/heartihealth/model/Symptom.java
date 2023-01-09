package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Symptom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateTime;
	private int exang;
	private float oldPeak;
	private int cp;

	
	public Symptom(int id, LocalDateTime dateTime, int exang, float oldPeak, int cp) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.exang = exang;
		this.oldPeak = oldPeak;
		this.cp = cp;
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

	public int getExang() {
		return exang;
	}

	public void setExang(int exang) {
		this.exang = exang;
	}

	public float getOldPeak() {
		return oldPeak;
	}

	public void setOldPeak(float oldPeak) {
		this.oldPeak = oldPeak;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public Symptom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nSymptom [id=" + id + ", dateTime=" + dateTime + ", exang=" + exang + ", oldPeak=" + oldPeak + ", cp="
				+ cp + "]";
	}

}
