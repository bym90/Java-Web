<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%-- �غ�� ��̸� �����ִ� ������ �ۼ�����. --%>
	<form method="POST" action="http://localhost:8080/IEDUWeb/P_0704/getParameterValueReceive.jsp">
		<table width="800" border="1" align="center">
			<tr>
				<td width="15%">���</td>
				<td width="*">
				<%-- üũ�ڽ��� ������ �͸� ������ ���۵ȴ�.
					 ��, ������ true, ��Ҵ� false�� ���۵Ǵ°��� �ƴ�
					 
					 ���۵Ǵ� ������ ȭ�鿡 ���̴� ������ �ƴϰ�
					 value�Ӽ����� ������ ������ ���۵ȴ�.
					 
					 ������ textó�� ����ڰ� �Է��ϴ� ���� �����ϰ���
					 ������ Value�Ӽ��� ���۵ȴ�.
					 
					 üũ�ڽ��� ���鶧 value�� �������� �������� �ƹ��͵� ���۵��� �ʴ´�.--%>
					<input type="checkbox" value="0" name="hobby">���ǰ���
					<input type="checkbox" value="1" name="hobby">��
					<input type="checkbox" value="2" name="hobby">����
					<input type="checkbox" value="3" name="hobby">��ȭ<br>
					<input type="checkbox" value="4" name="hobby">����
					<input type="checkbox" value="5" name="hobby">�
					<input type="checkbox" value="6" name="hobby">����ž��
					<input type="checkbox" value="7" name="hobby">����
					
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�������">
				</td>
			</tr>
		</table>
	</form>
 
</body>
</html>