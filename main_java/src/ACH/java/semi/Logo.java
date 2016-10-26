package ACH.java.semi;

import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class Logo {
	
	ImageIcon logo = new ImageIcon("src/ProjectRelated/Logo.png");
	JLabel logoL = new JLabel(logo);
	JPanel logoP = new JPanel();
	
	public Logo() {
		logoP.setLayout(new BorderLayout());
		logoP.add(logoL);
		logoP.setBounds(529, 340, 142, 47);
		logoP.addMouseListener(new clickEvent());
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
