package P_0608;
/*
 * ��ϻ��ڸ� ���Ʒ� �ΰ� �����
 * ���ʿ��� �׸��� �Է��� ��
 * 
 * �����ϸ� ������ �׸��� �Ʒ������� �̵���Ų��.
 * (������ ����Ŭ������ �Ѵ�.)
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
			//1. ������ �׸� �˾Ƴ���
			String item = list1.getSelectedItem();
			//2. �Ʒ��ʿ� �� �׸� �Է��ϱ�
			list2.add(item);
			//3. ���ʿ��� �� �׸� �����ϱ�
			list1.remove(item);
		}
	}
	
}