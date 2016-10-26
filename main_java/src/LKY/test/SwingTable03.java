package LKY.test;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class SwingTable03 {

	public SwingTable03() {

		JFrame f = new JFrame("DefaultTableCellRenderer");

		Object[][] o1 = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
		Object[] o2 = {"1��","2��","3��"};

		JTable table = new JTable(o1,o2);
		f.add(new JScrollPane(table));

		//DefaultTableCellRenderer�� ����Ͽ�
		//���̺��� ������ ��� �����ϱ�

		//��ü ����
		DefaultTableCellRenderer dc = new DefaultTableCellRenderer();

		//�������� ���������� Center��
		dc.setHorizontalAlignment(SwingConstants.CENTER); //SwingConstants�� �������̽�

		//������ ���̺��� �÷����� �����´�(���̺��� ��������)
		TableColumnModel tcm = table.getColumnModel();

		//�÷��𵨿��� �÷��� ������ŭ �÷��� ������ for���� �̿��Ͽ�
		//������ ���������� �Ʊ� ������ dc�� set���ش�.
		for(int i = 0; i < tcm.getColumnCount(); i++){
			tcm.getColumn(i).setCellRenderer(dc);
		}

		f.setSize(300,300);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		new SwingTable03();

	}
}