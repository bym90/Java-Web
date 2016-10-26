package ACH.java_array;

import java.awt.*;
import javax.swing.*;

public class CCTV {
	
	ImageIcon icon1 = new ImageIcon("src/ProjectRelated/111.gif");
	ImageIcon icon2 = new ImageIcon("src/ProjectRelated/222.gif");
	ImageIcon icon3 = new ImageIcon("src/ProjectRelated/333.gif");
	ImageIcon icon4 = new ImageIcon("src/ProjectRelated/444.gif");
	
	JLabel L1 = new JLabel(icon1);
	JLabel L2 = new JLabel(icon2);
	JLabel L3 = new JLabel(icon3);
	JLabel L4 = new JLabel(icon4);
	
	JPanel CCTVPanel = new JPanel(new GridLayout(2,2));
	
	public CCTV() {
		CCTVPanel.add(L1);
		CCTVPanel.add(L2);
		CCTVPanel.add(L3);
		CCTVPanel.add(L4);
		CCTVPanel.setBounds(10, 140, 250, 250);
	}
}
