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
	// 스크립트 릿은 HTML이 하지 못하는 기능(변수에 저장기능)
	String name = "안녕";
	int  age = 27;
%>
	<p> 당신의 이름은 <%= name %> 입니다 </p>
	<p> 당신의 나이는 <%= age %> 입니다	</p>
	
 
</body>
</html>