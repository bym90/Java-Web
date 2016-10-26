package BYM_Study;

import java.sql.*;

public class JDBC_2 {
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
			String sql2 = "select empno, ename, job from test001";
			rs = stmt.executeQuery(sql2);
			 while(rs.next()){
			 String empno = rs.getString("empno");
			 String ename = rs.getString("ename");
			 String job = rs.getString("job");

			 System.out.println(empno + "\t" + ename + "\t" + job);
			 }
			 String sql3 =""
			 		+ "     INSERT INTO test001                                             "
			 		+ "            (                                            "
			 		+ "                empno,ename,job                                            "
			 		+ "            )                                             "
			 		+ "            VALUES                                            "
			 		+ "            ('876','gggg','ggg');                                            "
			 		+ "                                                 ";
			 stmt.executeUpdate(sql3);


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