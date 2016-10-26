package P_0615;

/*
 * 간단한 테이블 하나 만들어보자
 */
import javax.swing.*;
import GUI.*;

public class JTable_01 {

	public JTable_01() {
		CJFrame frame = new CJFrame();
		// 테이블을 만들기 위해서는 테이블에 들어갈 제목을 만들어야 한다.
		String[] title = { "년도", "월", "일" };
		// 테이블 안에 들어갈 데이터는 2차 배열로 만들면된다.
		// 1차 배열이 한줄의 데이터가 되면서 2차배열 갯수만큼 줄이 생긴다.
		String[][] data = { { "2016", "1", "1" }, { "2015", "2", "2" }, { "2014", "3", "3" } };
		
		JTable table = new JTable(data, title);
		// 역시 스크롤바는 자동으로 생기지 않으므로 반드시 스크롤바를 만들어줘야 한다.
		// JTable에 스크롤바를 만들지 않으면 모양이 원하는 모양으로 나오지 않는다.
		JScrollPane sp = new JScrollPane(table);
		
		frame.add(sp);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JTable_01();

	}

}
