<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%-- ������ ���̺��� ������ --%>
	<table width = "800" align = "center" border = "1">
	<%
	for(int dan = 1; dan <= 9; dan++){
		// ������ ����� ���� ��ũ��Ʈ ���� ���� �ʰ� ����� �� �ֵ��� �ϴ� ��ü
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