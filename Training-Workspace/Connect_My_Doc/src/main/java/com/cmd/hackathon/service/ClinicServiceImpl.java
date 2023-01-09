package com.cmd.hackathon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmd.hackathon.dtos.ClinicDto;
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
	public ClinicDto saveClinic(ClinicDto clinicDto) {

		Clinic clinic = new Clinic();
		clinic.setClinicId(clinicDto.getClinicId());
		clinic.setBusinessName(clinicDto.getBusinessName());
		clinic.setClinicName(clinicDto.getClinicName());
		clinicDao.save(clinic);
		clinicDto = mapper.convertToDto(clinic);
		return clinicDto;
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
	public ClinicDto editClinic(ClinicDto clinicDto) {
		Clinic clinic = new Clinic();
		clinic.setClinicId(clinicDto.getClinicId());
		clinic.setClinicName(clinicDto.getClinicName());
		clinic.setBusinessName(clinicDto.getBusinessName());
		clinicDao.save(clinic);
		clinicDto = mapper.convertToDto(clinic);
		return clinicDto;
	}

	@Override
	public Clinic getClinicById(String clinicId) {
		Optional<Clinic> mobilePhone = clinicDao.findById(clinicId);
		return mobilePhone.get();
	}

}
