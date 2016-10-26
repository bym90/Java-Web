package P_0615;

/*
 * 제목만 가진 테이블을 만들고자 한다.
 * 이처럼 기본 모습이 아닌 다른 모습을 원하는 경우에는 Model 클래스를
 * 사용할 필요가 있다.
 */
import javax.swing.*;
import javax.swing.table.*;
import GUI.*;
public class JTable_02 extends CJFrame {

	public JTable_02() {
		// 1. 먼저 모델을 이용해서 테이블 모양을 만든다.
		String[] title = {"년도", "월", "일"};
		DefaultTableModel model = new DefaultTableModel(title, 0);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JTable_02();

	}

}
