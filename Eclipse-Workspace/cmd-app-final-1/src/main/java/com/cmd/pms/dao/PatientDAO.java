package com.cmd.pms.dao;

import org.springframework.data.repository.CrudRepository;
import com.cmd.pms.model.Patient;

public interface PatientDAO extends CrudRepository<Patient, Integer> {

}
