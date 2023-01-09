package com.heartihealth.serviceImpl;

import java.util.List;

import com.heartihealth.dao.MemberInfoDao;
import com.heartihealth.daoImpl.MemberInfoDaoImpl;
import com.heartihealth.model.MemberInfo;
import com.heartihealth.service.MemberInfoService;

public class MemberInfoServiceImpl implements MemberInfoService {

	MemberInfoDao memberInfoDao = new MemberInfoDaoImpl();
	
	public MemberInfoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMemberInfo(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		memberInfoDao.saveMemberInfo(memberInfo);
	}

	@Override
	public void editMemberInfo(MemberInfo memberInfo) {
		// TODO Auto-generated method stub
		memberInfoDao.updateMemberInfo(memberInfo);
	}

	@Override
	public void removeMemberInfo(int id) {
		// TODO Auto-generated method stub
		memberInfoDao.deleteMemberInfo(id);
	}

	@Override
	public List<MemberInfo> getAllMemberInfo() {
		// TODO Auto-generated method stub
		return memberInfoDao.getMemberInfo();
	}

}
