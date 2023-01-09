package com.employee.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Member")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int employeeNumber;
	private String employeeName;
	private long employeeMobileNumber;
	private double employeeSalary;
	private String employeeGender;
	private LocalDate hireDate;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId", nullable = false, referencedColumnName = "id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Address permanentAddress;

}