package ACH.java_array;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class OperMode {
	Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
	Color color = new Color(224,224,224);
	
	ImageIcon icon1 = new ImageIcon("src/ProjectRelated/AutoMode.jpg");
	ImageIcon icon2 = new ImageIcon("src/ProjectRelated/ManualMode.jpg");
	
	JLabel switchL1 = new JLabel();
	JLabel switchText = new JLabel("AUTO");
	
	
	JPanel OperModeP = new JPanel();
	JPanel letterP = new JPanel();
	JPanel pictureP = new JPanel();
	
	boolean onOff = true;
	
	
	
	public OperMode() {
		switchL1.setIcon(icon1);
		
		switchText.setFont(font);
		
		OperModeP.setLayout(new GridLayout(1,2));
		pictureP.setLayout(new BorderLayout());
		letterP.setLayout(new BorderLayout());
		
		OperModeP.setBackground(color);
		letterP.setBackground(color);
		pictureP.setBackground(color);
		
		letterP.add(switchText);
		pictureP.add(switchL1);
		
		OperModeP.add(pictureP);
		OperModeP.add(letterP);
		
		OperModeP.setBounds(270, 140, 180, 80);
		OperModeP.setBorder(new BorderSet().border6);
		
		ModeClick1 evt1 = new ModeClick1();
		pictureP.addMouseListener(evt1);
		
	}
	
	class ModeClick1 extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(onOff==true){
				onOff=false;
				switchL1.setIcon(icon2);
				switchText.setText("MANUAL");
			}else{
				onOff=true;
				switchL1.setIcon(icon1);
				switchText.setText("AUTO");
				
			}
		}
	}
}
