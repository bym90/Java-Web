<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%
	String news = "안녕";
%>
	<table border = "1" width = "900">
	<tr height = "700">
		<td width = "700">
			<p> 뉴스부분 </p>
			<p> 뉴스제목 : <%= news %></p>
		</td>
		<td width = "200">
		<%-- 원래는 이곳에 메뉴를 만들어야 하는데 이미 만들어 놓은
		메뉴를 이곳에 합치자. --%>
		<%-- <%@ include file = "PLeft.jsp" %> --%>
		</td>
	</tr>
	<tr height = "200">
		<td colspan = "2">
		<%-- 저작권 표시될 부분. 매버너 만들어야 하는것이 원칙이다.
		이미 만들어 놓은 저작권을 이곳에 합치자. --%>
		<%@ include file = "PFooter.jsp" %>
		</td>
	</tr>
	</table>
</body>
</html>