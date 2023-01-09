package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.XRayDao;
import com.heartihealth.daoImpl.XRayDaoImpl;
import com.heartihealth.model.XRay;
import com.heartihealth.service.XRayService;

public class XRayServiceImpl implements XRayService {

	XRayDao xRayDao = new XRayDaoImpl();

	public XRayServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addXRay(XRay xRay) {
		// TODO Auto-generated method stub
		xRayDao.saveXRay(xRay);
	}

	@Override
	public void editXRay(XRay xRay) {
		// TODO Auto-generated method stub
		xRayDao.updateXRay(xRay);
	}

	@Override
	public void removeXRay(int id) {
		// TODO Auto-generated method stub
		xRayDao.deleteXRay(id);
	}

	@Override
	public List<XRay> getAllXRay() {
		// TODO Auto-generated method stub
		return xRayDao.getXRay();
	}

}
