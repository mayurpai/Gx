package com.cmd.hackathon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmd.hackathon.dtos.Employee;
import com.cmd.hackathon.entities.Clinic;
import com.cmd.hackathon.mapper.ClinicMapper;
import com.cmd.hackathon.repository.ClinicDAO;

@Service
public class ClinicServiceImpl implements ClinicService {

	@Autowired
	ClinicDAO clinicDao;

	@Autowired
	ClinicMapper mapper;

	@Override
	public boolean isClinicExists(String clinicId) {
		Optional<Clinic> clinic = clinicDao.findById(clinicId);
		return clinic.isPresent();
	}

	@Override
	public Employee saveClinic(Employee employee) {

		Clinic clinic = new Clinic();
		clinic.setClinicId(employee.getClinicId());
		clinic.setBusinessName(employee.getBusinessName());
		clinic.setClinicName(employee.getClinicName());
		clinicDao.save(clinic);
		employee = mapper.convertToDto(clinic);
		return employee;
	}

	@Override
	public List<Clinic> getAllClinics() {
		return (List<Clinic>) clinicDao.findAll();
	}

	public ClinicServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deleteClinic(String clinicId) {
		clinicDao.deleteById(clinicId);
		return "Clinic Successsfully Deleted!";
	}

	@Override
	public Employee editClinic(Employee employee) {
		Clinic clinic = new Clinic();
		clinic.setClinicId(employee.getClinicId());
		clinic.setClinicName(employee.getClinicName());
		clinic.setBusinessName(employee.getBusinessName());
		clinicDao.save(clinic);
		employee = mapper.convertToDto(clinic);
		return employee;
	}

	@Override
	public Clinic getClinicById(String clinicId) {
		Optional<Clinic> mobilePhone = clinicDao.findById(clinicId);
		return mobilePhone.get();
	}

}
