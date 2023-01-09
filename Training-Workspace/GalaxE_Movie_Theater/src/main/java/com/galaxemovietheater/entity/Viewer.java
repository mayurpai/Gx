package com.galaxemovietheater.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Table(name = "Viewer")
@Data
public class Viewer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String gender;
	private long homePhone;
	private long mobilePhone;
	private String username;
	private String emailAddress;
	private String newPassword;
	private String confirmPassword;

}
