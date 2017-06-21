package com.choa.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping("/member/**")
public class TeacherController {

		@Inject
		private TeacherServiceImpl teacherServiceImpl;
			
		
		
		@RequestMapping(value="sdd", method=RequestMethod.GET)
		public void studentJoin(){}	

		@RequestMapping(value="/teacherJoin" , method=RequestMethod.POST )
		public String teacherJoin(Model model,TeacherDTO teacherDTO) throws Exception{
			System.out.println();
			int result = teacherServiceImpl.MemberJoin(teacherDTO);
			String message="Failed";
			if(result > 0){
				message="Success";
			}
		
			model.addAttribute("message",message);
			model.addAttribute("path","../"); //home
			return "common/result";
		}
		
	
	
}


