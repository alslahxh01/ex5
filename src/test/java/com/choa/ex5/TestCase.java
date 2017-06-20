package com.choa.ex5;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCase extends MyAbstractTestUnit {

	@Autowired
	private SqlSession session;
	
	@Test
	public void test(){
		
		assertNotNull(session);
		
	}
	
	
	
}
