package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.AddressInfo;

public interface AddressInfoDao {

	public void saveAddressInfo(AddressInfo addressInfo);
	public void updateAddressInfo(AddressInfo addressInfo);
	public void deleteAddressInfo(int id);
	public List<AddressInfo> getAddressInfo();
}
