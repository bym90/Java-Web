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
	// ��ũ��Ʈ ���� HTML�� ���� ���ϴ� ���(������ ������)��
	// ��� ����ϱ� ���� ���̴�.
	// �̺κ��� ������ ����� �� ��ġ Mainó�� ���������� ����ȴ�.
	String name = "�ȳ�";
	int  age = 27;
%>
	<p> ����� �̸��� <%= name %> �Դϴ� </p>
	<p> ����� ���̴� <%= age %> �Դϴ�	</p>
	
 
</body>
</html>