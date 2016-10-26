package P_0621;

/*
 * PTable �ȿ� 5����� ������ �Է�����.
 * 
 * insert into PTable values('???', ?);
 * �� ���� ������ 5�� �ݺ��Ǿ�� �Ѵ�.
 */
import java.sql.*;
import SQL.*;

class PreparedStatement_01 {
	
	public PreparedStatement_01() {
		// 5����� ������ �迭�� �غ�
		String[] name = {"a","b","c","d","e"};
		int[] age = {1, 2, 3, 4, 5};
		
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			db = new MyJDBC();
			con = db.getCon();
			// ���� ���� ������ ������ �Ѵ�.
			String sql = "insert into PTable values(?, ?)";
			// ����Ǵ� ������ �κ��� ?�� ����Ͽ� ���Ǹ����� ������ �Ѵ�.
			pstmt = con.prepareStatement(sql);
			// ���� ����
			for (int i = 0; i < 5; i++) {
				// ���� ������ �����ϱ� ���� �ʿ��� �����Ͱ� ������
				// �����͸� ���� �����־�� �Ѵ�.
				pstmt.setString(1, name[i]);
				pstmt.setInt(2, age[i]);
				// �����ͺ��̽� ó���� �� ���� �ε����� 1���� �Ѵ�.
				pstmt.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				db.close(con);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new PreparedStatement_01();

	}

}