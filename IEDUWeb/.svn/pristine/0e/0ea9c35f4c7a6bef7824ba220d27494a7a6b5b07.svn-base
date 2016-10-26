<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../Base.css">
<title>JSP</title>
</head>
<script>
	function BoardCheck() {
		// 무결성 검사
		var form = document.getElementById("bfrm");
		form.action = "../ReBoard/BoardWriteProc.bmw";
		form.submit();
	}
</script>
<body>
<%--
	글쓴이, 제목, 본문을 입력 받을 수 있는 폼을 만들어서 제공하면 된다.
 --%>
<form method="post" name="bfrm" id="bfrm" action="">
	<table class="TABLESTYLE1 OUTLINE1 W600P">
		<tr>
			<th>글쓴이</th>
			<td>
				<input type="text" name="writer" id="writer">
			</td>
		</tr>
		<tr>
			<th>글제목</th>
			<td>
				<input type="text" name="title" id="title">
			</td>
		</tr>
		<tr>
			<th>글내용</th>
			<td>
				<textarea name="body" id="body" cols="60" rows="10"></textarea>
			</td>
		</tr>
		<tr>
<%-- 
	<a> 역시 JavaScript를 이용해서 사용할 수 있따.
	방법 1. href="#"으로 처리한다.
			생략하거나 href=""로 하면 자바스크립트 함수가 호출되지 않는다.
		 2. Onclick="함수이름()" 으로 처리한다.
--%>
			<td colspan="2" align="center">
				<a href="#" id="send" Onclick="BoardCheck()" class="A">글쓰기</a>
			</td>
		</tr>
	</table>
</form>
 
</body>
</html>