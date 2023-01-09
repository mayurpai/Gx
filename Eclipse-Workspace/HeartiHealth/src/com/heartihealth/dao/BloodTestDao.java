package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.BloodTest;

public interface BloodTestDao {

	public void saveBloodTest(BloodTest bloodTest);
	public void updateBloodTest(BloodTest bloodTest);
	public void deleteBloodTest(int id);
	public List<BloodTest> getBloodTest();

}
