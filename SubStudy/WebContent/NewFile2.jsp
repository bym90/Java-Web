<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="D:/javasource/SubStudy/WebContent/jindo.desktop.js"></script>
</head>
<body>
<div style="display: none; background-color: rgb(51, 51, 153); width: 100px; height: 50px;" id="sample1">sample1</div>
<div style="display: none; background-color: rgb(165, 10, 81); width: 50px; height: 20px;" id="sample2">sample2</div>

<Script>
$Element("sample1").appear(5, function(){
	$Element("sample2").appear(3);
});
</Script>

</body>
</html>