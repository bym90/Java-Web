package P_0609;

import java.awt.*;
import java.awt.event.*;
public class Close_01{

	public Close_01() {
		Frame f = new Frame();
		
		f.setSize(400, 400);
		f.setVisible(true);
		
		CloseEvent evt = new CloseEvent();
		
		f.addWindowListener(evt);
	}

	public static void main(String[] args) {
		new Close_01();

	}
	
//	class CloseEvent implements WindowListener{
//		@Override
//		public void windowActivated(WindowEvent e){} 
//		public void windowDeactivated(WindowEvent e){} 
//		public void windowIconified(WindowEvent e){} 
//		public void windowDeiconified(WindowEvent e){} 
//		public void windowOpened(WindowEvent e) {} 
//		public void windowClosed(WindowEvent e){} 
//		public void windowClosing(WindowEvent e){
//			System.exit(0);
//		}
//	}
	class CloseEvent extends WindowAdapter {
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

}
