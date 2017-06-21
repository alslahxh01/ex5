package com.choa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class FileSaver {
		
	//파일 세이브만 전문으로 하는 클래스
	//경로명하고 파일이름만 주면 저장해줌
	public String filesave(String realPath, String oriName,byte [] filedata) throws Exception{ //바이트 타입을 받는것은 Controller에서 File 할때 byte[]배열 타입을 해서
		File file = new File(realPath);
			//폴더가 존재하지 않으면 폴더를 만들어줘라
		if(!file.exists()){
			file.mkdirs();
		}
		String fileName = UUID.randomUUID().toString()+"_"+oriName; //업로드 시 저장되는 실제 파일이름.
		//DB에 셋팅 시키기
		File target = new File(file,fileName); //경로명과 저장되는 실제파일명
		FileCopyUtils.copy(filedata, target); //파일데이터를 꺼내와 타겟으로 저장해주겠다. return 파일네임
			return fileName;
	}
}