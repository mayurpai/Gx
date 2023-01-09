package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.XRay;

public interface XRayService {

	public void addXRay(XRay xRay);
	public void editXRay(XRay xRay);
	public void removeXRay(int id);
	public List<XRay> getAllXRay();
}
