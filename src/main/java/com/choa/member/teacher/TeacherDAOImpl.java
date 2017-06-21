package com.choa.member.teacher;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;
@Repository
public class TeacherDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "TeacherMapper.";
	private final String NAMESPACE2 = "MemberMapper."; 
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		
		int result = sqlSession.insert(NAMESPACE2+"joinMember",memberDTO);
		
		if(result>0){
			result = sqlSession.insert(NAMESPACE+"joinTeacher", memberDTO);
		}
		return result;
	}

	
}
