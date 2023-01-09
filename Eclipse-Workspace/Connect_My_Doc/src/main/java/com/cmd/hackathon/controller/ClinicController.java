package com.cmd.hackathon.controller;

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

import com.cmd.hackathon.dtos.Employee;
import com.cmd.hackathon.entities.Clinic;
import com.cmd.hackathon.service.ClinicService;


@RestController
@RequestMapping("clinic")
public class ClinicController {
	
	@Autowired
	Clinic clinic;
	
	@Autowired
	ClinicService clinicService;

	@PostMapping
	public ResponseEntity<Employee> POST(@RequestBody Employee employee) {
		ResponseEntity<Employee> responseEntity;
		String cId = employee.getClinicId();
		if (clinicService.isClinicExists(cId)) {
			responseEntity = new ResponseEntity<Employee>(HttpStatus.CONFLICT);
		} else {
			Employee clientDto1 = clinicService.saveClinic(employee);
			responseEntity = new ResponseEntity<Employee>(clientDto1, HttpStatus.OK);
		}
		return responseEntity;
	}
	@PutMapping
	public ResponseEntity<Employee> PUT(@RequestBody Employee employee) {
		ResponseEntity<Employee> responseEntity;
		String cId = employee.getClinicId();
		if (!clinicService.isClinicExists(cId)) {
			responseEntity = new ResponseEntity<Employee>(HttpStatus.CONFLICT);
		} else {
			Employee clientDto1 = clinicService.saveClinic(employee);
			responseEntity = new ResponseEntity<Employee>(clientDto1, HttpStatus.OK);
		}
		return responseEntity;
	}
	@GetMapping
	public ResponseEntity<List<Clinic>> GET() {
		List<Clinic> clinics = clinicService.getAllClinics();
		ResponseEntity<List<Clinic>> responseEntity;
		if (clinics.isEmpty()) {
			responseEntity = new ResponseEntity<List<Clinic>>(clinics, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Clinic>>(clinics, HttpStatus.OK);
		}
		return responseEntity;
	}
	@DeleteMapping("{clinicId}")
	public ResponseEntity<String> DELETE(@PathVariable("clinicId") String clinicId) {
		ResponseEntity<String> responseEntity;
		if (clinicService.isClinicExists(clinicId)) {
			String message = clinicService.deleteClinic(clinicId);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {
			String errorMessage = "No Such Mobile Phone ID Exists!";
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
	@GetMapping("{clinicId}")
	public ResponseEntity<Clinic> GET(@PathVariable("clinicId") String clinicId) {
		ResponseEntity<Clinic> responseEntity;
		if (clinicService.isClinicExists(clinicId)) {
			clinic = clinicService.getClinicById(clinicId);
			responseEntity = new ResponseEntity<Clinic>(clinic, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Clinic>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
	
	
	
	public ClinicController() {
		// TODO Auto-generated constructor stub
	}

	

}
