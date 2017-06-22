package com.choa.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping("/member/**")
public class TeacherController {

		@Inject
		private TeacherServiceImpl teacherServiceImpl;
			
		
		
		//마이페이지		
		@RequestMapping(value="/memberPage", method=RequestMethod.GET)
		public void studentPage(HttpSession session,Model model) throws Exception{
			MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
			MemberDTO memberDTO2=teacherServiceImpl.MemberPage(memberDTO);//덮어쓰면 안되니 새로운 객체 생성
			
			model.addAttribute("teacher", memberDTO2);

}
		//로그인
		@RequestMapping(value="teacherLogin")
		public String teacherLogin(){
			return "member/MemberLogin";
		}	
		@RequestMapping(value="/teacherLogin", method=RequestMethod.POST)
		public ModelAndView teacherLogin(Model model, MemberDTO memberDTO,HttpSession session) throws Exception{
			memberDTO=teacherServiceImpl.MemberLogin(memberDTO);
			
			String message = "로그인 실패";
			if(memberDTO != null){
				session.setAttribute("member", memberDTO);
				message= "로그인 성공";
			}
			ModelAndView mv = new ModelAndView();
			mv.addObject("message", message);
			mv.addObject("path","../");
			mv.setViewName("common/result");
			return mv;
		}
		
		
		
		
		
		@RequestMapping(value="teacherJoin")
		public String teacherJoin(){
			return "member/MemberJoin";
		}	

		@RequestMapping(value="/teacherJoin" , method=RequestMethod.POST )
		public String teacherJoin(Model model,TeacherDTO teacherDTO,HttpSession session) throws Exception{
				System.out.println("@@@@@@@@@@@@@@@ TEACHER JOIN");
			int result = teacherServiceImpl.MemberJoin(teacherDTO,session);
			String message="Failed";
			if(result > 0){
				message="Success";
			}
		
			model.addAttribute("message",message);
			model.addAttribute("path","../"); //home
			return "common/result";
		}
		
	
	
}


