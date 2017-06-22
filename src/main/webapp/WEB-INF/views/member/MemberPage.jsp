<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--  마이 페이지 -->
<h2>마이페이지 입니다@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@</h2>
	<div>
	<label>내아디 : ${member.id}</label><br>
	<label>내 비번 : ${member.pw }</label><br>
	<label>내 이름 : ${member.name}</label><br>
	<label>내이미지 : <img src="../resources/upload/${member.filename}"></label><br>
	</div>
	<!-- 학생정보 -->
	<div>
	<p>phone : ${student.phone} </p>
	<p>TID : ${student.tid}</p>
	</div>
	<!-- 선생정보 -->
	<div>
	<p>선생 과목 : ${teacher.subject}</p>
	<p></p>
	</div>

</body>
</html>