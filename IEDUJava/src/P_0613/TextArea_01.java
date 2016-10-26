package P_0613;
/*
 * 텍스트 area를 하나 만들어서 구경하자
 */
import java.awt.*;
import javax.swing.*;
import GUI.*;
public class TextArea_01 {

	public TextArea_01() {
		CJFrame f = new CJFrame();
		f.setLayout(new FlowLayout());
		
		JTextArea  area = new JTextArea(5, 30);
		JScrollPane sp = new JScrollPane(area);
		
		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new TextArea_01();
	}

}
