package com.employee.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}