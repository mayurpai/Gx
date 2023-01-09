package com.employee.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Address")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "_pinCode")
	private long pinCode;
	@Column(name = "_state")
	private String state;
	@Column(name = "_city")
	private String city;
	@Column(name = "_houseNumber")
	private String houseNumber;

}