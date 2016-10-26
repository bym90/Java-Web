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
		// 클라이언트가 선택한 라디오 단추의 값(value)을 알아낸다.
		String dap = request.getParameter("survey");
		// 이 선택한 값을 데이터베이스에 기록한다.
		// 1. 드라이버 로딩
		MyJDBC db = new MyJDBC();
		// 2. 접속
		Connection con = db.getCON();
		// 3. 스테이트먼트 만든다.
		Statement stmt = db.getSTMT(con);
// 		String sql = "update survey set dap_1 = dap_1 +1";
		// 4. 질의 명령을 만든다.
		String sql = "update survey set " + dap + " = " + dap + " + 1";
		// 5. 실행한다.
		stmt.execute(sql);
		db.close(stmt);
		db.close(con);
		// JSP는 내부적으로 예외처리가 되어있어서 try~catch를 하지 않아도 상관없다.
		// 단, 예외가 발생하면 내부적으로 처리되었으므로 개발자가 보기 힘들다.
	%>
 	<p>설문 참여가 성공적으로 되었습니다</p>
 	<p>다시 설문조사를 하시려면 <a href="http://localhost:8080/IEDUWeb/P_0705/SurveyMain.jsp">Click</a></p>
</body>
</html>