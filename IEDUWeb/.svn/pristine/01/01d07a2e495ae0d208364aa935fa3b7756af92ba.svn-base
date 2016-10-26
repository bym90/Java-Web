package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/*
 * 커넥션 풀을 사용해서 커넥션을 시키는 유틸리티 클래스
 */
public class MyDBCP {
	DataSource ds = null;

	public MyDBCP() {
		// 1. context.xml 파일에 등록한 내용을 알아내기 휘애서
		// context.xml 파일을 읽을수 있는 클래스를 생성
		try {
			Context context = new InitialContext();
			// 2. context.xml 파일 중에서 커넥션 풀에 관련된 내용을 찾는다
			// context.xml에서 제공하는 리소스를 찾는 방법
			// 1> "java:comp/env/찾고자하는 리소스 이름
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mydb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getCON() {
		Connection con = null;
		try {
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public PreparedStatement getPSTMT(String sql, Connection con) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	public void close(Object obj) {
		try {
			if (obj instanceof Connection) {
				Connection temp = (Connection) obj;
				temp.close();
			} else if (obj instanceof Statement) {
				Statement temp = (Statement) obj;
				temp.close();
			} else if (obj instanceof ResultSet) {
				ResultSet temp = (ResultSet) obj;
				temp.close();
			} else if (obj instanceof PreparedStatement) {
				PreparedStatement temp = (PreparedStatement) obj;
				temp.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
