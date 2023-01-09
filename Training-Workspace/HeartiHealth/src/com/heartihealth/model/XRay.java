package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class XRay {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateTime;
	private int ca;

	
	public XRay(int id, LocalDateTime dateTime, int ca) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.ca = ca;
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

	public int getCa() {
		return ca;
	}

	public void setCa(int ca) {
		this.ca = ca;
	}

	@Override
	public String toString() {
		return "\nXRay [id=" + id + ", dateTime=" + dateTime + ", ca=" + ca + "]";
	}

	public XRay() {
		// TODO Auto-generated constructor stub
	}

}
