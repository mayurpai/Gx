package com.heartihealth.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.heartihealth.model.AddressInfo;
import com.heartihealth.model.BloodTest;
import com.heartihealth.model.CardioDiagnosis;
import com.heartihealth.model.DiseaseDetail;
import com.heartihealth.model.EcgReport;
import com.heartihealth.model.MemberInfo;
import com.heartihealth.model.Symptom;
import com.heartihealth.model.WearableDeviceData;
import com.heartihealth.model.XRay;
import com.heartihealth.service.AddressInfoService;
import com.heartihealth.service.BloodTestService;
import com.heartihealth.service.CardioDiagnosisService;
import com.heartihealth.service.DiseaseDetailService;
import com.heartihealth.service.EcgReportService;
import com.heartihealth.service.MemberInfoService;
import com.heartihealth.service.SymptomService;
import com.heartihealth.service.WearableDeviceDataService;
import com.heartihealth.service.XRayService;
import com.heartihealth.serviceImpl.AddressInfoServiceImpl;
import com.heartihealth.serviceImpl.BloodTestServiceImpl;
import com.heartihealth.serviceImpl.CardioDiagnosisServiceImpl;
import com.heartihealth.serviceImpl.DiseaseDetailServiceImpl;
import com.heartihealth.serviceImpl.EcgReportServiceImpl;
import com.heartihealth.serviceImpl.MemberInfoServiceImpl;
import com.heartihealth.serviceImpl.SymptomServiceImpl;
import com.heartihealth.serviceImpl.WearableDeviceDataServiceImpl;
import com.heartihealth.serviceImpl.XRayServiceImpl;

public class TestMain {

	public static void main(String[] args) {
		
		CardioDiagnosisService cardioDiagnosisService = new CardioDiagnosisServiceImpl();
		
		List<CardioDiagnosis> cardioDiagnosisList = new ArrayList<>();
		CardioDiagnosis cardioDiagnosis = new CardioDiagnosis();
		cardioDiagnosis.setCardioArrestDetected(1);
		cardioDiagnosis.setId(1);
		cardioDiagnosis.setDateTime(LocalDateTime.now());
//		cardioDiagnosisService.addCardioDiagnosis(cardioDiagnosis);
		cardioDiagnosisList.add(cardioDiagnosis);
//-------------------------
		
		MemberInfoService memberInfoService = new MemberInfoServiceImpl();
		MemberInfo memberInfo = new MemberInfo();
		memberInfo.setAge(23);
		memberInfo.setUserName("Kavya");
		memberInfo.setFirstName("Kavya");
		memberInfo.setLastName("Srinivasa");
		memberInfo.setEmail("Kavya"+"@"+"gmail.com");
		memberInfo.setPhoneNumber("9113658237");
		memberInfo.setGender("Female");
		
		cardioDiagnosisList.add(cardioDiagnosis);
		memberInfo.setCardioDiagnosisList(cardioDiagnosisList);
		
		
		
		
		List<AddressInfo> address = new ArrayList<>();
		AddressInfoService addressInfoService = new AddressInfoServiceImpl();
		AddressInfo addressInfo = new AddressInfo(1,"Banglore","Karnataka","India");
		AddressInfo addressInfo1 = new AddressInfo(2,"Manglore","Karnataka","India");
		addressInfoService.addAddressInfo(addressInfo);
		addressInfoService.addAddressInfo(addressInfo1);
		address.add(addressInfo);
		address.add(addressInfo1);
		memberInfo.setAddress(address);
//		memberInfoService.addMemberInfo(memberInfo);
		
		
		List<WearableDeviceData> wearableDeviceDataList = new ArrayList<>();
		WearableDeviceDataService wearableDeviceDataService = new WearableDeviceDataServiceImpl();
		WearableDeviceData wearableDeviceData = new WearableDeviceData(1,1,1,LocalDateTime.now());
		wearableDeviceDataList.add(wearableDeviceData);
		wearableDeviceDataService.addWearableDeviceData(wearableDeviceData);;
		cardioDiagnosis.setWearableDeviceDataList(wearableDeviceDataList);
		
		List<XRay> xrayDataList = new ArrayList<>();
        XRayService xRayService = new XRayServiceImpl();
        XRay xRay = new XRay(1,LocalDateTime.now(), 1);
        XRay xRay1 = new XRay(2,LocalDateTime.now(), 3);
        xrayDataList.add(xRay);
        xrayDataList.add(xRay1);
        xRayService.addXRay(xRay);
        xRayService.addXRay(xRay1);
        cardioDiagnosis.setXrayDataList(xrayDataList);
        
        List<Symptom> symptomList = new ArrayList<>();
        SymptomService symptomService = new SymptomServiceImpl();
        Symptom symptom = new Symptom(1,LocalDateTime.now(),1,1,1);
        Symptom symptom1 = new Symptom(2,LocalDateTime.now(),2,2,2);
        symptomList.add(symptom);
        symptomList.add(symptom1);
        symptomService.addSymptom(symptom1);
        symptomService.addSymptom(symptom);
        cardioDiagnosis.setSymptomList(symptomList);
        
		
		
		List<BloodTest> bloodTestList = new ArrayList<>();
		BloodTestService bloodTestService = new BloodTestServiceImpl();
		BloodTest bloodTest = new BloodTest(1,LocalDateTime.now(),1,1,1,1);
		BloodTest bloodTest1 = new BloodTest(2,LocalDateTime.now(),2,2,2,2);
		bloodTestList.add(bloodTest1);
		bloodTestList.add(bloodTest);
		bloodTestService.addBloodTest(bloodTest1);
		bloodTestService.addBloodTest(bloodTest);
		cardioDiagnosis.setBloodTestList(bloodTestList);
		
		
		List<DiseaseDetail> diseaseDetailList = new ArrayList<>();
		DiseaseDetailService diseaseDetailService = new DiseaseDetailServiceImpl();
		DiseaseDetail diseaseDetail = new DiseaseDetail(1,LocalDateTime.now(),LocalDateTime.now(),true);
		DiseaseDetail diseaseDetail1 = new DiseaseDetail(2,LocalDateTime.now(),LocalDateTime.now(),false);
		diseaseDetailList.add(diseaseDetail1);
		diseaseDetailList.add(diseaseDetail);
		diseaseDetailService.addDiseaseDetail(diseaseDetail1);
		diseaseDetailService.addDiseaseDetail(diseaseDetail);
		cardioDiagnosis.setDiseaseDetailList(diseaseDetailList);;
		
		List<EcgReport> ecgReportList = new ArrayList<>();
		EcgReportService ecgReportService = new EcgReportServiceImpl();
		EcgReport ecgReport = new EcgReport(1, LocalDateTime.now(), 1);
		EcgReport ecgReport1 = new EcgReport(2, LocalDateTime.now(), 2);
		ecgReportList.add(ecgReport1);
		ecgReportList.add(ecgReport);
		ecgReportService.addEcgReport(ecgReport1);
		ecgReportService.addEcgReport(ecgReport);
		cardioDiagnosis.setEcgReportList(ecgReportList);
		
		cardioDiagnosisService.addCardioDiagnosis(cardioDiagnosis);
		memberInfoService.addMemberInfo(memberInfo);
//		memberInfo.setAge(32);
//		memberInfoService.editMemberInfo(memberInfo);
		
		memberInfoService.getAllMemberInfo();
		
		
		
		
		
//		System.out.println( memberInfos);
	}

}
