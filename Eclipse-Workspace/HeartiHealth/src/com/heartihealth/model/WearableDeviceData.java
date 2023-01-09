package com.heartihealth.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WearableDeviceData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int thalach;
	private int slope;
	private LocalDateTime dateTime;
	
	
	
	public WearableDeviceData(int id, int thalach, int slope, LocalDateTime dateTime) {
		super();
		this.id = id;
		this.thalach = thalach;
		this.slope = slope;
		this.dateTime = dateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThalach() {
		return thalach;
	}
	public void setThalach(int thalach) {
		this.thalach = thalach;
	}
	public int getSlope() {
		return slope;
	}
	public void setSlope(int slope) {
		this.slope = slope;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		return "\nWearableDeviceData [id=" + id + ", thalach=" + thalach + ", slope=" + slope + ", dateTime=" + dateTime
				+ "]";
	}
	public WearableDeviceData() {
		// TODO Auto-generated constructor stub
	}

}
