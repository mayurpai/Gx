package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.WearableDeviceData;

public interface WearableDeviceDataService {

		public void addWearableDeviceData(WearableDeviceData wearableDeviceData);
		public void editWearableDeviceData(WearableDeviceData wearableDeviceData);
		public void removeWearableDeviceData(int id);
		public List<WearableDeviceData> getAllWearableDeviceData();
}
