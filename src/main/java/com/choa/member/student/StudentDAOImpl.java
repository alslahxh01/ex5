package com.choa.member.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;



@Repository
public class StudentDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "StudentMapper.";
	private final String NAMESPACE2 = "MemberMapper."; 
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
	
		int result = sqlSession.insert(NAMESPACE2+"joinMember",memberDTO);
		if(result >0){
			result = sqlSession.insert(NAMESPACE+"joinStudent",memberDTO);
			System.out.println("result : "+result);
		}
		return result;
	}
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberLogin",memberDTO);
	}
	
	@Override
	public MemberDTO memberPage(String id) throws Exception {
			return sqlSession.selectOne(NAMESPACE+"memberPage",id);
	}
	
	
	public MemberDTO test(MemberDTO memberDTO){
		return sqlSession.selectOne(NAMESPACE+"memberLogin",memberDTO);
	}
		
	
}
