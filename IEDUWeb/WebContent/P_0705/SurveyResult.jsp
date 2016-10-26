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
		// 각 항목의 백분율을 구한다.
		// 그러기 위해서는 데이터베이스에서 데이터를 가지고 와야한다.
		MyJDBC db = new MyJDBC();
		Connection con = db.getCON();
		Statement stmt = db.getSTMT(con);
		
		String sql = "select * from survey";
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();
		// 가져온 데이터를 꺼내서 변수에 기억한다.
		int[] daps = new int[4];
		for(int i = 0; i<daps.length; i++){
			daps[i] = rs.getInt(i+1);
			// 배열은 0부터 시작하지만
			// 데이터베이스는 1부터 시작한다.
		}
		// 백분율을 구하기 위해서 총 참여수를 구한다.
		int total = 0;
		for(int i=0; i<daps.length; i++){
			total = total + daps[i];
		}
		// 백분율을 구한다.
		int[] per = new int[4];
		for(int i=0; i<per.length; i++){
			per[i] = (daps[i]*100/total);
			// integer형이라서 0.xxxx나와도 0이 되므로 *100을 먼저해준것임
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