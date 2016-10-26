package P_0620;

/*
 * emp ���̺��� ���� ������ �������ͼ� ����� ����.
 */
import java.sql.*;

public class JDBC_03 {

	public JDBC_03() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "select * from emp";
			// ȭ�鿡 ��µǴ°� �ƴ϶� �޸��� �������̺��� ���� �ϴ°���.
			// ����ϴ°��� ���� �ϴ°�
			// �������̺��� ����ϴ� Ŭ���� ResultSet
			rs = stmt.executeQuery(sql);
			// ���� ���� ���̺��� �ִ� �����͸� ������ ����غ���.
			// ��� �ݺ����� �𸣹Ƿ�...
			while (rs.next()) {
				// boolean temp = rs.next();
				// if(temp == false){
				// break;
				// }
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				Date hiredate = rs.getDate("hiredate");
				System.out.println(name + "  " + job + "  " + sal + "  " + hiredate);
			}
			// �ٽ� ������ ������ ���ڵ� �����͸� ���� �ø� ��
			// �ٽ� �۾��ϸ� �� ���̴�.
			// rs.first(); �׳��� ����
			// createStatement�� ResultSet.TYPE_SCROLL_INSENSITIVE,
			// ResultSet.CONCUR_READ_ONLY�� �������ν�
			// rs.first(); ����
			rs.first();
			System.out.println("�ٽ� �̱�");
			do {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				Date hiredate = rs.getDate("hiredate");
				System.out.println(name + "  " + job + "  " + sal + "  " + hiredate);
			} while (rs.next());
			// ù��°�� BOF�� �����ϱ� rs.next()�� ���ְ�
			// �ι�°�� first�� ������ 1�� ���ڵ忡 �������Ƿ� Do While�� ��

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new JDBC_03();

	}

}