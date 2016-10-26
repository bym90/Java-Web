<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- 이 문서를 실핼하는 도중에 에러가 발생하면 이 문서 대신에 다른 문서를
보여주고 싶다.(클라이언트에게 다른 문서로 대체하여 응답하고 싶다. --%>
<%@  page errorPage  = "Error.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>

<body>
<%-- 이 문서는 클라이언트가 요청하면 그 결과를 보여줄 문서이다. --%>
<%
	String[] names = {"A", "B", "C", "D", "E"};
	int index = (int)(Math.random()*(5 - 0 + 1) + 0);
	String name = names[index]; 
%>

	<p> 이름은 <%= name %> 입니다.</p> 
</body>
</html>