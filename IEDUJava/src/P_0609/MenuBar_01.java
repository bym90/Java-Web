package P_0609;

import java.awt.*;
import java.awt.event.*;
public class MenuBar_01 {
		MenuItem  exitMI;
	public MenuBar_01() {
		
		Frame f = new Frame();
		
		MenuItem  newMI = new MenuItem("������");
		MenuItem  saveMI = new MenuItem("����");
		MenuItem  openMI = new MenuItem("�ҷ�����");
		MenuShortcut  exitSC = new MenuShortcut(KeyEvent.VK_X);
		exitMI = new MenuItem("����", exitSC);
		
		MenuEvent evt = new MenuEvent();
		exitMI.addActionListener(evt);
		
		MenuItem  largeMI = new MenuItem("ũ��");
		MenuItem  smallMI = new MenuItem("�۰�");
		
		CheckboxMenuItem redCMI = new CheckboxMenuItem("������");
		CheckboxMenuItem blueCMI = new CheckboxMenuItem("�Ķ���");
		CheckboxMenuItem greenCMI = new CheckboxMenuItem("�ʷϻ�");
		
		Menu fileM = new Menu("����");
		Menu editM = new Menu("����");
		Menu fontM = new Menu("�۲�");
		Menu colorM = new Menu("����");
	
		fontM.add(largeMI);
		fontM.add(smallMI);
		
		colorM.add(redCMI);
		colorM.add(blueCMI);
		colorM.add(greenCMI);
		
		editM.add(fontM);
		editM.add(colorM);
		
		fileM.add(newMI);
		fileM.add(saveMI);
		fileM.add(openMI);
		fileM.addSeparator();
		fileM.add(exitMI);
		
		MenuBar MB = new MenuBar();
		MB.add(fileM);
		MB.add(editM);
		
		f.setMenuBar(MB);
		
		f.setSize(600, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuBar_01();

	}
	
	class MenuEvent  implements ActionListener{
		public void actionPerformed(ActionEvent e){
			MenuItem target = (MenuItem) e.getSource();
			if(target == exitMI){
				System.exit(0);
			}
		}
	}

}