package P_0617;

/*
 * ������ �޸��� ���(����� �ҷ�����)�� ������.
 */
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class Memo extends CJFrame {
	// �ҷ�����, �����ϱ�, �����ϱ⸦ ���� �޴��� ������.
	JMenuItem saveM, openM, exitM;
	JTextArea area;

	public Memo() {
		area = new JTextArea();
		// �ʿ��ϸ� ��Ʈ�� ������ �̿��ؼ� �̻ڰ� ó���϶�
		JScrollPane sp = new JScrollPane(area);

		saveM = new JMenuItem("Save");
		// ��
		// ����Ű �����
		// ������ �޴��� ����Ű�� ����� ����� �޶�����.
		// Ctrl + S�� ������ save�޴��� ���õǵ��� �ϰ��ʹ�.
		KeyStroke saveS = KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK);
		// ���� Alt + S ActionEvent.ALT_MASK
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
		// 1. ������ ���� �̸��� �˾Ƴ���.
		// 1.1 ������ ������ �� �ִ� ��ȭ���ڸ� �θ���.
		JFileChooser fc = new JFileChooser("D:\\");
		int kind = fc.showSaveDialog(this);
		// 1.2 ������ ������ ��ο� �̸��� �˾Ƴ���.
		File file = null;
		if(kind == JFileChooser.APPROVE_OPTION){
			file = fc.getSelectedFile();
		}
		else{
			return;
		}
		// 2. �����Ѵ�.
		// 2.1 ��Ʈ���� �����Ѵ�.
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			// 2.2 �����Ѵ�.
			// 2.2.1 ������ ������ �˾ƾ� �Ѵ�.
			String str = area.getText();
			// 2.2.2 �����Ѵ�.
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
		// 1. �ҷ��� ������ �˾Ƴ���.
		//    ���� ���� ���ڸ� �����ְ�
		JFileChooser fc = new JFileChooser("D:\\");
		
		int kind = fc.showOpenDialog(this);
		//������ ������ �˾Ƴ���.
		File file = null; // �ٸ������� ����� ���� ����������
		if(kind == JFileChooser.APPROVE_OPTION){
			file = fc.getSelectedFile();
		}
		else{
			return;
		}
		// �������� ������ �о Textarea�� ����� �����̴�.
		// �׷��Ƿ� ���� TextArea�� �ִ� ������ ����� �����ؾ��Ѵ�.
		area.setText("");
		// 2. ������ ������ �о Textarea�� ����Ѵ�.
		FileReader fr = null;
		try {
			// ��Ʈ�� ���
			fr = new FileReader(file);
			// ������ ũ�⸣�� �𸥴ٰ� �����ϰ�
			while(true){
				// ������ �д´�
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
			// �޴��� 3���� �����Ƿ� �����ؼ� ó���Ѵ�.
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