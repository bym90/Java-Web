package P_0620;

/*
 * sample002��� ���̺��� ������.
 */
import java.sql.*;

public class JDBC_02 {

	public JDBC_02() {
		Connection con = null;
		Statement stmt = null;
		try {
			// 1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. ���� �õ�
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// 3. �ݵ�� JDBC�� ���� DBMS���̿� ���� ������ �����ϰ� �װ����
			// �޾ƿ� �߰� �Ű� ������ �ʿ��ϴ�.
			// Ŭ���� Statement
			stmt = con.createStatement();
			// 4. ���� ���� ����
			String sql = "create table sample002 as select * from emp";
			// ���ǰ� ����Ǵ� �ȵǴ� ����̺꿡 Statement�� �������ָ� ������ true�̹Ƿ�
			// ��ȯ���� �ǹ̰� ����.
			// ���� ������ ���鶧 �������� ";" ������ �ʴ´�.
			// JDBC�� �ڵ����� ���� �ٿ��ش�.
			// 5. ���� ���� ����
			stmt.execute(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ����� �ܺ���ġ�� ����� �Ϸ�Ǹ� ���������� �ݾ��־�� �Ѵ�.
				stmt.close();
				con.close();
				// �̷��� �ؾ� ������ ��ȯ�ǰ� �׷��� ������ ����� ������ �� �ִ�.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JDBC_02();

	}

}