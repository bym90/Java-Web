package P_0615;

/*
 * ������ ���̺� �ϳ� ������
 */
import javax.swing.*;
import GUI.*;

public class JTable_01 {

	public JTable_01() {
		CJFrame frame = new CJFrame();
		// ���̺��� ����� ���ؼ��� ���̺��� �� ������ ������ �Ѵ�.
		String[] title = { "�⵵", "��", "��" };
		// ���̺� �ȿ� �� �����ʹ� 2�� �迭�� �����ȴ�.
		// 1�� �迭�� ������ �����Ͱ� �Ǹ鼭 2���迭 ������ŭ ���� �����.
		String[][] data = { { "2016", "1", "1" }, { "2015", "2", "2" }, { "2014", "3", "3" } };
		
		JTable table = new JTable(data, title);
		// ���� ��ũ�ѹٴ� �ڵ����� ������ �����Ƿ� �ݵ�� ��ũ�ѹٸ� �������� �Ѵ�.
		// JTable�� ��ũ�ѹٸ� ������ ������ ����� ���ϴ� ������� ������ �ʴ´�.
		JScrollPane sp = new JScrollPane(table);
		
		frame.add(sp);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JTable_01();

	}

}