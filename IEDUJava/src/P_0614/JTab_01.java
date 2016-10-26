package P_0614;
/*
 * 3���� ���� �����
 * ������ ���迡 �������� ������ �־��
 */
import java.awt.*;
import javax.swing.*;
import GUI.*;
public class JTab_01 {

	public JTab_01() {
		CJFrame	f = new CJFrame();
		//�Ʒ��� ���� Panel�� Tab�� �־��.
		//������ �����Ѵ�.
		OneTab one = new OneTab();
		TwoTab two = new TwoTab();
		ThreeTab three = new ThreeTab();
		//3���� ������ tab���� ��ģ��
		//�ǿ� ������ ������ �ǿ� ǥ�õ� ĸ���� �����ϸ鼭 �ִ´�.
		JTabbedPane tab = new JTabbedPane();
		tab.setTabPlacement(JTabbedPane.TOP);
		tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tab.add(one, "ONE");
		tab.add(two, "TWO");
		tab.add(three, "THREE");
		tab.add(new JButton("4��"), "4����");
		tab.add(new JButton("5��"), "5����");
		tab.add(new JButton("6��"), "6����");
		tab.add(new JButton("7��"), "7����");
		tab.add(new JButton("8��"), "8����");
		tab.add(new JButton("9��"), "9����");
		tab.add(new JButton("10��"), "10����");
		tab.add(new JButton("11��"), "11����");
	
		
		//�����̳ʿ� ���� �ִ´�
		f.add(tab);
		f.setSize(400, 400);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new JTab_01();
	}

}
//3���� �ǿ� ������ �־�� �ϴµ� ������ �ǿ� �������� ������
//�ѹ��� �ֱ� ���ؼ��� Panel�� ����� �Ѵ�.
//�׷��Ƿ� �ƿ� ������ �ǿ� �� ������ ���� Ŭ������ ���� �������.
//ī�� ���̾ƿ� �����Ҷ� �ߴ� ��İ� �����ϴ�.
class OneTab extends JPanel{
	OneTab(){
		JButton b = new JButton("1�� ��");
		this.add(b);
	}
}
class TwoTab extends JPanel{
	TwoTab(){
		JTextArea area = new JTextArea(5, 30);
		JScrollPane sp = new JScrollPane(area);
		this.add(sp);
	}
}
class ThreeTab extends JPanel{
	ThreeTab(){
		JCheckBox box1= new JCheckBox("A");
		JCheckBox box2= new JCheckBox("B");
		JCheckBox box3= new JCheckBox("C");
		this.add(box1);
		this.add(box2);
		this.add(box3);
	}
}