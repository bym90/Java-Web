package SQL;
/*
 * 	�տ��� 3�� �۾��� �غ��Ҵµ� ���� �۾��� ������ �ݺ��ȴ�.
 * 	���۾��� ������� ������ Ŭ������ ���� ����� ������ �Ѵ�.
 */
import		java.sql.*;
public class MyJDBC {
	//	�������� �� Ŭ������ new ��Ű�� ���� ����̹��ε� �۾��� �ϵ���
	//	�ϰ��ʹ�.
	public MyJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e) {
			System.out.println("����̹� �ε� ���� = " + e);
		}
	}
	//	������ ��� ���ִ� �Լ��� �ϳ� ���� ����ϰ��� �Ѵ�.
	public Connection getCON() {
		Connection	con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
					"scott", "tiger");
		}
		catch(Exception e) {
			System.out.println("���� ���� = " + e);
		}
		return con;
	}
	//	��� Statement�� ������ִ� �Լ��� ��������.
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try  {
			stmt = con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e) {
			System.out.println("������Ʈ��Ʈ ���� ���� = " + e);
		}
		return stmt;
	}
	//	PreparedStatement�� ��� ������� �Լ�
	public PreparedStatement getPSTMT(String sql, Connection con) {
		PreparedStatement	pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, 
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e) {
			System.out.println("PreparedStatment ���� ���� = " + e);
		}
		return pstmt;
	}

	
	//	����� �ܺ� �ڿ��� �ݾ��־�� �ϴµ�... �̰͵� �Ź� �ʿ��� �۾��̴�.
	//	��� �ݾ��ִ� �Լ��� ������.
	//		����
	//		���� �ݴ� �۾���		con, stmt, rs	�� �ݾƾ� �Ѵ�.
	//		�� 3������ �ϳ��� �Լ��� �̿��ؼ� �ݵ��� ����.
	public void close(Object obj) {
		//	3���� Ŭ������ ���ÿ� ���� �� �ִ� ���� Object�̴�.
		try {
			//	Object�� �� ��ȯ�ؼ� ����ϼ���......
			if(obj instanceof Connection) {
				Connection	temp = (Connection) obj;
				temp.close();
			}
			else if(obj instanceof Statement) {
				Statement temp = (Statement) obj;
				temp.close();
			}
			else if(obj instanceof ResultSet) {
				ResultSet	temp = (ResultSet) obj;
				temp.close();
			}
			else if(obj instanceof PreparedStatement) {
				PreparedStatement temp = (PreparedStatement) obj;
				temp.close();
			}
		}
		catch(Exception e) {
			System.out.println("�ݱ� ���� = " + e);
		}
	}
}



