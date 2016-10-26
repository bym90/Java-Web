<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*, SQL.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<%
		// �� �׸��� ������� ���Ѵ�.
		// �׷��� ���ؼ��� �����ͺ��̽����� �����͸� ������ �;��Ѵ�.
		MyJDBC db = new MyJDBC();
		Connection con = db.getCON();
		Statement stmt = db.getSTMT(con);
		
		String sql = "select * from survey";
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();
		// ������ �����͸� ������ ������ ����Ѵ�.
		int[] daps = new int[4];
		for(int i = 0; i<daps.length; i++){
			daps[i] = rs.getInt(i+1);
			// �迭�� 0���� ����������
			// �����ͺ��̽��� 1���� �����Ѵ�.
		}
		// ������� ���ϱ� ���ؼ� �� �������� ���Ѵ�.
		int total = 0;
		for(int i=0; i<daps.length; i++){
			total = total + daps[i];
		}
		// ������� ���Ѵ�.
		int[] per = new int[4];
		for(int i=0; i<per.length; i++){
			per[i] = (daps[i]*100/total);
			// integer���̶� 0.xxxx���͵� 0�� �ǹǷ� *100�� �������ذ���
		}
		
		db.close(rs);
		db.close(stmt);
		db.close(con);
	%>
	
	<table width="800" border="1" align="center">
		<%
		for(int i=0; i<4; i++){
		%>	
			<tr>
				<td width="50"><%= (i + 1) %></td>
				<td width="750">
				<%
					for(int j=1; j<=per[i]; j++){
						out.print("<img src='"+(i+1)+".png'>");
					}
				%>
					<%= per[i] %> % 
				</td>
			</tr>
		<%	
		}
		%>
	</table>
 
</body>
</html>