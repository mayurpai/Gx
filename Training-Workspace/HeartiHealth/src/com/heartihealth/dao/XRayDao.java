package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.XRay;

public interface XRayDao {

	public void saveXRay(XRay xRay);
	public void updateXRay(XRay xRay);
	public void deleteXRay(int id);
	public List<XRay> getXRay();
}
