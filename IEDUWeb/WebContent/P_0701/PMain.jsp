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
	String news = "�ȳ�";
%>
	<table border = "1" width = "900">
	<tr height = "700">
		<td width = "700">
			<p> �����κ� </p>
			<p> �������� : <%= news %></p>
		</td>
		<td width = "200">
		<%-- ������ �̰��� �޴��� ������ �ϴµ� �̹� ����� ����
		�޴��� �̰��� ��ġ��. --%>
		<%-- <%@ include file = "PLeft.jsp" %> --%>
		</td>
	</tr>
	<tr height = "200">
		<td colspan = "2">
		<%-- ���۱� ǥ�õ� �κ�. �Ź��� ������ �ϴ°��� ��Ģ�̴�.
		�̹� ����� ���� ���۱��� �̰��� ��ġ��. --%>
		<%@ include file = "PFooter.jsp" %>
		</td>
	</tr>
	</table>
</body>
</html>