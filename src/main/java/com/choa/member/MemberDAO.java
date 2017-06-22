package com.choa.member;

public interface MemberDAO {

	//Join
	public int memberJoin(MemberDTO memberDTO) throws Exception;
	//login
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception;
	//page
	public MemberDTO memberPage(String id) throws Exception;

}
