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
		// �ѱ��� ������ �ʵ��� ��������.
		request.setCharacterEncoding("EUC-KR");
		// ���� �ִ� �����͸� �޾ƺ���
		String id = request.getParameter("id"); // id�� name�Ӽ��� ���� ����� ���̴�.
		String pw = request.getParameter("pw");	// pw�� name�Ӽ��� ���� ����� ���̴�.
	%>
 		<p>����� ���̵�� <%= id %></p>
 		<p>����� ��й�ȣ�� <%= pw %></p>
</body>
</html>