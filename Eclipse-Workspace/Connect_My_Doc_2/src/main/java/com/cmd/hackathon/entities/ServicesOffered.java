package com.cmd.hackathon.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name="ServicesOffered")
@Component
public class ServicesOffered {

	@Id
	private String serviceId;
	private String serviceName;
	private String servicecode;
	private String serviceDescription;
	private double averagePrice;
	private boolean isActive;
	
	
	public ServicesOffered() {
		// TODO Auto-generated constructor stub
	}

}
