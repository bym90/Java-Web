<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- �� ������ �����ϴ� ���߿� ������ �߻��ϸ� �� ���� ��ſ� �ٸ� ������
�����ְ� �ʹ�.(Ŭ���̾�Ʈ���� �ٸ� ������ ��ü�Ͽ� �����ϰ� �ʹ�. --%>
<%@  page errorPage  = "Error.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>

<body>
<%-- �� ������ Ŭ���̾�Ʈ�� ��û�ϸ� �� ����� ������ �����̴�. --%>
<%
	String[] names = {"A", "B", "C", "D", "E"};
	int index = (int)(Math.random()*(5 - 0 + 1) + 0);
	String name = names[index]; 
%>

	<p> �̸��� <%= name %> �Դϴ�.</p> 
</body>
</html>