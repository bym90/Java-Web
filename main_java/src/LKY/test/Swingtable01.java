package LKY.test;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Swingtable01 {

	public Swingtable01() {

		JFrame frame = new JFrame("Swing Table");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//가로 3줄 세로 10줄 테이블 생성(기본 테이블)
		JTable table = new JTable(10,3);

		//Object[][] o1 = {{"1","2","3"},{"4","5","6"},{"4","5","6"},{"4","5","6"},{"4","5","6"},{"4","5","6"},{"4","5","6"},{"4","5","6"},{"4","5","6"}};
		//Object[] o2 = {"1번","2번","3번"};

		//JTable(Object[][] rowData, Object[] columnNames)
		//JTable table = new JTable(o1,o2);

		frame.add(new JScrollPane(table));
		frame.setSize(400, 200);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		new Swingtable01();

	}

}
