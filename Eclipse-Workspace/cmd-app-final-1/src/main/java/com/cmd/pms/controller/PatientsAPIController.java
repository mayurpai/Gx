package com.cmd.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmd.pms.model.Patient;
import com.cmd.pms.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientsAPIController {

	@Autowired
	PatientService patientService;

	@Autowired
	Patient patient;

	public PatientsAPIController() {
	}

	@GetMapping // localhost:9090/patient/
	public ResponseEntity<List<Patient>> getPatient() {
		List<Patient> patient = patientService.getPatient();
		ResponseEntity<List<Patient>> responseEntity;
		if (patient.isEmpty()) {
			responseEntity = new ResponseEntity<List<Patient>>(patient, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Patient>>(patient, HttpStatus.OK);
		}
		return responseEntity;
//        
	}

	@GetMapping("{patientId}") // localhost:9090/patient/5
	public ResponseEntity<Patient> getProduct(@PathVariable("patientId") Integer patientId) {
		ResponseEntity<Patient> responseEntity;
		if (patientService.isPatientExists(patientId)) {
			patient = patientService.getPatient(patientId);
			responseEntity = new ResponseEntity<Patient>(patient, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Patient>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@DeleteMapping("{patientId}") // localhost:9090/patient/5
	public ResponseEntity<String> deletePatient(@PathVariable("patientId") Integer patientId) {
		ResponseEntity<String> responseEntity;
		if (patientService.isPatientExists(patientId)) {
			String message = patientService.deletePatient(patientId);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {
			String errorMessage = "No Such Patient ID Exists";
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@PostMapping() // localhost:9090/product/
	public ResponseEntity<String> createPatient(@RequestBody Patient patient) {
		ResponseEntity<String> responseEntity;
		int pId = patient.getPatientId();
		if (patientService.isPatientExists(pId)) {
			responseEntity = new ResponseEntity<String>("Patient With Patient ID: " + pId + " Already Exists",
					HttpStatus.CONFLICT);
		} else {
			String message = patientService.savePatient(patient);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping() // localhost:9090/patient/
	public ResponseEntity<String> updatePatient(@RequestBody Patient patient) {
		ResponseEntity<String> responseEntity;
		int pId = patient.getPatientId();
		if (!patientService.isPatientExists(pId)) {
			responseEntity = new ResponseEntity<String>("Patient With Patient ID: " + pId + " Doesn't Exist",
					HttpStatus.NOT_FOUND);
		} else {
			String message = patientService.updatePatient(patient);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

}
