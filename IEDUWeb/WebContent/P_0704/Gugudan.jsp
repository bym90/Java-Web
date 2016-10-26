<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%-- 구구단 테이블을 만들어보자 --%>
	<table width = "800" align = "center" border = "1">
	<%
	for(int dan = 1; dan <= 9; dan++){
		// 간단한 출력은 굳이 스크립트 릿을 닫지 않고 출력할 수 있도록 하는 객체
		out.println("<tr>");
		for(int i = 1; i <= 9; i++){
			out.println("<td>");
			out.println(dan + " * " + i + " = " + (dan * i));
			out.println("</td>");
		}
		out.println("</tr>");
	}
	%>	
	</table>
</body>
</html>