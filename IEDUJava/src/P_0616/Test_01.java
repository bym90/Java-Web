package P_0616;

/*
 * 	����
 * 		���߸� �ϳ� ����� ���߸� Ŭ���ϸ� ���ϼ��� ��ȭ���ڰ� ������ �ϰ�
 * 		������ �����ϸ� �� ������ ������ �о �ؽ�Ʈ ����� �������.
 * 
 * 		�޸����� �ҷ����� ����� ������.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import GUI.*;
public class Test_01 {
	JTextArea area;
	CJFrame frame;
	public Test_01() {
		frame = new CJFrame();
		area = new JTextArea();
		Font font = new Font("����ü", Font.PLAIN, 15);
		area.setFont(font);
		area.setBackground(Color.MAGENTA);
		JScrollPane sp = new JScrollPane(area);
		
		JButton btn = new JButton("�ҷ�����");
		btn.addActionListener(new ButtonEvent());
		
		frame.add("Center", sp);
		frame.add("South", btn);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	public String fileChooser(){
		// ������ ������ �̸��� �˷��ֱ� ���ؼ� ��ȯ���� String���� ����
		JFileChooser fc = new JFileChooser();
		int kind = fc.showOpenDialog(frame);
		if(kind == JFileChooser.APPROVE_OPTION){
			File file = fc.getSelectedFile();
			// �� �ȿ��� �ʿ��� ������ ������ ����ؾ� �Ѵ�.
			String path = file.getPath();
			return path;
		}
		else{
			return null;
		}
	}
	
	public void getFileText(String name){
		// ���� ������ �ٽ�
		FileInputStream fin = null;
		try {
			// 1. ���Ͽ� ����� ��Ʈ���� �����Ѵ�.
			fin = new FileInputStream(name);
			while(true){
			byte[] buff = new byte[256];
			int len = fin.read(buff);
			if(len == -1){
				break;
			}
			// ���� ������ ����ϱ� ���ؼ� String���� ��ȯ�Ѵ�.
			String text = new String(buff, 0, len);
			// 2. �ؽ�Ʈ�� ����Ѵ�.
			area.append(text);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			}
			catch(Exception e) {}
		}
		
	}
	
	public static void main(String[] args) {
		new Test_01();

	}
	
	class ButtonEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 1. ������ ������ �� �ִ� ��ȭ���ڸ� �������.
			// 2. ������ ������ �̸��� �˾Ƴ���.
			String filename = fileChooser();
			// 3. �� ������ ������ �ҷ��´�.
			if(filename != null){
				getFileText(filename);
			}
		}
	}

}