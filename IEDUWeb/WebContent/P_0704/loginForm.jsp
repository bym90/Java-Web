<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP</title>
<style>
	body {
		font-family : ����;
		font-size : 12px;
	}
	table{
/* 		position : absolute; 
 		right : 0px; */
 		float : right;
		width : 300px;
		border-top : 2px solid red;
		border-bottom : 2px solid red;
		border-collaspse : collapse;
		
	}
	td, tr{
		border-bottom : 1px solid yellow;
		height : 30px;
	}
	/* table{
		border-collapse : collapse;
		width : 70%;
		height : 50px;
	}
	table tr td{
		border : 1px solid black;
	}
	tr {
		height : 50px;
	}
	td.title{
		width : 20%;
		text-align : right;
		padding : 20px;
	}
	td.input{
		width : 80%;
		vertical-align : top;
	} */
</style>
</head>
<body>
	<%-- �� ������ ���� �����ϱ� ���� ���� --%>
	<%-- 
	form�� ���鶧 ���� �߿��� �Ӽ�
	method ������ �����͸� �����ϴ� ����� �����ϴ� ������ get, post��� �� �ϳ��� ����
	action �� �ФǤ��� �ִ� �����͸� ��Ƽ� ó���� ��ûURL�� ����ϴ� �κ�
	�츮�� ���ϸ� �α����� ó���� ���� URL�� �����ϴ� �κ�
	--%>
	<form method="post"
		action="http://localhost:8080/IEDUWeb/P_0704/loginFormReceive.jsp">
		<table align="center">
			<tr>
				<td class="title">���̵�</td>
				<td class="input">
			<%-- 
			���� ���ؼ� �����͸� ������
			name=""�ϴ� �κ��� Ű���� �ȴ�.
			��, ������ �� name�� ���� �̿��ؼ� �� �Է»��ڿ� �Էµ� ������ �˾Ƴ��� �ȴ�.
			name �Ӽ��� �������� ������ �� �����ʹ� �������� �� �� ����.
			--%> 
				<input type="text" name="id" style="width:130px; border:1px solid green">
				</td>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td><input type="password" name="pw" style="width:130px; border:1px solid green"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="�α���"> <%-- ���߸� ����� ����� 4����
				 ���� �ΰ��� ���ߴ� �̹� ����� ������ �ִ� �����̴�.
				 <input type="submit">
				 => ���� ���� �ִ� �����͸� �����ϸ� ó���� ��ö�ϴ� ����� ���� ����.
				 	�����͸� �����ϴ� �۾��� "����"�̶�� ǥ���� ���� �̰��� ����� submit�̶� �Ѵ�.
				 	�� ���ߴ� ���� �ִ� �����͸� ������ �����ϸ鼭 action�� ����� ��û�� �ϰ� �Ǵ� ���̴�.
				 <input type="reset">
				 => ���� �ִ� �ֿ븣 �ʱ�ȭ(����� �۾�x)��Ű�� ����� ���� ����.
				 ����� ���� ����
				 <input type="button">
				 <input type="image"> --%></td>
			</tr>
		</table>
	</form>
</body>
</html>