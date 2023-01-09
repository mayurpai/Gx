package com.mobile.phone.pms.controller;

import com.mobile.phone.pms.model.MobilePhone;
import com.mobile.phone.pms.model.MobilePhoneList;
import com.mobile.phone.pms.service.MobilePhoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
public class MobilePhoneController {

	@Autowired
	MobilePhoneService mobilePhoneService;

	@Autowired
	MobilePhone mobilePhone;

	@Autowired
	MobilePhoneList mobilePhoneList;

	public MobilePhoneController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping
	public ResponseEntity<List<MobilePhone>> getMobilePhone() {
		List<MobilePhone> mobilePhone = mobilePhoneService.getAllMobiles();
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("{mobileId}")
	public ResponseEntity<MobilePhone> getMobilePhone(@PathVariable("mobileId") Integer mobileId) {
		ResponseEntity<MobilePhone> responseEntity;
		if (mobilePhoneService.isMobilePhoneExists(mobileId)) {
			mobilePhone = mobilePhoneService.getMobilePhoneById(mobileId);
			responseEntity = new ResponseEntity<MobilePhone>(mobilePhone, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<MobilePhone>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@PostMapping("addMobilePhoneToList/{mobileId}/{mobilePhoneListId}")
	public ResponseEntity<MobilePhoneList> addMobilePhone(@PathVariable("mobileId") Integer mobileId,
			@PathVariable("mobilePhoneListId") Integer mobilePhoneListId) {
		ResponseEntity<MobilePhoneList> responseEntity;
		if (mobilePhoneService.isMobilePhoneExists(mobileId)) {
			mobilePhoneService.addMobilePhoneToList(mobileId, mobilePhoneListId);
//			mobilePhone = mobilePhoneService.getMobilePhoneById(mobileId);
			responseEntity = new ResponseEntity<MobilePhoneList>(mobilePhoneList, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<MobilePhoneList>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@DeleteMapping("{mobileId}")
	public ResponseEntity<String> deleteMobilePhone(@PathVariable("mobileId") Integer mobileId) {
		ResponseEntity<String> responseEntity;
		if (mobilePhoneService.isMobilePhoneExists(mobileId)) {
			String message = mobilePhoneService.deleteMobilePhone(mobileId);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		} else {
			String errorMessage = "No Such Mobile Phone ID Exists!";
			responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<String> createMobilePhone(@RequestBody MobilePhone mobilePhone) {
		ResponseEntity<String> responseEntity;
		int mId = mobilePhone.getMobileId();
		if (mobilePhoneService.isMobilePhoneExists(mId)) {
			responseEntity = new ResponseEntity<String>("Mobile Phone With ID: " + mId + " Already Exists",
					HttpStatus.CONFLICT);
		} else {
			String message = mobilePhoneService.saveMobilePhone(mobilePhone);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@PutMapping
	public ResponseEntity<String> updateMobilePhone(@RequestBody MobilePhone mobilePhone) {
		ResponseEntity<String> responseEntity;
		int mId = mobilePhone.getMobileId();
		if (!mobilePhoneService.isMobilePhoneExists(mId)) {
			responseEntity = new ResponseEntity<String>("Mobile Phone With ID: " + mId + " Already Exists",
					HttpStatus.CONFLICT);
		} else {
			String message = mobilePhoneService.saveMobilePhone(mobilePhone);
			responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("color/{color}")
	public ResponseEntity<List<MobilePhone>> getMobilePhoneByColor(@PathVariable("color") String color) {
		List<MobilePhone> mobilePhone = mobilePhoneService.getByColor(color);
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("brand/{brand}")
	public ResponseEntity<List<MobilePhone>> getMobilePhoneByBrandName(@PathVariable("brand") String brand) {
		List<MobilePhone> mobilePhone = mobilePhoneService.getMobilePhoneByBrandName(brand);
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("model/{model}")
	public ResponseEntity<List<MobilePhone>> getMobilePhoneByModelName(@PathVariable("model") String model) {
		List<MobilePhone> mobilePhone = mobilePhoneService.getMobilePhoneByModelName(model);
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("processor/{processor}")
	public ResponseEntity<List<MobilePhone>> getMobilePhoneByProcessor(@PathVariable("processor") String processor) {
		List<MobilePhone> mobilePhone = mobilePhoneService.getByProcessor(processor);
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("filter/{mobilePhoneCost}")
	public ResponseEntity<List<MobilePhone>> getMobilePhoneCostGreaterThan(
			@PathVariable("mobilePhoneCost") double mobilePhoneCost) {
		List<MobilePhone> mobilePhone = mobilePhoneService.getMobilePhone(mobilePhoneCost);
		ResponseEntity<List<MobilePhone>> responseEntity;
		if (mobilePhone.isEmpty()) {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<MobilePhone>>(mobilePhone, HttpStatus.OK);
		}
		return responseEntity;
	}
}
