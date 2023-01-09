package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.BloodTest;

public interface BloodTestService {

	public void addBloodTest(BloodTest bloodTest);
	public void editBloodTest(BloodTest bloodTest);
	public void removeBloodTest(int id);
	public List<BloodTest> getAllBloodTest();

}
