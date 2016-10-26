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
		// 로그인을 한것을구분하는 방버비 수첩에 id나 nick이 있는지를
		// 가지고 구분했다.
		// 그러므로 logout은 수첩에 있는 id나 nick을 지우면 될것이다.
		session.removeAttribute("ID");
		session.removeAttribute("NICK");
		
		response.sendRedirect("MainForm.jsp");
	%>
 
</body>
</html>