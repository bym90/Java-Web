package LJY.LJY_STUDY.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsingPreparedStatement {
    static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    static final String USER = "scott";
    static final String PASS = "tiger";

    public static void main(String[] args) {
        // JDBC 드라이버 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Connection con = null;
        PreparedStatement pstmt = null;
        String SQL = "UPDATE NAMECARD SET COMPANY=? WHERE NO=?";
        try {
            // 커넥션 맺기
            con = DriverManager.getConnection(URL, USER, PASS);
            // SQL 실행
            pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, "율도국");
            pstmt.setInt(2, 2);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(SQL);
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}