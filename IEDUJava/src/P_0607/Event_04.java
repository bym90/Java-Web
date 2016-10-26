package P_0607;

import java.awt.*;
import java.awt.event.*;
public class Event_04 {
		Frame f;
		TextField t;
		Button b;
	public Event_04() {
		f = new Frame();
		t = new TextField("",20);
		b = new Button("ют╥б");
		f.setLayout(new FlowLayout());
		
		f.setSize(300, 300);
		f.setVisible(true);
		
		b.addActionListener(new TextEvent04());
		f.add(b);
		f.add(t);
		
	}

	public static void main(String[] args) {
		new Event_04();
	}

	class TextEvent04 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			t.setText("A");
		}
	}	
}
