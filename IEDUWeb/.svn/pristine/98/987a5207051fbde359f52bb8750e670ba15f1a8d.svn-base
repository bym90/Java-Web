<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=styleSheet href="../Base.css">
<title>JSP</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#nbtn").click(function(){
			// 단추가 눌러지면 부분을 변경하기 위해서 데이터를 얻어와야 한다.
			// 이처럼 전체를 변경하지 않고 부분을 위해서 데이터를 얻어올때는
			// Ajax가 가장 편리하다.
			// 즉, 전체를 다시 얻어오는 것 보다는 좋다.
			$.ajax({
				// 요청
				url : "http://localhost:8080/IEDUWeb/Ajax/AjaxNews01.jsp",
				dataType : "html",
				type : "get",
				// callback 함수는 함수를 만들어 주어야 한다.
				success : function(data){
					// 서버가 제대로 응하면 실행될 함수이다.
					// 이 함수는 말 그대로 서버가 제대로 응답하면 실행될 함수이다.
					// data 변수에는 응답된 문서가 기억될것이다.
// 					alert(data);
					// 이 데이터를 강제로 처리(실행)해 주어야 한다.
					// 우리는 원하는 위치에 이 데이터를 강제로 입력해 놓음으로써
					// 화면에 내용이 보이도록 할 것이다.
					$("#news").html(data);
					},
				error : function(){
					// 서버가 제대로 응답하지 않으면 실행될 함수이다.
					alert("에러");
				}
			});
		});
	});
</script>
<body>
<%-- 다음과 같은 하나의 홈페이지라고 가정하자. --%>
	<table class="TABLESTYLE1">
		<tr height="50">
			<th>상단 메인</th>
		</tr>
		<tr height="300">
			<td>공지사항</td>
		</tr>
		<tr height="300">
			<td>
			<%-- 강제로 뉴스 내용을 기억할 영역을 하나 만들어 놓는다. --%>
			<p id="news">뉴스</p>
			<input type="button" id="nbtn" value="뉴스보기" class="BUTTON1">
			</td>
		</tr>
		<tr height="50">
			<th>하단 저작권</th>
		</tr>
		
	</table>
 
</body>
</html>