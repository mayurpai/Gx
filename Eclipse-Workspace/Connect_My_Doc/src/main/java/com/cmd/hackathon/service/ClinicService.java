package com.cmd.hackathon.service;

import java.util.List;

import com.cmd.hackathon.dtos.Employee;
import com.cmd.hackathon.entities.Clinic;

public interface ClinicService {
	public List<Clinic> getAllClinics();

	public boolean isClinicExists(String clinicId);

	public Employee saveClinic(Employee employee);

	public String deleteClinic(String clinicId);

	public Employee editClinic(Employee employee);

	public Clinic getClinicById(String clinicId);
}