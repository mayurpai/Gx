package com.cmd.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmd.pms.dao.PatientDAO;
import com.cmd.pms.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientDAO patientDAO;

	public PatientServiceImpl() {
	}

	@Override
	public String savePatient(Patient patient) {
//        if (patient.getPatientPrice() < 0 | product.getQuantityOnHand() < 0) {
//            return "Product Price Or QOH Canont Be Negative";
//        } else {
//            productDAO.save(product);
//            return "Product Saved Successfully";
//        }
		patientDAO.save(patient);
		return "Patient Created Successfully";
	}

	@Override
	public String updatePatient(Patient patient) {
		patientDAO.save(patient);
		return "Patient Updated Successfully";
	}

	@Override
	public String deletePatient(int patientId) {
		patientDAO.deleteById(patientId);
		return "Patient Deleted Successfully";
	}

	@Override
	public List<Patient> getPatient() {
		return (List<Patient>) patientDAO.findAll();
	}

	@Override
	public Patient getPatient(int patientId) {
		Optional<Patient> patient = patientDAO.findById(patientId);
		return patient.get();
	}

	@Override
	public boolean isPatientExists(int patientId) {
		Optional<Patient> patient = patientDAO.findById(patientId);
		return patient.isPresent();
	}

}
