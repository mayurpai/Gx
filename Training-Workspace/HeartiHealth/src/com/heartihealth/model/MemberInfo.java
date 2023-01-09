package com.heartihealth.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MemberInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int age;
	private String phoneNumber;
	
	@OneToMany
	@JoinColumn(name = "memberId", referencedColumnName = "id")
	List<AddressInfo> address = new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name = "memberId", referencedColumnName = "id")
	List<CardioDiagnosis> cardioDiagnosisList = new ArrayList<>();
	
	
	public MemberInfo(int id, String userName, String firstName, String lastName, String email, String gender, int age,
			String phoneNumber, List<AddressInfo> address, List<CardioDiagnosis> cardioDiagnosisList) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.cardioDiagnosisList = cardioDiagnosisList;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<CardioDiagnosis> getCardioDiagnosisList() {
		return cardioDiagnosisList;
	}

	public void setCardioDiagnosisList(List<CardioDiagnosis> cardioDiagnosisList) {
		this.cardioDiagnosisList = cardioDiagnosisList;
	}

	public List<AddressInfo> getAddress() {
		return address;
	}

	public void setAddress(List<AddressInfo> address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	@Override
	public String toString() {
		return "\nMemberInfo [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", cardioDiagnosisList=" + cardioDiagnosisList + "]";
	}

	public MemberInfo() {
		// TODO Auto-generated constructor stub
	}

}
