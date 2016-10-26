package P_0614;

/*
 * ���߸� ������ 	���� ��ȭ���ڸ� ����ϰ�
 * ������ �����ϸ� �� ������ �̿��ؼ� ��ĥ�϶�.
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
			Color color = JColorChooser.showDialog(frame, "������", Color.RED);
			//���� ������ �ȵǾ��� �� �����Ƿ�
			if (color != null) {
				frame.getContentPane().setBackground(color);
			}
		}
	}
}