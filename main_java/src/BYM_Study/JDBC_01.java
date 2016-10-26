package BYM_Study;

import java.sql.*;

public class JDBC_01 {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;

	public static void main(String[] args) {
		try {
			// 1. Driver�� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver�� �ε��� ���������� �̷������ϴ�.");

			// 2. Connection ������
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Scott", "tiger");
			System.out.println("�����ͺ��̽��� ���ῡ �����Ͽ����ϴ�.");

			// 3. Statement ��� --> ������ �ۼ��Ͽ� �����ϱ� ���� �뵵
			stmt = con.createStatement();

//			String sql = "create table test1234 as select * from emp";
//			stmt.executeUpdate(sql);
			
			String sql3 = "insert into test1234(empno, ename, hiredate) values('7000', '���2', sysdate)";
			stmt.executeUpdate(sql3);
			
			String sql4 = "delete from test1234 where empno='7000'";
			stmt.executeUpdate(sql4);
			
			String sql2 = "select empno, ename, hiredate from test1234";
			rs = stmt.executeQuery(sql2);
			 while(rs.next()){
			 String empno = rs.getString("empno");
			 String ename = rs.getString("ename");
			 Date hiredate= rs.getDate("hiredate");
			
			 System.out.println(empno + "\t" + ename + "\t" + hiredate);
			 }
			 
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("oracle.jdbc.driver.OracleDriver�� ã�� �� �����ϴ�.");
		} catch (SQLException sql) {
			System.out.println("Connection ����!");
			sql.printStackTrace();
			// System.out.println(sql);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}
}