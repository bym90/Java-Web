package LJY.LJY_STUDY.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		try {
		    // Connection 맺기
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
		    // Statement 얻기
		    stmt = conn.createStatement();
		    sql = "CREATE TABLE NAMECARD ( " +
		        "NO  NUMBER CONSTRAINT PK_NAMECARD PRIMARY KEY, " +
		        "NAME    VARCHAR2(20) NOT NULL, " +
		        "MOBILE  VARCHAR2(20) NOT NULL, " +
		        "EMAIL   VARCHAR2(40), " +
		        "COMPANY VARCHAR2(60))";
		    stmt.executeUpdate(sql);
		    sql = "CREATE SEQUENCE SEQ_NAMECARD_NO " +//이부분을 추가한다.
		        "INCREMENT BY 1 " +
		        "START WITH 1";
		    stmt.executeUpdate(sql);
		} catch (SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}

}
