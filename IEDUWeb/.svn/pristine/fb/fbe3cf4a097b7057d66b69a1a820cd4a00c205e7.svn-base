<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<%
		// 한글이 깨지지 않도록 조작하자.
		request.setCharacterEncoding("EUC-KR");
		// 폼에 있는 데이터를 받아보자
		String id = request.getParameter("id"); // id는 name속성의 값을 사용한 것이다.
		String pw = request.getParameter("pw");	// pw는 name속성의 값을 사용한 것이다.
	%>
 		<p>당신의 아이디는 <%= id %></p>
 		<p>당신의 비밀번호는 <%= pw %></p>
</body>
</html>