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
		String[] temp = {"���ǰ���", "��", "����", "��ȭ", "����", "�", "����Ž��", "����"};
		// hobby��� name�Ӽ��� ������ �����Ƿ� �Ѱ��� ������ ����.
		String[] hobbys = request.getParameterValues("hobby");
		// üũ�ڽ��� ���õ� �͸� ������ ���۵ǹǷ� ��̴� �������� ������
		// ���߿� ��� ���۵����� �𸣴� �����̴�.
		// ���۵� �������� ������ �˾Ƴ� �� �ִ�.
		int size = hobbys.length;
		StringBuffer buff = new StringBuffer();
		for(int i=0; i<size; i++){
			int pos = Integer.parseInt(hobbys[i]);
			// ���ǰ��� �����ϸ� �����δ� 0�� ������ �����Ѵ�.
			buff.append(temp[pos]);
			if(i<size -1){
				buff.append(" , ");
			}
		}
	%>
	<p> ����� ��̴� <%= buff.toString() %> �̴�.</p>

 
</body>
</html>