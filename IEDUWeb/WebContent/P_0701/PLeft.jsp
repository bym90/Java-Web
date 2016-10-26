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
	String news = "바이";
%>
	<p> 이 부분은 메뉴 부분입니다. </p>
 	<p> 메뉴 이름 : <%= news %></p>
</body>
</html>