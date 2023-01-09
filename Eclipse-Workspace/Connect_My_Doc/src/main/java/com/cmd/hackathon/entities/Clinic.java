package com.cmd.hackathon.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Table(name = "Clinic")
@Entity
public class Clinic {

	@Id
	private String clinicId;
	private String clinicName;
	private String businessName;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private long zipCiode;
	private double latitude;
	private double longitude;
	private LocalDate dateCreated;
//	private ServiceOffered serviceOffered;

	public Clinic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
