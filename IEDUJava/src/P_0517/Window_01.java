package P_0517;
/*
 * 대화상자 만들기
 */
import java.awt.*;
import javax.swing.*;
public class Window_01 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("대화상자");
		f.setLayout(new FlowLayout());
		String[] title={"a", "b", "c", "d", "e"};
		JButton[] btn = new JButton[5];
		for(int i = 0; i < btn.length; i++){
			btn[i] = new JButton(title[i]);
		}
		
		for(int i = 0; i < btn.length; i++){
			f.add(btn[i]);
		}
		/*
		JButton b1 = new JButton("Click1");
		JButton b2 = new JButton("Click2");
		JButton b3 = new JButton("Click3");
		JButton b4 = new JButton("Click4");
		JButton b5 = new JButton("Click5");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		*/
		f.setSize(500, 500);
		f.setVisible(true);
		
	}

}
