package com.choa.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping("/member/**")
public class StudentController {

		@Inject
		private StudentServiceImpl studentServiceImpl;
		
		
//			 ;
		@RequestMapping(value="studentJoin")
		public String studentJoin(){
			
			return "member/MemberJoin";
		}	
		
		
		
		
		@RequestMapping(value="/studentJoin" , method=RequestMethod.POST )
			public String studentJoin(Model model,StudentDTO studentDTO) throws Exception{
				
				int result = studentServiceImpl.MemberJoin(studentDTO);
				String message="Failed";
				if(result > 0){
					message="Success";
				}
			
				model.addAttribute("message",message);
				model.addAttribute("path","../"); //home
				return "common/result";
			}
		
}
