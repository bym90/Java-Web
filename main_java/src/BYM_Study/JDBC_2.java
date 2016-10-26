package BYM_Study;

import java.sql.*;

public class JDBC_2 {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;

	public static void main(String[] args) {
		try {
			// 1. Driver를 로딩한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver의 로딩이 정상적으로 이뤄졌습니다.");

			// 2. Connection 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "Scott", "tiger");
			System.out.println("데이터베이스의 연결에 성공하였습니다.");

			// 3. Statement 얻기 --> 쿼리문 작성하여 적용하기 위한 용도
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
			System.out.println("oracle.jdbc.driver.OracleDriver를 찾을 수 없습니다.");

		} catch (SQLException sql) {
			System.out.println("Connection 실패!");
			sql.printStackTrace();
			// System.out.println(sql);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}
}
