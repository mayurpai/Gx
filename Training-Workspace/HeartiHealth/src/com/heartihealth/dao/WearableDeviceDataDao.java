package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.WearableDeviceData;

public interface WearableDeviceDataDao {

		public void saveWearableDeviceData(WearableDeviceData wearableDeviceData);
		public void updateWearableDeviceData(WearableDeviceData wearableDeviceData);
		public void deleteWearableDeviceData(int id);
		public List<WearableDeviceData> getWearableDeviceData();
}
