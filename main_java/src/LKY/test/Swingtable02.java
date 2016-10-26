package LKY.test;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/*
 * AbstractTableModel
 *
 * ���̺��� ������ �� ���� �������� ������ ����Ʈ ���� ����Ѵ�.
 *
 * AbstractTableModel�� ���� �����ϴ� ��
 *
 * ��Ŭ������ �����ϴ� ��
 *
 * 1. ���̺� ���� �����.
 * 2. ���̺� ���� �̿��Ͽ� ���̺��� �����
 * 3. �����̳ʿ� ���̺��� ���δ�.
 */
import javax.swing.table.AbstractTableModel;

//AbstractTableModel�� ���� Ŭ���� ����
class MyModel extends AbstractTableModel{
	//���̺��� �� ���� �� �����͸� 2���� �迭�� �����Ͽ� ����
	Object[][] data = {{"�̱Կ�","010-1111-1111","27"},{"ȫ�浿","010-2222-2222","28"}};

	//getColumnCount�޼��带 �������̵�
	@Override
	public int getColumnCount(){ //�÷��� ���� ����
		return data[0].length;
	}

	//getRowCount�޼��带 �������̵�
	@Override
	public int getRowCount(){ //�ο��� ���� ����
		return data.length;

	}

	//getValueAt�޼��带 �������̵�
	@Override
	public Object getValueAt(int r, int c){ // �÷� �ε����� �ο� �ε����� �ش��ϴ� �������� ����
		return data[r][c];
	}
}

public class Swingtable02 extends JFrame  {

	public Swingtable02(){

		//�� ��ü�� ����
		MyModel mm = new MyModel();

		//���̺� ��ü ������ �� �����ڿ� ��������
		JTable table = new JTable(mm);
		add(new JScrollPane(table));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Swingtable02();

	}
}