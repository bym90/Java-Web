package P_0620;
/*
 * 텍스트 에리어에 select 질의가 아닌 다른 질의를 작성하고 단추를
 * 누르면 질의 명령이 실행되는 프로그램을 작성하라.
 */
import java.sql.*;
import SQL.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NonSelect extends JFrame {
	MyJDBC db = null;
	Connection con = null;
	Statement stmt = null;
	JTextArea area;
	JButton btn;
	public NonSelect() {
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		btn = new JButton("쿼리 실행");
		btn.addActionListener(new ButtonEvent());
		
		this.add("Center", sp);
		this.add("South", btn);
		this.setSize(400, 400);
		this.setVisible(true);
		this.addWindowListener(new CloseEvent());
		// 11개가 되면 프로그램이 돌아가지 못한다.
		// 접속이 지속될 경우 세션이 없어진다.
		// db를 여러명이 자주 사용하는 입장에서 비효율적
		db = new MyJDBC();
		con = db.getCon();
		stmt = db.getStmt(con);
		
	}

	public static void main(String[] args) {
		new NonSelect();

	}
	
	class CloseEvent extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e){
			// 이제 데이터베이스를 닫는 시점이 중요한데
			// 당연히 이 프로그램이 종료되는 시점에서 데이터베이스는
			// 같이 닫아주엉야 한다. 그렇기 때문에 CJFrame을 쓰지않고
			// JFrame을 사용하고 x단추 이벤트를 따로 생성
			if(db != null){
				db.close(stmt);
				db.close(con);
			}
			System.exit(0);
		}
	}
	
	class ButtonEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			// 텍스트 에리어에 입력한 질의 명령을 알아낸다.
			String sql = area.getText();
			while(sql.endsWith(";")){
				sql = sql.substring(0, sql.length() - 1);
			}
			// 실행하기 전에 이 구문도 가능
			// 실행할 때 마다 접속을 해야되기 때문에 처리속도는 느리다.
//			db = new MyJDBC();
//			con = db.getCon();
//			stmt = db.getState(con);
			
			// 이 질의 명령 실행
			try {
				stmt.execute(sql);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// 실행 후 finally로도 가능
//			finally {
//				db.close(stmt);
//				db.close(con);
//			}
		}
	}


}
