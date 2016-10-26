package MainStudy;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuBar_01 extends WindowAdapter {
	Frame f;
	TextArea txt;
	//MenuItem���� ������ �� ������
	//Menubar�� Menu�� ActionListener�� ������ �ʴ´�.
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
	//������â�ݱ� ��ư ������ â�ݱ�
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
				FileDialog dopen = new FileDialog(f, "���Ͽ���", FileDialog.LOAD);
				dopen.setVisible(true);
				fileName = dopen.getDirectory() + dopen.getFile();
				System.out.println(fileName);
				try {
					//���������� �о���̱� ���� Ŭ����
					//(����Ʈ�� ���� ���ڵ��� ����Ʈ�� byte ������ ����� ������ �����Ǿ� �ִ� ���� ����)
					FileReader fr = new FileReader(fileName);
					//����, �迭, ���� ���۸� �ϴ� �Ϳ� ���� 
					//������ �ؽ�Ʈ�� ȿ�� ���� �о���Դϴ�.
					BufferedReader br = new BufferedReader(fr);
					//�ʱ� ĳ���� ���� ���� ����� �����, ���ο� ĳ���� ���� �����͸� �ۼ��մϴ�.
					StringWriter sw = new StringWriter();
					
					int ch = 0;
					//ĳ���� ���� integer�� ������ 0~65535���� �������ְ�
					//�о���̴� ��Ʈ���� ���� ���ٸ� -1�� �����ش�
					//�� �о�����Ŀ��� while�� ������ ������.
					//������ ���� ���ڼ��� return���شٰ� ����ȴ�.
					while((ch=br.read()) != -1){
						sw.write(ch);
					}
					br.close();
					//Char���� String������ ��ȯ
					txt.setText(sw.toString());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
			else if (target == SaveFile){
				FileDialog dsave = new FileDialog(f, "��������", FileDialog.SAVE);
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
//				//StringBuffer(String str)�� 
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
//					//���Ͽ��� ��Ʈ���� ���� �о���δ�.
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
	// FileDialog d = new FileDialog(f, "���Ͽ���", FileDialog.LOAD);
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