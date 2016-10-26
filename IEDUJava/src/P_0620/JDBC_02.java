package P_0620;

/*
 * sample002라는 테이블을 만들어보자.
 */
import java.sql.*;

public class JDBC_02 {

	public JDBC_02() {
		Connection con = null;
		Statement stmt = null;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 접속 시도
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			// 3. 반드시 JDBC와 실제 DBMS사이에 질의 명령을 전달하고 그결과를
			// 받아올 중간 매개 역할이 필요하다.
			// 클래스 Statement
			stmt = con.createStatement();
			// 4. 질의 명령 생성
			String sql = "create table sample002 as select * from emp";
			// 질의가 실행되던 안되던 드라이브에 Statement만 생성해주면 무조건 true이므로
			// 반환값의 의미가 없다.
			// 질의 명령을 만들때 마지막에 ";" 붙이지 않는다.
			// JDBC가 자동으로 만들어서 붙여준다.
			// 5. 질의 명령 실행
			stmt.execute(sql);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 사용한 외부장치는 사용이 완료되면 습관적으로 닫아주어야 한다.
				stmt.close();
				con.close();
				// 이렇게 해야 세션이 반환되고 그래야 다음번 사람이 접속할 수 있다.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JDBC_02();

	}

}
