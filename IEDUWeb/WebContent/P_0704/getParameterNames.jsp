<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<%
		//	한글이 깨지지 않도록 조작하자.
		request.setCharacterEncoding("EUC-KR");
	
		//	폼에 있는 데이터를 받아보자.
		
		//	결론	GET로 오던 POST로 오던 서버가 데이터를 받는 방법은 동일하다.
		String	id = request.getParameter("id");	//	id는 name 속성의 값을 사용한 것이다.
		String	pw = request.getParameter("pw");	//	pw는 name 속성의 값을 사용한 것이다.
		
		Enumeration	en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String	key = (String)en.nextElement();
			out.println("당신이 준 키값 = " + key);
		}
	%>

	<p>당신의 아이디는 <%= id %>이군요</p>
	<p>당신의 비밀번호는 <%= pw %>이군요</p>
 
</body>
</html>