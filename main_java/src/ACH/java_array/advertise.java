package ACH.java_array;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;

import javax.swing.*;
import javax.swing.border.*;

public class advertise {
	
	ImageIcon icon1 = new ImageIcon("src/ProjectRelated/Ad1.png");
	ImageIcon icon2 = new ImageIcon("src/ProjectRelated/Ad2.png");
	ImageIcon icon3 = new ImageIcon("src/ProjectRelated/Ad3.png");
	
	JLabel L1 = new JLabel(icon1);
	JLabel L2 = new JLabel(icon1);
	JLabel L3 = new JLabel(icon1);
	
	JPanel adP = new JPanel();
	Timer timer;
	int delay = 5000; //Ad duration time
	int count = 0;
	
	public advertise() {
		adP.setLayout(new BorderLayout());
		adP.add(L1);
		adP.setBounds(529, 18, 142, 300);
		L1.addMouseListener(new clickEvent());
		
		ActionListener actionlistener = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count==1){
					L1.setIcon(icon2);
				}else if(count==2){
					L1.setIcon(icon3);
				}else if(count==3){
					L1.setIcon(icon1);
					count = 0;
				}
			}
		};
		
		timer = new Timer(delay, actionlistener);
		timer.start();
	}
	
	class clickEvent extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(Desktop.isDesktopSupported()){
				try{
					Desktop.getDesktop().browse(new URI("http://www.samwooinc.net/"));
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
		}
	}
	
	
}
