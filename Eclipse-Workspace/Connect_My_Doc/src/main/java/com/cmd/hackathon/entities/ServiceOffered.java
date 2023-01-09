package com.cmd.hackathon.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Table(name = "ServiceOffered")
@Entity
public class ServiceOffered {

	@Id
	private String serviceId;
	private String serviceName;
	private String serviceCode;
	private String serviceDescription;
	private double averagePrice;
	private boolean isActive;

	public ServiceOffered() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
