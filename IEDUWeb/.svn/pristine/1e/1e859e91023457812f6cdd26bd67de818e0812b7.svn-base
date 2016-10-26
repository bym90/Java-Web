<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
<script>
	// 참여하기 단추를 누르면 해야할 행동을 프로그램으로 만들자.
	function JoinProc() {
		// 참여하기란?
		// 폼에서 선택한 항목을 서버에게 주면서 참여를 요구하는것을
		// 의미하므로 폼을 선택해야 한다.
		var f = document.getElementById("surveyForm");
		// 이 폼에 액션(즉 폼의 데이터를 가지고갈 문서)를 지정한다.
		f.action = "http://localhost:8080/IEDUWeb/P_0705/SurveyInsert.jsp"
		// 이 폼에 데이터를 서버에게 제출하면서(submit) 시키면서 참여를 요구한다.
		f.submit();
	}
	// 결과보기 단추를 누르면 해야할 행동을 프로그램으로 만들자.
	function  ResultProc() {
		// 자바 스크립트로 하이퍼링크를 지정하는방법
		document.location.href = "http://localhost:8080/IEDUWeb/P_0705/SurveyResult.jsp";
	}
</script>
<style>
	table{
		width : 800px;
		margin : auto;
		border : 1px solid black;
		border-collapse : collapse;
	}
	tr, td{
		border : 1px solid black;
	}
</style>
</head>
<body>
<%-- 설문조사 항목을 보여주고 그 중 하나를 선택할 수 있는 폼을 제작하자. 
	특정 요소에 id를 배정하는 이유는
	1. CSS를 적용하기 위해서
	2. JavaScript나 JQuery등에서 그 요소를 선택하기 위해서
	class나 name은 유니크하지 않아도 된다. 하지만 id는 유니크를 권장한다.--%>
 	<form method="post" id="surveyForm" action="">
 		<table>
 			<tr>
 				<td align="center">누가누가 인기 많나?</td>
 			</tr>
 			<tr>
 			<%-- 라디오 단추는 그룹을 이루어야 한다. 이그룹은 name속성을 같게 해줌으로써
 			자동적으로 그룹이 이루어진다. 
 			
 			서버에는 선태고딘 라디오 단추의 value값이 전달된다.
 			즉, 1번을 선택하면 서버에는 "dap_1"이라는 데이터가 전달된다.
 			 	2번을 선택하면 서버에는 "dap_2"이라는 데이터가 전달된다.--%>
 				<td>
 					<input type="radio" name="survey" value="dap_1">
 					1. 아이유
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_2">
 					2. 경리
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_3">
 					3. 최유정
 				</td>
 			</tr>
 			<tr>
 				<td>
 					<input type="radio" name="survey" value="dap_4">
 					4. 초아
 				</td>
 			</tr>
 			<tr>
 				<td align="center">
 					<input type="button" value="참여하기" Onclick="JoinProc()">
 					<input type="button" value="결과보기" Onclick="ResultProc()">
 				</td>
 			</tr>
 			
 		</table>
 	</form>
</body>
</html>