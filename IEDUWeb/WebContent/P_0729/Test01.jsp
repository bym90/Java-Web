<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
</head>
<script>
	// text 요소의 현재 내용에 Welcome을 붙여서 출력하고자 한다.
	$(document).ready(function(){
		$("#btn").click(function(){
// 			$text = $("#text").html();
// 			$text = $text + " Welcome";
// 			$("#text").html($text);
			$("#text").html(function(i, text){
				$temp = text + " Welcome";
				return $temp;
			})
		});
		
	});
</script>
<body>
	<p id="text"> My Name is hi</p>
	<input type="button" id="btn" value="Click">
 
</body>
</html>