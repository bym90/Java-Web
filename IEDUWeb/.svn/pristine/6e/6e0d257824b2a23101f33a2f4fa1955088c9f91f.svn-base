package SQL;
/*
 * 	앞에서 3번 작업을 해보았는데 같은 작업이 여러번 반복된다.
 * 	이작업을 대신해줄 나만의 클래스를 만들어서 사용해 보려고 한다.
 */
import		java.sql.*;
public class MyJDBC {
	//	누군가가 이 클래스를 new 시키는 순간 드라이버로딩 작업을 하도록
	//	하고싶다.
	public MyJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e) {
			System.out.println("드라이버 로딩 에러 = " + e);
		}
	}
	//	접속을 대신 해주는 함수를 하나 만들어서 사용하고자 한다.
	public Connection getCON() {
		Connection	con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
					"scott", "tiger");
		}
		catch(Exception e) {
			System.out.println("접속 에러 = " + e);
		}
		return con;
	}
	//	대신 Statement를 만들어주는 함수를 제작하자.
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try  {
			stmt = con.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e) {
			System.out.println("스테이트먼트 생성 에러 = " + e);
		}
		return stmt;
	}
	//	PreparedStatement를 대신 만들어줄 함수
	public PreparedStatement getPSTMT(String sql, Connection con) {
		PreparedStatement	pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, 
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception e) {
			System.out.println("PreparedStatment 생성 에러 = " + e);
		}
		return pstmt;
	}

	
	//	사용한 외부 자원은 닫아주어야 하는데... 이것도 매번 필요한 작업이다.
	//	대신 닫아주는 함수를 만들어보자.
	//		참고
	//		원래 닫는 작업은		con, stmt, rs	을 닫아야 한다.
	//		이 3가지를 하나의 함수를 이용해서 닫도록 하자.
	public void close(Object obj) {
		//	3개의 클래스를 동시에 받을 수 있는 것은 Object이다.
		try {
			//	Object는 형 변환해서 사용하세요......
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
			System.out.println("닫기 에러 = " + e);
		}
	}
}




