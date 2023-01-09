package com.cmd.hackathon.mapper;

import com.cmd.hackathon.dtos.ClinicDto;
import com.cmd.hackathon.entities.Clinic;

public class ClinicMapperImpl implements ClinicMapper {

	@Override
	public ClinicDto convertToDto(Clinic clinic) {
		if (clinic == null) {
			return null;
		}
		ClinicDto clinicDto = new ClinicDto();
		clinicDto.setClinicId(clinic.getClinicId());
		clinicDto.setClinicName(clinic.getClinicName());
		clinicDto.setBusinessName(clinic.getBusinessName());
		return clinicDto;
	}

	@Override
	public Clinic convertToEntity(ClinicDto clinicDto) {
		if (clinicDto == null) {
			return null;
		}
		Clinic clinic = new Clinic();
		clinic.setClinicId(clinicDto.getClinicId());
		clinic.setClinicName(clinicDto.getClinicName());
		clinic.setBusinessName(clinicDto.getBusinessName());
		return clinic;
	}

}
