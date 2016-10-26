package LKY.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/*
 * JTable�� ���콺�̺�Ʈ�� �߻��ϹǷ� MouseListener�� ����ؼ� �̺�Ʈ�� ó���� �� ����
 *
 * MouseListener(MouseAdapter)�� MouseClicked()�޼ҵ忡�� getSelectedColumn()��
 * getSelectedRow()�޼ҵ带 �̿��ؼ� � �÷��� ���� Ŭ���Ǿ������� �� �� �ִ�
 *
 * ���� ���õ� ���� ���ٸ� getSelectedColumn()�� getSelectedRow()�޼ҵ����
 * -1�� �����Ѵ�. ���� -1�� �ƴ� �� �̺�Ʈ ó�� �ڵ带 �����ϸ� �ȴ�.
 */

public class SwingTable04 extends JFrame{

	JTable jtable;
	JPanel jp;
	JTextField txtName;
	JTextField txtAge;
	Object[][] rowData;

	public SwingTable04() {
		this.setTitle("Table");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JScrollPane(Component view, int vsbPolicy, int hsbPolicy)
		this.add(new JScrollPane(getJTable()), BorderLayout.CENTER);
		this.add(new JScrollPane(getPSouth()), BorderLayout.SOUTH);
		this.setSize(250, 280);
		this.setVisible(true);
	}

	public JTable getJTable(){
		if(jtable == null){
			String[] columnNames = new String[]{"�̸�","����"};
			rowData = new Object[][]{{"�̱Կ�",28},{"�̱Կ�2",27},{"�̱Կ�3",26}};

			jtable = new JTable(rowData,columnNames );

			//�̺�Ʈ ó��
			jtable.addMouseListener(new MouseAdapter(){

				public void mouseClicked(MouseEvent e){

					int rowIndex = jtable.getSelectedRow(); //���õ� �ο��� �ε�����ȣ�� ������(���þȵǸ� -1����)

					if(rowIndex != -1){
						TableModel tableModel = jtable.getModel();
						//getValueAt(rowIndex(row�ε�����), 0(�÷��ε���))�÷��ε����� �ο��ε����� �ش��ϴ� ���� ���� ������
						String name = (String)tableModel.getValueAt(rowIndex, 0);
						Integer age = (Integer)tableModel.getValueAt(rowIndex, 1);

						getTxtName().setText(name);
						getTxtAge().setText(String.valueOf(age.intValue()));
					   }
					}
				});
			}
		return jtable;
		}

	public JPanel getPSouth(){
		if(jp==null){
			jp = new JPanel();
			jp.setLayout(new GridLayout(4,2)); //���� ,����
			jp.add(new JLabel("[������ �� ����]"));
			jp.add(new JLabel(""));
			jp.add(new JLabel("�̸�",JLabel.CENTER));
			jp.add(getTxtName());
			jp.add(new JLabel("����",JLabel.CENTER));
			jp.add(getTxtAge());
			}
		return jp;
	}



	public JTextField getTxtName(){
		if(txtName == null){
			txtName = new JTextField();
		}
		return txtName;
	}

	public JTextField getTxtAge(){
		if(txtAge == null){
			txtAge = new JTextField();
		}

		return txtAge;
	}


	public static void main(String[] args) {

		new SwingTable04();

	}

}