package com.cmd.hackathon.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.cmd.hackathon.dto.ClinicDto;
import com.cmd.hackathon.entities.Clinic;

@Mapper
public interface ClinicMapper {

	@Mapping(target = "clinicId", source = "clinic.clinicId")
	@Mapping(target = "clinicName", source = "clinic.clinicName")
	@Mapping(target = "businessName", source = "clinic.businessName")

	public ClinicDto convertToDto(Clinic clinic);
	
	@Mapping(target = "clinicId", source = "clinicId")
	@Mapping(target = "clinicName", source = "clinicName")
	@Mapping(target = "businessName", source = "businessName")

	public Clinic convertToEntity(ClinicDto clinicDto);

}
