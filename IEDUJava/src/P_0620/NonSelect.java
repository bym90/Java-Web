package P_0620;
/*
 * �ؽ�Ʈ ����� select ���ǰ� �ƴ� �ٸ� ���Ǹ� �ۼ��ϰ� ���߸�
 * ������ ���� ������ ����Ǵ� ���α׷��� �ۼ��϶�.
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
		
		btn = new JButton("���� ����");
		btn.addActionListener(new ButtonEvent());
		
		this.add("Center", sp);
		this.add("South", btn);
		this.setSize(400, 400);
		this.setVisible(true);
		this.addWindowListener(new CloseEvent());
		// 11���� �Ǹ� ���α׷��� ���ư��� ���Ѵ�.
		// ������ ���ӵ� ��� ������ ��������.
		// db�� �������� ���� ����ϴ� ���忡�� ��ȿ����
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
			// ���� �����ͺ��̽��� �ݴ� ������ �߿��ѵ�
			// �翬�� �� ���α׷��� ����Ǵ� �������� �����ͺ��̽���
			// ���� �ݾ��־��� �Ѵ�. �׷��� ������ CJFrame�� �����ʰ�
			// JFrame�� ����ϰ� x���� �̺�Ʈ�� ���� ����
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
			// �ؽ�Ʈ ����� �Է��� ���� ������ �˾Ƴ���.
			String sql = area.getText();
			while(sql.endsWith(";")){
				sql = sql.substring(0, sql.length() - 1);
			}
			// �����ϱ� ���� �� ������ ����
			// ������ �� ���� ������ �ؾߵǱ� ������ ó���ӵ��� ������.
//			db = new MyJDBC();
//			con = db.getCon();
//			stmt = db.getState(con);
			
			// �� ���� ���� ����
			try {
				stmt.execute(sql);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// ���� �� finally�ε� ����
//			finally {
//				db.close(stmt);
//				db.close(con);
//			}
		}
	}


}