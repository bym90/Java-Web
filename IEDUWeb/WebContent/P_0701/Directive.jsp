<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.text.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
<%
	Calendar car = Calendar.getInstance();
	SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String date = fm.format(car.getTime());
%>

<p><font size="20"><%= date %></font>
 
</body>
</html>