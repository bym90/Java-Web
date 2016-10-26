package P_0530;

import java.awt.*;
import java.awt.event.*;

public class Inner_Class_05 {

	public static void main(String[] args) {
		Frame f = new Frame();
		//f.addWindowListener(new CloseEvent());
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(400, 400);
		f.setVisible(true);

	}

}


/*class CloseEvent extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	 
}*/
