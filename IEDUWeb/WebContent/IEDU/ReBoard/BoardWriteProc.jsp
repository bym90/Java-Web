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
	// 쓰기의 결과는 보여줄 것이 없고
	// 대신 목록보기를 보여주도록 한다.
	response.sendRedirect("../ReBoard/BoardList.bmw");
%>
 
</body>
</html>