package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EcgReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateTime;
	private int restEcg;

	
	public EcgReport(int id, LocalDateTime dateTime, int restEcg) {
		super();
		this.id = id;
		this.dateTime = dateTime;
		this.restEcg = restEcg;
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

	public int getRestEcg() {
		return restEcg;
	}

	public void setRestEcg(int restEcg) {
		this.restEcg = restEcg;
	}

	public EcgReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nEcgReport [id=" + id + ", dateTime=" + dateTime + ", restEcg=" + restEcg + "]";
	}

}
