package P_0620;

/*
 * 드라이버 설치가 잘 되었는지 확인하자.
 */
import java.sql.*;

public class JDBC_01 {

	public JDBC_01() {
			Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 세팅 성공");
			// 여기서 에러가 나는 이유는 ojbdcxx.jar 파일 등록이 실패했다는 말이다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("연결 성공");
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
