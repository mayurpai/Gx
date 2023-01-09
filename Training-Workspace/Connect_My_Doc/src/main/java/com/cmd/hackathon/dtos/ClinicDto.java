package com.cmd.hackathon.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicDto {

	
	private String clinicId;
	private String clinicName;
	private String businessName;

}
