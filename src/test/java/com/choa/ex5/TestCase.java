package com.choa.ex5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;
import com.choa.member.teacher.TeacherDAOImpl;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

public class TestCase extends MyAbstractTestUnit {

	@Autowired
	private StudentServiceImpl studentServiceImpl;
//	@Autowired
//	private StudentDAOImpl studentDAOImpl;
	@Autowired
	private TeacherServiceImpl teacherServiceImpl;
//	@Autowired
//	private TeacherDAOImpl teacherDAOImpl;
	
	
	//미리 객체를 만들어놓고
	private static StudentDTO studentDTO;
	private static TeacherDTO teacherDTO;

	@Test
	public void test() throws Exception{
		
//		assertNotNull(teacherDAOImpl);
//int result = studentDAOImpl.memberJoin(studentDTO);
//		int result = teacherDAOImpl.memberJoin(teacherDTO);
		int result=teacherServiceImpl.MemberJoin(teacherDTO);
		assertEquals(1, result);
	}
	@BeforeClass
	public static void makeStudent(){ //클래스 실행 전 객체를 만들어놓자, 이로인해 위에 static 을 줘야함
//		studentDTO = new StudentDTO();
//		studentDTO.setId("df3344h");
//		studentDTO.setPw("dd255");
//		studentDTO.setName("dd366");
//		studentDTO.setAge(44);
//		studentDTO.setGrade("dd774");
//		studentDTO.setFilename("d88d5");
//		studentDTO.setOriname("d99d6");
//		studentDTO.setSid("dfghd77fgfdh");
//		studentDTO.setPhone("01010401010");
//		studentDTO.setTid("iu33333");
		
		teacherDTO = new TeacherDTO();
		teacherDTO.setId("kimohohoh45");
		teacherDTO.setPw("kim12322");
		teacherDTO.setName("ohdae3");
		teacherDTO.setAge(42);
		teacherDTO.setGrade("g5");
		teacherDTO.setFilename("ff1");
		teacherDTO.setOriname("dd234");
		teacherDTO.setTid("kimohohoh45");
		teacherDTO.setSubject("hh");
		
	}
	
	
	
}
