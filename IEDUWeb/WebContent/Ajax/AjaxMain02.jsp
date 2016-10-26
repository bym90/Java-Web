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
	// 뉴스의 종류
	var kind = 0;
	function ReqNews(){
		// 서버에게 뉴스를 보내달라고 요청한다.
		// 이때 보고싶은 뉴스의 종류를 알려준다.
		kind = kind + 1;
		if(kind > 5) {
			kind = 1;
		}
		$.ajax({
			url : "http://localhost:8080/IEDUWeb/Ajax/AjaxNews02.bmw",
			data : "kind=" + kind,
// 			dataType : "html",
// 			dataType : "xml",
			dataType : "json",
			type : "get",
			success : function(data){
// 				alert("성공" + data);
				// html로 받은 결과는 이미 html이 되어 있으므로 그냥 사용하면 되었다
				// xml로 받은 겨로가는 html문서가 아니므로 웹 브라우저에
				// 넣지 못한다.
				// 강제로 html 문서로 만들어서 넣어야 한다.
				
				// NEWS 라는 태그를 알아내자
// 				var newss = $(data).find("NEWS"); //xml파싱처리 시작
// // 				alert(newss.length);
// 				var html = "<table class='TABLESTYLE3'>";
// 				newss.each(function(){
// 					// 지금 반복중인 NEWS 태그에 있는 TITLE 태그를 알아내라
// 					var titles = $(this).find("TITLE");
// 					// 그 태그(TITLE 태그)안에 있는 내용을 알아내자
// 					var title = titles.text();
// 					html += "<tr><td>";
// 					html += title;
// 					html += "</td></tr>";
// // 					alert(title);
// 				});
// 				html += "</table>"
// 				$("#news").html(html); //xml파싱처리 끝
			// JSON방식으로 응답받은 데이터를 처리하는 방법
				var news = data.NEWS;
				// 이렇게 하면 NEWS라는 키값을 가진 데이터가 나오는데
				// 하필 우리는 그 데이터가 List이더라
				// 이제는 List는 반복해서 꺼내야 하므로...
				var re = "<table class='TABLESTYLE3 W600P'>";
				$.each(news, function(index){
					var title = news[index];
// 					alert(this);
					re += "<tr><td>";
					re += title;
					re += "</td></tr>";
				});
				re += "</table>";
				$("#news").html(re);
			},
			
			error : function(xhr, code, msg	){
				alert("실패")
			}
			
		});
	}
	$(document).ready(function(){
		// 시작하자 마자 서버에게 뉴스를 따로 보내달라고 요청하고
		// 그 요청을 일정한 시간마다 계속해서 하도록 한다.
		// 이때 특정시간이 되면 뭔가를 실행하는 방법
		// setInterval(함수이름, 5000);
		// 5초마다 한번씩 지정한 함수를 호출하는 기능
		setInterval(ReqNews, 5000);
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
			</td>
		</tr>
		<tr height="50">
			<th>하단 저작권</th>
		</tr>
		
	</table>
 
</body>
</html>