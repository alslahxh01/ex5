package com.choa.member.teacher;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class TeacherServiceImpl implements MemberService {

	@Inject
	private TeacherDAOImpl teacherDAOImpl;
	
	
	@Override
	public int MemberJoin(MemberDTO memberDTO,HttpSession session) throws Exception {
			FileSaver fs = new FileSaver();
			String fileName = fs.filesave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1());
			memberDTO.setFilename(fileName);
			memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
			
			return teacherDAOImpl.memberJoin(memberDTO);
	}


	@Override
	public MemberDTO MemberPage(MemberDTO memberDTO) throws Exception {
		return teacherDAOImpl.test(memberDTO);
	}


	@Override
	public MemberDTO MemberLogin(MemberDTO memberDTO) throws Exception {
				
		return teacherDAOImpl.memberLogin(memberDTO);
	}

}
