package com.choa.member.student;

import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;
@Service
public class StudentServiceImpl implements MemberService {

	@Inject
	private StudentDAOImpl studentDAOImpl;
	
	
	
	@Override
	public int MemberJoin(MemberDTO memberDTO, HttpSession session) throws Exception {
			//memberDTO에 파일을 셋팅하기.
			//System.out.println(memberDTO.getF1().getOriginalFilename());
				FileSaver	fs = new FileSaver(); //여러곳에서 쓰지 않으니,, @respository 안씀
				String fileName =fs.filesave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1());
				memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
				memberDTO.setFilename(fileName);
				return studentDAOImpl.memberJoin(memberDTO);
	}
		//로ㅓ그인
	@Override
	public MemberDTO MemberLogin(MemberDTO memberDTO) throws Exception {
				
		return studentDAOImpl.memberLogin(memberDTO);
	}

		//마이페이지
	@Override
	public MemberDTO MemberPage(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.test(memberDTO);
	}

}
