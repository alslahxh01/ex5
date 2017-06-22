package com.choa.member;

import javax.servlet.http.HttpSession;

public interface MemberService {

	//Join	
	public int MemberJoin(MemberDTO memberDTO,HttpSession hSession) throws Exception; //세션까지 넘기자
	//Login
	public MemberDTO MemberLogin(MemberDTO memberDTO) throws Exception;
	//page
	public MemberDTO MemberPage(MemberDTO memberDTO) throws Exception;
	
}
