package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.AddressInfoDao;
import com.heartihealth.daoImpl.AddressInfoDaoImpl;
import com.heartihealth.model.AddressInfo;
import com.heartihealth.service.AddressInfoService;

public class AddressInfoServiceImpl implements AddressInfoService {

	AddressInfoDao addressInfoDao = new AddressInfoDaoImpl();

	public AddressInfoServiceImpl() {

	}

	@Override
	public void addAddressInfo(AddressInfo addressInfo) {
		addressInfoDao.saveAddressInfo(addressInfo);
	}

	@Override
	public void editAddressInfo(AddressInfo addressInfo) {
		addressInfoDao.updateAddressInfo(addressInfo);
	}

	@Override
	public void removeAddressInfo(int id) {
		addressInfoDao.deleteAddressInfo(id);
	}

	@Override
	public List<AddressInfo> getAllAddressInfo() {

		return addressInfoDao.getAddressInfo();
	}

}
