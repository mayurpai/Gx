package com.cmd.hackathon.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cmd.hackathon.dtos.Employee;
import com.cmd.hackathon.entities.Clinic;

@Mapper
public interface ClinicMapper {

	@Mapping(target = "clinicId", source = "clinic.clinicId")
	@Mapping(target = "clinicName", source = "clinic.clinicName")
	@Mapping(target = "businessName", source = "clinic.businessName")

	public Employee convertToDto(Clinic clinic);

	@Mapping(target = "clinicId", source = "clinicId")
	@Mapping(target = "clinicName", source = "clinicName")
	@Mapping(target = "businessName", source = "businessName")

	public Clinic convertToEntity(Employee employee);

}
