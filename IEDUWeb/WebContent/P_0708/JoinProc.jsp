<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<body>
<%-- 데이터 빈 클래스를 new 시킨다. --%>
 	<jsp:useBean id="bean" class="P_0708.JoinData"/>
<%-- set함수를 실행하면 데이터 빈클래스에 클라이언트가 준 정보가 기억된다. --%>
	<jsp:setProperty property="*" name="bean"/>
	
	당신의 아이디는 <jsp:getProperty property="id" name="bean"/> 입니다.<br>
	나머지도 같은 방식으로 출력<br>
	당신의 나이는 <jsp:getProperty property="age" name="bean"/> 입니다.	
	<%
		// 만약 이 데이터를 기억할 필요가 있다면 자바적으로 이 데이터를 이용해야한다.
		// 데이터베이스에 입력해야 한다면
		String id = bean.getId();
	%>
</body>
</html>