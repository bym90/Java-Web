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
		//	�ѱ��� ������ �ʵ��� ��������.
		request.setCharacterEncoding("EUC-KR");
	
		//	���� �ִ� �����͸� �޾ƺ���.
		
		//	���	GET�� ���� POST�� ���� ������ �����͸� �޴� ����� �����ϴ�.
		String	id = request.getParameter("id");	//	id�� name �Ӽ��� ���� ����� ���̴�.
		String	pw = request.getParameter("pw");	//	pw�� name �Ӽ��� ���� ����� ���̴�.
		
		Enumeration	en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String	key = (String)en.nextElement();
			out.println("����� �� Ű�� = " + key);
		}
	%>

	<p>����� ���̵�� <%= id %>�̱���</p>
	<p>����� ��й�ȣ�� <%= pw %>�̱���</p>
 
</body>
</html>