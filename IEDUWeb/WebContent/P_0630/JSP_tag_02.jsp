<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	

	<p>����� �̸��� <%=getName()%> �Դϴ�</p>

<%! 
	// ���� ������ ����ų� �Լ��� ����� ������
    // ��ġ�� �ٲ� ����
 	String[] name = {"A", "B", "C", "D", "E"};
	public String getName(){
		int pos = (int)(Math.random()*(4-0+1)+0);
	    return name[pos];
	}
%>
 
</body>
</html>