package com.heartihealth.service;

import java.util.List;

import com.heartihealth.model.MemberInfo;

public interface MemberInfoService {

	public void addMemberInfo(MemberInfo memberInfo);
	public void editMemberInfo(MemberInfo memberInfo);
	public void removeMemberInfo(int id);
	public List<MemberInfo> getAllMemberInfo();

}
