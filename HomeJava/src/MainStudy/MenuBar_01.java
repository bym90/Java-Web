package MainStudy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuBar_01 extends WindowAdapter {
	Frame f;
	TextArea txt;
	//MenuItem으로 선언을 한 이유는
	//Menubar나 Menu는 ActionListener가 먹히지 않는다.
	MenuItem New;
	MenuItem Exit;
	MenuItem OpenFile;
	MenuItem SaveFile;
	String fileName;
	public MenuBar_01() {

		f = new Frame();
		txt = new TextArea();

		MenuShortcut newSC = new MenuShortcut(KeyEvent.VK_N);
		MenuShortcut openSC = new MenuShortcut(KeyEvent.VK_O);
		MenuShortcut saveSC = new MenuShortcut(KeyEvent.VK_S);
		MenuShortcut exitSC = new MenuShortcut(KeyEvent.VK_X);
		
		MenuBar mb = new MenuBar();
		Menu File = new Menu("File");
			New = new MenuItem("New", newSC);
			OpenFile = new MenuItem("Open File", openSC);
			SaveFile = new MenuItem("Save File", saveSC);
			Exit = new MenuItem("Exit", exitSC);
		Menu Edit = new Menu("Edit");
		Menu Source = new Menu("Source");
		Menu Refactor = new Menu("Refactor");
		Menu Navigate = new Menu("Navigate");
		Menu Search = new Menu("Search");
		Menu Project = new Menu("Project");
		Menu Run = new Menu("Run");
		Menu Window = new Menu("Window");
		Menu Help = new Menu("Help");

		MyEvent evt = new MyEvent();

		mb.add(File);
		File.add(New);
			New.addActionListener(evt);
		File.add(OpenFile);
			OpenFile.addActionListener(evt);
		File.addSeparator();
		File.add(SaveFile);
			SaveFile.addActionListener(evt);
		File.addSeparator();
		File.add(Exit);
			Exit.addActionListener(evt);

		mb.add(Edit);
		mb.add(Source);
		mb.add(Refactor);
		mb.add(Navigate);
		mb.add(Search);
		mb.add(Project);
		mb.add(Run);
		mb.add(Window);
		mb.add(Help);

		f.add(txt);
		f.setSize(600, 300);
		f.setMenuBar(mb);
		f.setVisible(true);
		f.addWindowListener(this);

	}

	public static void main(String[] args) {
		new MenuBar_01();

	}
	//윈도우창닫기 버튼 누를시 창닫기
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	class MyEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			MenuItem target = (MenuItem) e.getSource();

			if (target == New) {
				txt.setText(" ");
			}

			else if (target == OpenFile) {
				FileDialog dopen = new FileDialog(f, "파일오픈", FileDialog.LOAD);
				dopen.setVisible(true);
				fileName = dopen.getDirectory() + dopen.getFile();
				System.out.println(fileName);
				try {
					//문자파일을 읽어들이기 위한 클래스
					//(디폴트의 문자 인코딩과 디폴트의 byte 버퍼의 사이즈가 적절히 설정되어 있는 것을 전제)
					FileReader fr = new FileReader(fileName);
					//문자, 배열, 행을 버퍼링 하는 것에 의해 
					//문자형 텍스트를 효율 좋게 읽어들입니다.
					BufferedReader br = new BufferedReader(fr);
					//초기 캐릭터 라인 버퍼 사이즈를 사용해, 새로운 캐릭터 라인 라이터를 작성합니다.
					StringWriter sw = new StringWriter();
					
					int ch = 0;
					//캐릭터 값은 integer형 범위로 0~65535까지 정해져있고
					//읽어들이는 스트림이 끝이 난다면 -1을 돌려준다
					//다 읽어들인후에는 while문 밖으로 나간다.
					//실제로 읽힌 문자수를 return해준다고 보면된다.
					while((ch=br.read()) != -1){
						sw.write(ch);
					}
					br.close();
					//Char형을 String형으로 변환
					txt.setText(sw.toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
			else if (target == SaveFile){
				FileDialog dsave = new FileDialog(f, "파일저장", FileDialog.SAVE);
				dsave.setVisible(true);
				fileName = dsave.getDirectory() + dsave.getFile();
				System.out.println(fileName);
				try {
					FileWriter fw = new FileWriter(fileName);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(txt.getText());
					bw.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
				
				
////				txt.setText(d.getDirectory());
//				//StringBuffer(String str)은 
//				StringBuffer sbPath = new StringBuffer(d.getDirectory());
////				sbPath.append("\\");
//				String filename = d.getFile();
//				
//				if(filename == null){
//					return;
//				}
//				else sbPath.append(filename);
//				
//				try {
//					//파일에서 스트림을 통해 읽어들인다.
//					FileInputStream fs = new FileInputStream(sbPath.toString());
//					byte[] data = new byte[sbPath.length()];
//					fs.read(data);
//					txt.setText(new String(data));
//					
//				} catch (IOException e2) {
//					txt.setText(e.toString());
//				}
				

			else if (target == Exit) {
				System.exit(0);
			}
		}
	}

	// class FileOp implements ActionListener{
	// public void actionPerformed(ActionEvent e){
	// FileDialog d = new FileDialog(f, "파일오픈", FileDialog.LOAD);
	// d.setVisible(true);
	// }
	// }
	//
	// class Exit implements ActionListener{
	// public void actionPerformed(ActionEvent e){
	// System.exit(0);
	// }
	// }

}
