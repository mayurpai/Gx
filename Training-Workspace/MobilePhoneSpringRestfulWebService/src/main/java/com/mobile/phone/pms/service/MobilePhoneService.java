package com.mobile.phone.pms.service;

import com.mobile.phone.pms.model.MobilePhone;
import com.mobile.phone.pms.model.MobilePhoneList;
import java.util.List;

public interface MobilePhoneService {
	public List<MobilePhone> getAllMobiles();

	public String saveMobilePhone(MobilePhone mobilePhone);

	public MobilePhone getMobilePhoneById(int mobileId);

	public List<MobilePhone> getMobilePhoneByBrandName(String brandName);

	public List<MobilePhone> getMobilePhoneByModelName(String modelName);

	public MobilePhone editMobilephone(MobilePhone mobilePhone);

	public String deleteMobilePhone(int mobileId);

	// public List<MobilePhoneDto> getAllMobilePhones();
	//
	// public MobilePhoneDto getMobilePhoneById(long id);
	//
	// public List<MobilePhoneDto> getMobilePhoneByBrandName(String brandName);
	//
	// public List<MobilePhoneDto> getMobilePhoneByModelName(String modelName);

	public List<MobilePhone> getMobilePhone(double mobilePhoneCost); // get total number of mobile phones who having

	// cost > 10K

	public List<MobilePhone> getByProcessor(String processor); // get Mobile Phone whose having processor with name -

	// Quad Core

	public List<MobilePhone> getByColor(String color); // get Mobile Phone whose having color - black and blue

	public boolean isMobilePhoneExists(Integer mobileId);
	// public int getMobilePhones(); // get total number of mobile phone who are
	// having unique model names

	public MobilePhoneList addMobilePhoneToList(int mobileId, int MobilePhoneListId); // adding mobilePhone to
	// MobilePhoneList

}
