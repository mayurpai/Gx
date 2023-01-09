package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.WearableDeviceDataDao;
import com.heartihealth.daoImpl.WearableDeviceDataDaoImpl;
import com.heartihealth.model.WearableDeviceData;
import com.heartihealth.service.WearableDeviceDataService;

public class WearableDeviceDataServiceImpl implements WearableDeviceDataService {

	WearableDeviceDataDao wearableDeviceDataDao = new WearableDeviceDataDaoImpl();
	
	public WearableDeviceDataServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addWearableDeviceData(WearableDeviceData wearableDeviceData) {
		// TODO Auto-generated method stub
		wearableDeviceDataDao.saveWearableDeviceData(wearableDeviceData);
	}

	@Override
	public void editWearableDeviceData(WearableDeviceData wearableDeviceData) {
		// TODO Auto-generated method stub
		wearableDeviceDataDao.updateWearableDeviceData(wearableDeviceData);
	}

	@Override
	public void removeWearableDeviceData(int id) {
		// TODO Auto-generated method stub
		wearableDeviceDataDao.deleteWearableDeviceData(id);
	}

	@Override
	public List<WearableDeviceData> getAllWearableDeviceData() {
		// TODO Auto-generated method stub
		return wearableDeviceDataDao.getWearableDeviceData();
	}

}
