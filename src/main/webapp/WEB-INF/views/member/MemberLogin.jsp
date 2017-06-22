<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
</script>
<script type="text/javascript">
$(function(){
	$("#btn").click(function(){

		var path = '';
		$(".g").each(function() {
			if ($(this).prop("checked")) {
				path = $(this).val() + "Login";
			}
		});
		$("#frm").attr("action", path);
		$("#frm").submit();
		
	});

});


</script>

</head>
<body>
	
	<!-- member/teacherLogin  member/studentLogin -->
	<form action="" method="post" id="frm">
		<p>아이디 : <input type="text" name="id"></p>
		<p>비밀번호 : <input type="password" name="pw"></p>
		<p>학생<input type="radio" name="grade" value="student" checked="checked" class="g"></p>
		<p>선생<input type="radio" name="grade" value="teacher" class="g"></p>
		<input type="button" value="로그인" id="btn">
	</form>





</body>
</html>