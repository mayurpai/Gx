package com.cmd.pms.service;

import java.util.List;


import com.cmd.pms.model.Patient;

public interface PatientService {

	public String savePatient(Patient patient);

	public String updatePatient(Patient patient);

	public String deletePatient(int patientID);

	public Patient getPatient(int patientID);

	public boolean isPatientExists(int patientID);

	public List<Patient> getPatient();
}
