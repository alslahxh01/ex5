<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			var path = '';
			$(".g").each(function() {
				if ($(this).prop("checked")) {
					path = $(this).val() + "Join";
				}
			});
			$("#frm").attr("action", path);
			$("#frm").submit();
		});
	});
</script>
</head>
<body>

	<form action="" id="frm" method="post" enctype="multipart/form-data">
		<div>
			학생<input type="radio" checked="checked" name="grade" value="student"
				class="g"> 선생<input type="radio" name="grade"
				value="teacher" class="g">

		</div>
		<!-- 공통 입력 -->
		<div>
			<p>
				아디<input type="text" name=id>
			</p>
			<p>
				패스<input type="password" name="pw">
			</p>
			<p>이름<input type="text" name="name"></p>
			<p>나이<input type="text" name="age"></p>
		<p>	파일이름<input type="file" name="f1"></p>
		</div>
		
		<!-- 학생 -->
		<div>
			 폰<input type="text" name="phone">
			선생아디<input type="text" name="tid">
		</div>

		<!-- 선생 -->
		<div>
			 담당과목<input type="text" name="subject">
			  입사일<input type="date" name="hiredate">
		</div>

		<input type="button" value="가입" id="btn">
	</form>

</body>
</html>