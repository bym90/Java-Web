package P_0614;

/*
 * 단추를 누르면 	색상 대화상자를 출력하고
 * 색상을 선택하면 그 색상을 이용해서 색칠하라.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class JColor_01 {
	CJFrame frame;
	public JColor_01() {
		frame = new CJFrame();
		
		JButton	btn = new JButton("Click");
		btn.addActionListener(new ButtonEvent());
		frame.add("South", btn);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new JColor_01();

	}
	
	class ButtonEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Color color = JColorChooser.showDialog(frame, "색상선택", Color.RED);
			//색상 선택이 안되었을 수 있으므로
			if (color != null) {
				frame.getContentPane().setBackground(color);
			}
		}
	}
}
