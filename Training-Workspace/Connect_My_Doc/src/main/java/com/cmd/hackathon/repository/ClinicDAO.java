package com.cmd.hackathon.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmd.hackathon.entities.Clinic;

public interface ClinicDAO extends CrudRepository<Clinic, String> {

	public static Clinic findByClinicId(String clinicId) {
		// TODO Auto-generated method stub
		return null;
	}
}