package P_0609;

import java.awt.*;
import java.awt.event.*;
public class MenuBar_01 {
		MenuItem  exitMI;
	public MenuBar_01() {
		
		Frame f = new Frame();
		
		MenuItem  newMI = new MenuItem("새문서");
		MenuItem  saveMI = new MenuItem("저장");
		MenuItem  openMI = new MenuItem("불러오기");
		MenuShortcut  exitSC = new MenuShortcut(KeyEvent.VK_X);
		exitMI = new MenuItem("종료", exitSC);
		
		MenuEvent evt = new MenuEvent();
		exitMI.addActionListener(evt);
		
		MenuItem  largeMI = new MenuItem("크게");
		MenuItem  smallMI = new MenuItem("작게");
		
		CheckboxMenuItem redCMI = new CheckboxMenuItem("빨간색");
		CheckboxMenuItem blueCMI = new CheckboxMenuItem("파란색");
		CheckboxMenuItem greenCMI = new CheckboxMenuItem("초록색");
		
		Menu fileM = new Menu("파일");
		Menu editM = new Menu("편집");
		Menu fontM = new Menu("글꼴");
		Menu colorM = new Menu("색깔");
	
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
