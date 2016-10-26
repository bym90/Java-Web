package P_0620;
/*
 * select e.ename, e.job, d.dname, d.loc 
 * from emp e, dept d 
 * where e.deptno = d.deptno
 * �� ������ ����.
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
			// 1. ����̹� �ε�
			db = new MyJDBC();
			// 2. ����
			con = db.getCon();
			// 3. ������Ʈ��Ʈ ���� 
			stmt = db.getStmt(con);
			// ���� ���� ����
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
			// String Ŭ������ +�ϸ� �޸� ��� �Ҵ��ϰ� �ǹǷ�
			// ���� ����� �� ȿ����
			
			// ���� ����
			rs = stmt.executeQuery(buff.toString());
			// ���
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