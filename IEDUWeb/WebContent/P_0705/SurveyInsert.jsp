<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*, SQL.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<%
		// Ŭ���̾�Ʈ�� ������ ���� ������ ��(value)�� �˾Ƴ���.
		String dap = request.getParameter("survey");
		// �� ������ ���� �����ͺ��̽��� ����Ѵ�.
		// 1. ����̹� �ε�
		MyJDBC db = new MyJDBC();
		// 2. ����
		Connection con = db.getCON();
		// 3. ������Ʈ��Ʈ �����.
		Statement stmt = db.getSTMT(con);
// 		String sql = "update survey set dap_1 = dap_1 +1";
		// 4. ���� ������ �����.
		String sql = "update survey set " + dap + " = " + dap + " + 1";
		// 5. �����Ѵ�.
		stmt.execute(sql);
		db.close(stmt);
		db.close(con);
		// JSP�� ���������� ����ó���� �Ǿ��־ try~catch�� ���� �ʾƵ� �������.
		// ��, ���ܰ� �߻��ϸ� ���������� ó���Ǿ����Ƿ� �����ڰ� ���� �����.
	%>
 	<p>���� ������ ���������� �Ǿ����ϴ�</p>
 	<p>�ٽ� �������縦 �Ͻ÷��� <a href="http://localhost:8080/IEDUWeb/P_0705/SurveyMain.jsp">Click</a></p>
</body>
</html>