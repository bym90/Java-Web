package P_0617;

/*
 * 간단한 메모장 기능(저장과 불러오기)을 만들어보자.
 */
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class Memo extends CJFrame {
	// 불러오기, 저장하기, 종료하기를 위한 메뉴를 만들자.
	JMenuItem saveM, openM, exitM;
	JTextArea area;

	public Memo() {
		area = new JTextArea();
		// 필요하면 폰트나 배경등을 이용해서 이쁘게 처리하라
		JScrollPane sp = new JScrollPane(area);

		saveM = new JMenuItem("Save");
		// 팁
		// 단축키 만들기
		// 스윙의 메뉴는 단축키는 만드는 방법이 달라졌다.
		// Ctrl + S를 누르면 save메뉴가 선택되도록 하고싶다.
		KeyStroke saveS = KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK);
		// 만약 Alt + S ActionEvent.ALT_MASK
		// Ctrl + Alt + S ActionEvent.CTRL_MASK + ActionEvent.ATL_MASK
		saveM.setAccelerator(saveS);
		openM = new JMenuItem("Open");
		exitM = new JMenuItem("Exit");

		MenuEvent evt = new MenuEvent();
		saveM.addActionListener(evt);
		openM.addActionListener(evt);
		exitM.addActionListener(evt);
		
		JMenu fileM = new JMenu("File");
		fileM.add(saveM);
		fileM.add(openM);
		fileM.addSeparator();
		fileM.add(exitM);

		JMenuBar bar = new JMenuBar();
		bar.add(fileM);

		this.setJMenuBar(bar);
		this.add("Center", sp);
		this.setSize(400, 400);
		this.setVisible(true);

	}

	public void saveProc() {
		// 1. 저장할 파일 이름을 알아낸다.
		// 1.1 파일을 선택할 수 있는 대화상자를 부른다.
		JFileChooser fc = new JFileChooser("D:\\");
		int kind = fc.showSaveDialog(this);
		// 1.2 선택한 파일의 경로와 이름을 알아낸다.
		File file = null;
		if(kind == JFileChooser.APPROVE_OPTION){
			file = fc.getSelectedFile();
		}
		else{
			return;
		}
		// 2. 저장한다.
		// 2.1 스트림을 생성한다.
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			// 2.2 저장한다.
			// 2.2.1 저장할 내용을 알아야 한다.
			String str = area.getText();
			// 2.2.2 저장한다.
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	public void openProc() {
		// 1. 불러올 파일을 알아낸다.
		//    파일 선택 상자를 보여주고
		JFileChooser fc = new JFileChooser("D:\\");
		
		int kind = fc.showOpenDialog(this);
		//선택한 파일을 알아낸다.
		File file = null; // 다른곳에서 사용을 위해 전역변수로
		if(kind == JFileChooser.APPROVE_OPTION){
			file = fc.getSelectedFile();
		}
		else{
			return;
		}
		// 이제부터 파일을 읽어서 Textarea에 기록할 예정이다.
		// 그러므로 먼저 TextArea에 있는 내용을 지우고 시작해야한다.
		area.setText("");
		// 2. 파일의 내용을 읽어서 Textarea에 출력한다.
		FileReader fr = null;
		try {
			// 스트림 열어서
			fr = new FileReader(file);
			// 파일의 크기르르 모른다고 가정하고
			while(true){
				// 내용을 읽는다
				char[] buff = new char[256];
				int len = fr.read(buff);
				if(len == -1){
					break;
				}
				String temp = new String(buff, 0 , len);
				area.append(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Memo();

	}

	class MenuEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 메뉴가 3개가 있으므로 구분해서 처리한다.
			JMenuItem target = (JMenuItem) e.getSource();
			if (target == saveM) {
				saveProc();
			} else if (target == openM) {
				openProc();
			} else if (target == exitM) {
				System.exit(0);
			}
		}
	}
}
