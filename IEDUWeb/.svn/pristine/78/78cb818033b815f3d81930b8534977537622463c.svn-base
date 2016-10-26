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
	// 클라이언트가 준 부가 정보를 얻어보자.
	String id = request.getParameter("id"); // id=??로 전달된 정보를 얻는 방법이다.
	String pw = request.getParameter("pw"); // pw=??로 전달된 정보를 얻는 방법이다.
	// 서버는 클라이언트가 준 모든 데이터를 String으로만 받아야한다.
	// 그리고 필요하다면 원하는 형태로 형 변환해서 사용해야 한다.
	// 클라이언트가 데이터를 줄때 사용한 키값은 대소문자를 구분하며
	// 정확하게 일치시켜야 한다.
	%>
 	<p>당신의 아이디는 <%= id %> 입니다.</p>
 	<p>당신의 비밀번호는 <%= pw %> 입니다.</p>
 	
 	<%-- http://localhost:8080/IEDUWeb/P_0704/getParameter_02.jsp?id=bym90&pw=1234 --%>
</body>
</html>