package com.cmd.hackathon.service;

import java.util.List;

import com.cmd.hackathon.dtos.ClinicDto;
import com.cmd.hackathon.entities.Clinic;

public interface ClinicService {
	public List<Clinic> getAllClinics();

	public boolean isClinicExists(String clinicId);

	public ClinicDto saveClinic(ClinicDto clinicDto);

	public String deleteClinic(String clinicId);

	public ClinicDto editClinic(ClinicDto clinicDto);

	public Clinic getClinicById(String clinicId);
}