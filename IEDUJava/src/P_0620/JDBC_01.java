package P_0620;

/*
 * ����̹� ��ġ�� �� �Ǿ����� Ȯ������.
 */
import java.sql.*;

public class JDBC_01 {

	public JDBC_01() {
			Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			// ���⼭ ������ ���� ������ ojbdcxx.jar ���� ����� �����ߴٴ� ���̴�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("���� ����");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
			finally {
				try {
					con.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}

	public static void main(String[] args) {
		new JDBC_01();

	}

}