<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
	<%
		// 클라이언트가 이 문서를 요청하며 프로토콜에 의해서 
		// 웹부라우저가 생성한 세션ID를 가지고 들어오도록 되어있다.
		String sessionID = session.getId();
	%>
	세션아이디는 <b><%= sessionID %></b> 입니다.^-^
</body>
</html>