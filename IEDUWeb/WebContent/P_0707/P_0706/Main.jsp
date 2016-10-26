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
	//클라이언트가 준 id를 받는다.
// 	String id = request.getParameter("id");
// 	String id = (String) session.getAttribute("id");
	String id = (String) application.getAttribute("id");
// 	String id = (String) request.getAttribute("name");
// 	String id = (String) pageContext.getAttribute("name");
%>
	메인 화면 쨘~ <%=id %> 환영해요~
</body>
</html>