package com.cmd.hackathon.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Table(name="Clinic")
@Entity
@Component
@Data
public class Clinic {
	
	@Id
	private String clinicId;
	private String clinicName;
	private String businessName;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private long zipCode;
	private double latitude;
	private double longitude;
	private LocalDate dateCreated;
//	private ServicesOffered servicesOffered;

	public Clinic() {
		// TODO Auto-generated constructor stub
	}

}
