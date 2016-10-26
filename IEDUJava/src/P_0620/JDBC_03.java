package P_0620;

/*
 * emp 테이블이 가진 정보를 가지고와서 출력해 보자.
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
			// 화면에 출력되는게 아니라 메모리의 가상테이블을 저장 하는것임.
			// 출력하는것은 툴이 하는것
			// 가상테이블을 기억하는 클래스 ResultSet
			rs = stmt.executeQuery(sql);
			// 이제 가상 테이블에 있는 데이터를 꺼내서 출력해보자.
			// 몇번 반복할지 모르므로...
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
			// 다시 꺼내고 싶으면 레코드 포인터를 위로 올린 후
			// 다시 작업하면 될 것이다.
			// rs.first(); 그냥은 오류
			// createStatement에 ResultSet.TYPE_SCROLL_INSENSITIVE,
			// ResultSet.CONCUR_READ_ONLY을 써줌으로써
			// rs.first(); 가능
			rs.first();
			System.out.println("다시 뽑기");
			do {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int sal = rs.getInt("sal");
				Date hiredate = rs.getDate("hiredate");
				System.out.println(name + "  " + job + "  " + sal + "  " + hiredate);
			} while (rs.next());
			// 첫번째는 BOF에 있으니깐 rs.next()를 해주고
			// 두번째는 first에 있으니 1번 레코드에 가있으므로 Do While을 씀

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
