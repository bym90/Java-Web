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
 * JTable은 마우스이벤트가 발생하므로 MouseListener를 등록해서 이벤트를 처리할 수 있음
 *
 * MouseListener(MouseAdapter)의 MouseClicked()메소드에서 getSelectedColumn()과
 * getSelectedRow()메소드를 이용해서 어떤 컬럼과 행이 클릭되었는지를 알 수 있다
 *
 * 만약 선택된 셀이 없다면 getSelectedColumn()과 getSelectedRow()메소드들은
 * -1을 리턴한다. 따라서 -1이 아닐 때 이벤트 처리 코드를 실행하면 된다.
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
			String[] columnNames = new String[]{"이름","나이"};
			rowData = new Object[][]{{"이규영",28},{"이규영2",27},{"이규영3",26}};

			jtable = new JTable(rowData,columnNames );

			//이벤트 처리
			jtable.addMouseListener(new MouseAdapter(){

				public void mouseClicked(MouseEvent e){

					int rowIndex = jtable.getSelectedRow(); //선택된 로우의 인덱스번호를 가져옴(선택안되면 -1상태)

					if(rowIndex != -1){
						TableModel tableModel = jtable.getModel();
						//getValueAt(rowIndex(row인덱스값), 0(컬럼인덱스))컬럼인덱스와 로우인덱스에 해당하는 셀의 값을 꺼내옴
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
			jp.setLayout(new GridLayout(4,2)); //세로 ,가로
			jp.add(new JLabel("[선택한 행 정보]"));
			jp.add(new JLabel(""));
			jp.add(new JLabel("이름",JLabel.CENTER));
			jp.add(getTxtName());
			jp.add(new JLabel("나이",JLabel.CENTER));
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
