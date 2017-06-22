package com.choa.ex5;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;


@Controller
public class FileUploadController {

		@RequestMapping("/test/fileUpForm")
		public void fileUp(){}
		
//	@RequestMapping(value="/test/fileUp1", method= RequestMethod.POST)	
//	public void fileUpload1(String name, MultipartHttpServletRequest mRequest) throws Exception{//아직 저장이 안된 Request임
//					System.out.println("Name : "+name);
//					
//					//합쳐진 리퀘스트에서 멀티파트 파일이라는 것을 가져와야함. 
//					MultipartFile f = mRequest.getFile("f1"); //컨트롤러로 보내온 파라미터 이름 지정 f1
//					System.out.println("get Name : "+f.getName()); //jsp에서 지정한 파라미터 이름
//					System.out.println("ori Name : "+f.getOriginalFilename()); //파일 오리지널 이름 
//					System.out.println("get Size : "+f.getSize()); //파일사이즈
//					String path = mRequest.getSession().getServletContext().getRealPath("resources/upload");
//					FileSaver fSaver = new FileSaver();
//					fSaver.filesave(path, f.getOriginalFilename(), f.getBytes());
//					
//	}
	
//	@RequestMapping(value="/test/fileUp1", method= RequestMethod.POST)	
//		public void fileUpload2(String name, MultipartFile f1,HttpSession session) throws Exception{ //멀티파트 이름을 파라미터 이름과 동일하게 잡아줘야한다 ★★★★
//			System.out.println("1get Name : "+f1.getName()); //jsp에서 지정한 파라미터 이름
//			System.out.println("1ori Name : "+f1.getOriginalFilename()); //파일 오리지널 이름 
//			System.out.println("1get Size : "+f1.getSize()); //파일사이즈
//			//이러면 Request가 없어서 리얼path 가져오는 부분에서 문제가 생긴다.
//			String path=session.getServletContext().getRealPath("resources/upload");
//			FileSaver fSaver = new FileSaver();
//			fSaver.filesave(path, f1.getOriginalFilename(), f1.getBytes());
//		}
		@RequestMapping(value="/test/fileUp1", method= RequestMethod.POST)	
		public void fileUplaod3(FileDTO fileDTO,HttpSession session) throws Exception{ //3번째 방법 파라미터로  DTO 받기
			FileSaver fs = new FileSaver();
			String realPath = session.getServletContext().getRealPath("resources/upload");
			
//			fs.filesave(realPath, fileDTO.getF1().getOriginalFilename(), fileDTO.getF1().getBytes());
			fs.filesave(realPath, fileDTO.getF1());
			
		}
		
	
}
