package P_0614;

import javax.swing.*;
import java.awt.*;
import GUI.*;

public class JSplit_01 extends CJFrame{

	public JSplit_01() {
		//도구를 생성하자.
		OneTab1 one = new OneTab1();
		TwoTab2 two = new TwoTab2();
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		sp.setDividerLocation(300); 
		sp.setOneTouchExpandable(true);
		sp.setDividerSize(10);
		sp.add(one);
		sp.add(two);
		
		this.add(sp);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JSplit_01();

	}

	class OneTab1 extends JPanel{
		OneTab1(){
			JButton b = new JButton("1번 탭");
			this.add(b);
		}
	}
	class TwoTab2 extends JPanel{
		TwoTab2(){
			JTextArea area = new JTextArea(5, 30);
			JScrollPane sp = new JScrollPane(area);
			this.add(sp);
		}
	}
	
}

