package P_0614;
/*
 * 3개의 탭을 만들고
 * 각각의 ㅌ배에 여러개의 도구를 넣어보자
 */
import java.awt.*;
import javax.swing.*;
import GUI.*;
public class JTab_01 {

	public JTab_01() {
		CJFrame	f = new CJFrame();
		//아래에 만든 Panel을 Tab을 넣어보자.
		//도구를 생성한다.
		OneTab one = new OneTab();
		TwoTab two = new TwoTab();
		ThreeTab three = new ThreeTab();
		//3개의 도구를 tab으로 합친다
		//탭에 도구를 넣을때 탭에 표시될 캡션을 지정하면서 넣는다.
		JTabbedPane tab = new JTabbedPane();
		tab.setTabPlacement(JTabbedPane.TOP);
		tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tab.add(one, "ONE");
		tab.add(two, "TWO");
		tab.add(three, "THREE");
		tab.add(new JButton("4번"), "4번탭");
		tab.add(new JButton("5번"), "5번탭");
		tab.add(new JButton("6번"), "6번탭");
		tab.add(new JButton("7번"), "7번탭");
		tab.add(new JButton("8번"), "8번탭");
		tab.add(new JButton("9번"), "9번탭");
		tab.add(new JButton("10번"), "10번탭");
		tab.add(new JButton("11번"), "11번탭");
	
		
		//컨테이너에 탭을 넣는다
		f.add(tab);
		f.setSize(400, 400);
		f.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new JTab_01();
	}

}
//3개의 탭에 도구를 넣어야 하는데 각각의 탭에 여러개의 도구를
//한번에 넣기 위해서는 Panel로 묶어야 한다.
//그러므로 아예 각각의 탭에 들어갈 도구를 따로 클래스를 만들어서 사용하자.
//카드 레이아웃 연습할때 했던 방식과 동일하다.
class OneTab extends JPanel{
	OneTab(){
		JButton b = new JButton("1번 탭");
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