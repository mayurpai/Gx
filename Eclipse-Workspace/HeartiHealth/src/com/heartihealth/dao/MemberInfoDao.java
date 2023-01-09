package com.heartihealth.dao;

import java.util.List;

import com.heartihealth.model.MemberInfo;

public interface MemberInfoDao {

	public void saveMemberInfo(MemberInfo memberInfo);
	public void updateMemberInfo(MemberInfo memberInfo);
	public void deleteMemberInfo(int id);
	public List<MemberInfo> getMemberInfo();

}
