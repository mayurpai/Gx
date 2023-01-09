package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.AddressInfo;

public interface AddressInfoService {

	public void addAddressInfo(AddressInfo addressInfo);
	public void editAddressInfo(AddressInfo addressInfo);
	public void removeAddressInfo(int id);
	public List<AddressInfo> getAllAddressInfo();
}
