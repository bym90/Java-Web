<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<!-- 	<form method="GET" action="http://localhost:8080/IEDUWeb/P_0704/Out.jsp"> -->
	<%-- �����۸�ũ�� 100% get�̰�
		 ������ ������ ��ȯ����̹Ƿ� ó�� �ӵ��� ������.
		 ������ ��û ������ ��� ����ǰ� ������ ��ȯ����̹Ƿ� �뷮�� �����ʹ� ������ �����.
		 
		 ���� get�̳� post ���߿� ������ �� �ִ�. post��
		 ������ ��û ������ ������� �ʰ�, ��Ʈ��ó�� ����̹Ƿ� ���� �����͵� �����͸� ���
		 ��������� ������ ������ ������ �ʴ´�.
		 ������ ���������� ��Ʈ������ ��ȭ�ؼ� ó���ϹǷ� ó���ӵ��� ���� ������.
		 
		 get����� ������ ����ǰ� post����� ������ ������� �ʴ´�.--%>
	<form method="POST" action="http://localhost:8080/IEDUWeb/P_0704/Out.jsp">
		<input type="text"  name=id><br>
		<input type="submit" value="����">
	</form>
 
</body>
</html>