package P_0620;
/*
 * select e.ename, e.job, d.dname, d.loc 
 * from emp e, dept d 
 * where e.deptno = d.deptno
 * 을 실행해 보자.
 */

import java.sql.*;
import SQL.*;
public class JDBC_04 {

	public JDBC_04() {
		MyJDBC db = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로딩
			db = new MyJDBC();
			// 2. 접속
			con = db.getCon();
			// 3. 스테이트먼트 생성 
			stmt = db.getStmt(con);
			// 질의 명령 생성
			StringBuffer buff = new StringBuffer();
			buff.append("select ");
			buff.append("ename, job, dname, loc ");
			buff.append("from ");
			buff.append("emp e, dept d ");
			buff.append("where ");
			buff.append("e.deptno = d.deptno ");
			
//			String sql = "select e.ename, e.job, d.dname, d.loc "
//						+ "from emp e, dept d "
//						+ "where e.deptno = d.deptno";
			// String 클래스는 +하면 메모리 계속 할당하게 되므로
			// 위의 방법이 더 효율적
			
			// 질의 실행
			rs = stmt.executeQuery(buff.toString());
			// 결과
			while (rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(name + " " + job + " " + dname + " " + loc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
				db.close(rs);
				db.close(stmt);
				db.close(con);
		}
	}

	public static void main(String[] args) {
		new JDBC_04();

	}

}
