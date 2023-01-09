package com.mobile.phone.pms.service;

import com.mobile.phone.pms.dao.MobilePhoneDAO;
import com.mobile.phone.pms.dao.MobilePhoneListDAO;
import com.mobile.phone.pms.model.MobilePhone;
import com.mobile.phone.pms.model.MobilePhoneList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobilePhoneServiceImpl implements MobilePhoneService {

	@Autowired
	MobilePhoneDAO mobilePhoneDAO;
	
	@Autowired
	MobilePhoneListDAO mobilePhoneListDAO;
	

	@Autowired
	MobilePhone mobilePhone;

	@Autowired
	MobilePhoneList mobilePhoneList;

	public MobilePhoneServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MobilePhone> getAllMobiles() {
		return (List<MobilePhone>) mobilePhoneDAO.findAll();
	}

	@Override
	public String saveMobilePhone(MobilePhone mobilePhone) {
		mobilePhoneDAO.save(mobilePhone);
		return "Mobile Phone Saved Successfully!";
	}

	@Override
	public MobilePhone getMobilePhoneById(int mobileId) {
		Optional<MobilePhone> mobilePhone = mobilePhoneDAO.findById(mobileId);
		return mobilePhone.get();
	}

	@Override
	public List<MobilePhone> getMobilePhoneByBrandName(String brandName) {
		return mobilePhoneDAO.findByBrandName(brandName);
	}

	@Override
	public List<MobilePhone> getMobilePhoneByModelName(String modelName) {
		return mobilePhoneDAO.findByModelName(modelName);
	}

	@Override
	public MobilePhone editMobilephone(MobilePhone mobilePhone) {
		return mobilePhoneDAO.save(mobilePhone);
	}

	@Override
	public String deleteMobilePhone(int mobileId) {
		mobilePhoneDAO.deleteById(mobileId);
		return "Mobile Phone Successsfully Deleted!";
	}

	@Override
	public List<MobilePhone> getMobilePhone(double mobilePhoneCost) {
		return mobilePhoneDAO.findByMobilePhoneCostGreaterThan(mobilePhoneCost);
	}

	@Override
	public List<MobilePhone> getByProcessor(String processor) {
		return mobilePhoneDAO.findByProcessor(processor);
	}

	@Override
	public List<MobilePhone> getByColor(String color) {
		return mobilePhoneDAO.findByColor(color);
	}

	@Override
	public boolean isMobilePhoneExists(Integer mobileId) {
		Optional<MobilePhone> mobilePhone = mobilePhoneDAO.findById(mobileId);
		return mobilePhone.isPresent();
	}

	@Override
	public MobilePhoneList addMobilePhoneToList(int mobileId, int MobilePhoneListId) {
		List<MobilePhone> mobilePhoneList1 = new ArrayList<MobilePhone>();
		MobilePhone mobilePhone = getMobilePhoneById(mobileId);
		mobilePhoneList1.add(mobilePhone);
		mobilePhoneList.setId(mobileId);
		mobilePhoneList.setMobilePhoneList(mobilePhoneList1);
		
//		MobilePhoneList mobilePhoneList = 
//		MobilePhoneService mobilePhoneService = new MobilePhoneServiceImpl();
		
//		MobilePhone mobilePhone = new MobilePhone(20, "Xiaomi", "Redmi Note 7 Pro", "Moon Light", "4000mAh",
//				"Snapdragon 665", 10999);
//		System.out.println(mobilePhone);
//		mobilePhoneService.addMobilePhoneToList(mobileId, MobilePhoneListId);
//		mobilePhoneList.setMobilePhoneList(mobilePhoneList1);
//		System.out.println(mobilePhoneList);
		return mobilePhoneListDAO.save(mobilePhoneList);
	}
	// @Override
	// public int getMobilePhones() {
	// // TODO Auto-generated method stub
	// return 0;
	// }

}
