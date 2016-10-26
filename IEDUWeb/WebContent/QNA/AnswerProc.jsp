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
	// 답변이 완료되면 다른 문서를 보여주도록 하면 된다.
	// 나는 질문 목록을 보여줄 생각이다.
	response.sendRedirect("../QNA/QNAList.kim");
%>
 
</body>
</html>