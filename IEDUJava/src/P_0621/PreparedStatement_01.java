package P_0621;

/*
 * PTable 안에 5사람의 정보를 입력하자.
 * 
 * insert into PTable values('???', ?);
 * 의 질의 명령이 5번 반복되어야 한다.
 */
import java.sql.*;
import SQL.*;

class PreparedStatement_01 {
	
	public PreparedStatement_01() {
		// 5사람의 정보를 배열에 준비
		String[] name = {"a","b","c","d","e"};
		int[] age = {1, 2, 3, 4, 5};
		
		MyJDBC db = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			db = new MyJDBC();
			con = db.getCon();
			// 먼저 질의 명령을 보내야 한다.
			String sql = "insert into PTable values(?, ?)";
			// 변경되는 데이터 부분은 ?로 대신하여 질의명령을 만들어야 한다.
			pstmt = con.prepareStatement(sql);
			// 질의 실행
			for (int i = 0; i < 5; i++) {
				// 질의 명령을 실행하기 전에 필요한 데이터가 있으면
				// 데이터를 따로 보내주어야 한다.
				pstmt.setString(1, name[i]);
				pstmt.setInt(2, age[i]);
				// 데이터베이스 처리를 할 때는 인덱스가 1부터 한다.
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
