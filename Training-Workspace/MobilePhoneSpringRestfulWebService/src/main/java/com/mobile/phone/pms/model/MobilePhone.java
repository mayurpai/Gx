package com.mobile.phone.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Mobile_Phone")
@Component
public class MobilePhone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;

	private String brandName;
	private String modelName;
	private String color;
	private String batteryPower;
	private String processor;
	private double mobilePhoneCost;

	public MobilePhone(int mobileId, String brandName, String modelName, String color, String batteryPower,
			String processor, double mobilePhoneCost) {
		super();
		this.mobileId = mobileId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.color = color;
		this.batteryPower = batteryPower;
		this.processor = processor;
		this.mobilePhoneCost = mobilePhoneCost;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBatteryPower() {
		return batteryPower;
	}

	public void setBatteryPower(String batteryPower) {
		this.batteryPower = batteryPower;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getMobilePhoneCost() {
		return mobilePhoneCost;
	}

	public void setMobilePhoneCost(double mobilePhoneCost) {
		this.mobilePhoneCost = mobilePhoneCost;
	}

	@Override
	public String toString() {
		return ("MobilePhone [mobileId=" + mobileId + ", brandName=" + brandName + ", modelName=" + modelName
				+ ", color=" + color + ", batteryPower=" + batteryPower + ", processor=" + processor
				+ ", mobilePhoneCost=" + mobilePhoneCost + "]");
	}

	public MobilePhone() {
		// TODO Auto-generated constructor stub
	}
}
