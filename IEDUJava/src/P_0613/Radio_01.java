package P_0613;
/*
 * 남자, 여자 각각 3사람을 라디오 단추로 만들고
 * 각각을 그룹으로 묶어주자.
 */
import java.awt.*;
import javax.swing.*;
import GUI.*;
public class Radio_01 extends CJFrame {

	public Radio_01() {
		JRadioButton b1 = new JRadioButton("M1");
		JRadioButton b2 = new JRadioButton("M2");
		JRadioButton b3 = new JRadioButton("M3");
		
		JRadioButton b4 = new JRadioButton("W1");
		JRadioButton b5 = new JRadioButton("W2");
		JRadioButton b6 = new JRadioButton("W3");
		
		ButtonGroup g1 = new ButtonGroup();
		ButtonGroup g2 = new ButtonGroup();
		
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		g2.add(b4);
		g2.add(b5);
		g2.add(b6);
		
		JPanel p1 = new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		JPanel p2 = new JPanel();
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		JPanel p3 = new JPanel(new GridLayout(2, 1));
		p3.add(p1);
		p3.add(p2);
		
		this.add("North", p3);
		this.setSize(400, 400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Radio_01();

	}

}
