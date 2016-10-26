<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
</head>
<body>
	<%
		String[] temp = {"음악감상", "술", "게임", "영화", "독서", "운동", "맛집탐방", "수다"};
		// hobby라는 name속서잉 여러개 있으므로 한개만 받을수 없다.
		String[] hobbys = request.getParameterValues("hobby");
		// 체크박스는 선택된 것만 서버에 전송되므로 취미는 여러개가 있지만
		// 이중에 몇개가 전송될지는 모르는 상태이다.
		// 전송된 데이터의 개수를 알아낼 수 있다.
		int size = hobbys.length;
		StringBuffer buff = new StringBuffer();
		for(int i=0; i<size; i++){
			int pos = Integer.parseInt(hobbys[i]);
			// 음악감상르 선택하면 실제로는 0이 서버에 도착한다.
			buff.append(temp[pos]);
			if(i<size -1){
				buff.append(" , ");
			}
		}
	%>
	<p> 당신의 취미는 <%= buff.toString() %> 이다.</p>

 
</body>
</html>