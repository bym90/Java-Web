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
		Object[] o2 = {"1번","2번","3번"};

		JTable table = new JTable(o1,o2);
		f.add(new JScrollPane(table));

		//DefaultTableCellRenderer를 사용하여
		//테이블의 내용을 가운데 정렬하기

		//객체 생성
		DefaultTableCellRenderer dc = new DefaultTableCellRenderer();

		//랜더러의 가로정렬을 Center로
		dc.setHorizontalAlignment(SwingConstants.CENTER); //SwingConstants는 인터페이스

		//정렬할 테이블의 컬럼모델을 가져온다(테이블의 정보까지)
		TableColumnModel tcm = table.getColumnModel();

		//컬럼모델에서 컬럼의 갯수만큼 컬럼을 가져와 for문을 이용하여
		//각각의 셀렌더러를 아까 생성한 dc에 set해준다.
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
