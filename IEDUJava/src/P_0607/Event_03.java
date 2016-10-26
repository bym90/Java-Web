package P_0607;
/*
 * 앞에서 만든 프로그램을 다시 만들어보자.
 */
import java.awt.*;
import java.awt.event.*;
public class Event_03 extends Frame{

	public Event_03() {
		setLayout(new FlowLayout());
		
		Button b = new Button("Click");
		
		add(b);
		
		setSize(300, 300);
		setVisible(true);
		
		b.addActionListener(new ButtonEvent03());
		
		
	}

	public static void main(String[] args) {
		new Event_03();
	}
	
	class ButtonEvent03 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int red = (int) (Math.random() * (255 - 0 + 1) + 0);
			int blue = (int) (Math.random() * (255 - 0 + 1) + 0);
			int green = (int) (Math.random() * (255 - 0 + 1) + 0);

			Color color = new Color(red, green, blue);
			
			Event_03.this.setBackground(color);
		}
	}

}
