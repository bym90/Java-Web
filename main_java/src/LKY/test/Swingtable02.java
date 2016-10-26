package LKY.test;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/*
 * AbstractTableModel
 *
 * 테이블을 생성할 때 모델을 정의하지 않으면 디폴트 모델을 사용한다.
 *
 * AbstractTableModel은 모델을 정의하는 것
 *
 * 모델클래스를 생성하는 법
 *
 * 1. 테이블 모델을 만든다.
 * 2. 테이블 모델을 이용하여 테이블을 만든다
 * 3. 컨테이너에 테이블을 붙인다.
 */
import javax.swing.table.AbstractTableModel;

//AbstractTableModel의 서브 클래스 생성
class MyModel extends AbstractTableModel{
	//테이블의 각 셀에 들어갈 데이터를 2차원 배열로 선언하여 저장
	Object[][] data = {{"이규영","010-1111-1111","27"},{"홍길동","010-2222-2222","28"}};

	//getColumnCount메서드를 오버라이딩
	@Override
	public int getColumnCount(){ //컬럼의 수를 리턴
		return data[0].length;
	}

	//getRowCount메서드를 오버라이딩
	@Override
	public int getRowCount(){ //로우의 수를 리턴
		return data.length;

	}

	//getValueAt메서드를 오버라이딩
	@Override
	public Object getValueAt(int r, int c){ // 컬럼 인덱스와 로우 인덱스에 해당하는 벨류값을 리턴
		return data[r][c];
	}
}

public class Swingtable02 extends JFrame  {

	public Swingtable02(){

		//모델 객체를 생성
		MyModel mm = new MyModel();

		//테이블 객체 생성할 대 생성자에 지정해줌
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
