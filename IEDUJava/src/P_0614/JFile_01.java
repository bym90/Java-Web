package P_0614;

/*
 * 	���� ���߸� 2�� �����
 * 		 ���� ���߸� ������ ����� ��ȭ����
 * 		 ���� ���߸� ������ ����� ��ȭ���ڸ� ����ϰ�
 * 
 * 	������ ������ �̸��� ����ϵ��� �Ѵ�.
 */
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.io.*;
public class JFile_01 extends CJFrame {
	JButton openB, saveB;
	JTextField field;
	public JFile_01() {
		openB = new JButton("����");
		saveB = new JButton("����");
		
		ButtonEvent evt = new ButtonEvent();
		openB.addActionListener(evt);
		saveB.addActionListener(evt);
		
		JPanel p = new JPanel();
		p.add(openB);
		p.add(saveB);

		field = new JTextField();
		this.add("North", p);
		this.add("South", field);

		this.setSize(400, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new JFile_01();
	}

	class ButtonEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			//��� ���߿��� �̺�Ʈ�� �߻����� ����
			JButton target = (JButton) e.getSource();
			if(target == saveB){
				// 1. JFileChooser�� �����Ѵ�.
				JFileChooser fc = new JFileChooser("C:\\Users\\Administrator\\Desktop");
				// 2. ȭ�鿡 ����Ѵ�.
				int kind = fc.showSaveDialog(JFile_01.this);
				if (kind == JFileChooser.APPROVE_OPTION) {
					//Ȯ�δ��߸� ����� ���������� �����ϴ°�
					//getSelectedFile()�� ������ ������ �˾Ƴ��� �Լ�
					File file = fc.getSelectedFile();
					String filename = file.getName();
					field.setText("������ ���� ������ ������ " + filename);
				}
			}
			else if(target == openB){
				JFileChooser fc = new JFileChooser("C:\\Users\\Administrator\\Desktop");
				fc.showOpenDialog(JFile_01.this);
				int kind = fc.showSaveDialog(JFile_01.this);
				if (kind == JFileChooser.APPROVE_OPTION) {
					//Ȯ�δ��߸� ����� ���������� �����ϴ°�
					//getSelectedFile()�� ������ ������ �˾Ƴ��� �Լ�
					File file = fc.getSelectedFile();
					String filename = file.getName();
					field.setText("�ҷ����⸦ ���� ������ ������ " + filename);
				}
			}
		}
	}
	
}