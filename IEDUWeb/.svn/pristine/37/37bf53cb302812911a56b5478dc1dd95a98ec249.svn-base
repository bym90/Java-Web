<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="P_0708.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%-- Test.java 파일을 new시키자 --%>
<%
	// Test t = new Test();
%> 
	<jsp:useBean id="t" class="P_0708.Test" scope="page"/>
<%
	// new가 되었는지 확인
	t.setName("안녕");
	String name = t.getName();
%>	
	당신의 이름은 <%=name %> 이군요
</body>
</html>