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
	// Ŭ���̾�Ʈ�� �� �ΰ� ������ ����.
	String id = request.getParameter("id"); // id=??�� ���޵� ������ ��� ����̴�.
	String pw = request.getParameter("pw"); // pw=??�� ���޵� ������ ��� ����̴�.
	// ������ Ŭ���̾�Ʈ�� �� ��� �����͸� String���θ� �޾ƾ��Ѵ�.
	// �׸��� �ʿ��ϴٸ� ���ϴ� ���·� �� ��ȯ�ؼ� ����ؾ� �Ѵ�.
	// Ŭ���̾�Ʈ�� �����͸� �ٶ� ����� Ű���� ��ҹ��ڸ� �����ϸ�
	// ��Ȯ�ϰ� ��ġ���Ѿ� �Ѵ�.
	%>
 	<p>����� ���̵�� <%= id %> �Դϴ�.</p>
 	<p>����� ��й�ȣ�� <%= pw %> �Դϴ�.</p>
 	
 	<%-- http://localhost:8080/IEDUWeb/P_0704/getParameter_02.jsp?id=bym90&pw=1234 --%>
</body>
</html>