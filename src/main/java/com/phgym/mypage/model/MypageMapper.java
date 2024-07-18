package com.phgym.mypage.model;

import java.time.LocalDate;
import java.util.List;

public interface MypageMapper {

	public int doCheckin(int sessionUserNo);
	
	public int checkCheckin(int sessionUserNo);
	
	public int doTransfer(MembershipPayHisDTO dto);
	
	public int updateRemarkTransferState(MembershipPayHisDTO dto);
	
	public LocalDate selectEndDate(int membershipPayNo);
	
	public List<MembershipPayHisDTO> checkTransfer(int membershipPayNo);
	
	public List<CheckinHisDTO> getCheckinList(int sessionUserNo);

	public List<CheckinListDTO> getMembershipPeriod(CheckinHisDTO checkinHisDto);
}
