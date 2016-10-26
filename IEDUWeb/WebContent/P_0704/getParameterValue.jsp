<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%-- 준비된 취미를 보여주는 문서를 작성하자. --%>
	<form method="POST" action="http://localhost:8080/IEDUWeb/P_0704/getParameterValueReceive.jsp">
		<table width="800" border="1" align="center">
			<tr>
				<td width="15%">취미</td>
				<td width="*">
				<%-- 체크박스는 선택한 것만 서버에 전송된다.
					 즉, 선택은 true, 취소는 false로 전송되는것이 아님
					 
					 전송되는 내용이 화면에 보이는 내용이 아니고
					 value속성으로 지정된 내용이 전송된다.
					 
					 참고로 text처럼 상요자가 입력하는 것을 제외하고는
					 모든것이 Value속성이 전송된다.
					 
					 체크박스를 만들때 value가 ㅇ벗으면 서버에는 아무것도 전송되지 않는다.--%>
					<input type="checkbox" value="0" name="hobby">음악감상
					<input type="checkbox" value="1" name="hobby">술
					<input type="checkbox" value="2" name="hobby">게임
					<input type="checkbox" value="3" name="hobby">영화<br>
					<input type="checkbox" value="4" name="hobby">독서
					<input type="checkbox" value="5" name="hobby">운동
					<input type="checkbox" value="6" name="hobby">맛집탑방
					<input type="checkbox" value="7" name="hobby">수다
					
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="취미전송">
				</td>
			</tr>
		</table>
	</form>
 
</body>
</html>