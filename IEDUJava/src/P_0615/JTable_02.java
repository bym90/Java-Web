package P_0615;

/*
 * ���� ���� ���̺��� ������� �Ѵ�.
 * ��ó�� �⺻ ����� �ƴ� �ٸ� ����� ���ϴ� ��쿡�� Model Ŭ������
 * ����� �ʿ䰡 �ִ�.
 */
import javax.swing.*;
import javax.swing.table.*;
import GUI.*;
public class JTable_02 extends CJFrame {

	public JTable_02() {
		// 1. ���� ���� �̿��ؼ� ���̺� ����� �����.
		String[] title = {"�⵵", "��", "��"};
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