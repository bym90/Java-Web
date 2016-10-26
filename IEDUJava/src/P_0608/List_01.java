package P_0608;
/*
 * 목록상자를 위아래 두개 만들고
 * 위쪽에만 항목을 입력한 후
 * 
 * 선택하면 선택한 항목을 아래쪽으로 이동시킨다.
 * (선택은 더블클릭으로 한다.)
 */
import java.awt.*;
import java.awt.event.*;
public class List_01 extends Frame{
	List list1, list2;
	public List_01() {
		list1 = new List(5);
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.addActionListener(new ListEvent());
		
		list2 = new List(5);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		list2.add("e");
		
		this.add("North", list1);
		this.add("South", list2);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new List_01();

	}

	class ListEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//1. 선택한 항목 알아내기
			String item = list1.getSelectedItem();
			//2. 아래쪽에 그 항목 입력하기
			list2.add(item);
			//3. 위쪽에서 그 항목 삭제하기
			list1.remove(item);
		}
	}
	
}
