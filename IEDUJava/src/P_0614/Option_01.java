package P_0614;

/*
 * �����ϳ� ����� �� ���߸� Ŭ���ϸ� ���� Option ��ȭ���ڸ� ����غ���
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class Option_01 {
	CJFrame frame;

	public Option_01() {
		frame = new CJFrame("�ɼ� �׽�Ʈ");
		JButton btn = new JButton("Click");
		btn.addActionListener(new ButtonEvent01());
		frame.add("South", btn);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	// Confirm ��ȭ���ڸ� ����� �Լ��� ���� ��������.
	public void showConfirm() {
		// JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?");
		int	kind = JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?");
		//	kind���� ������ ������ ������ ���ȴ�.
		//	�� ������ ������ �غ�Ǿ� �ִ�.
		if(kind == JOptionPane.YES_OPTION) {
			//	�� ������ YES(��) ���߸� ���ȴ����� �����ϴ� ���̴�.
			System.out.println("��");
		}
		else if(kind == JOptionPane.NO_OPTION) {
			//	�� ������ NO(�ƴϿ�) ���߸� ���ȴ����� �����ϴ� ���̴�.
			System.out.println("�ƴϿ�");
		}
		else if(kind == JOptionPane.CANCEL_OPTION) {
			//	�� ������ Cancel(���) ���߸� ���ȴ����� �����ϴ� ���̴�.
			System.out.println("���");
		}
		else {
			//	��Ÿ ���߸� ���ȴ��� �����Ѵ�.
			System.out.println("��Ÿ");		
		}
		// JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?", "����Ȯ��", JOptionPane.YES_NO_OPTION);
		// JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?", "����Ȯ��", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		// JOptionPane.showConfirmDialog(frame, "�����Ͻðڽ��ϱ�?", "����Ȯ��", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon("./src/P_0613/icon.gif"));
	}

	public void showMessage() {
		// JOptionPane.showMessageDialog(frame, "����Ǿ����ϴ�.");
		// JOptionPane.showMessageDialog(frame, "����Ǿ����ϴ�.", "����Ȯ��", JOptionPane.ERROR_MESSAGE);
		// JOptionPane.showMessageDialog(frame, "�����߻�", "����", 0, new ImageIcon("./src/P_0613/icon.gif"));
		// �� ��ȭ���ڴ� ������ ����� �ֱ� ������ ������� ���� ������ ����.
		// ��ȯ���� �������� �ʴ´�.
	}
	
	public void showInput(){
		// �� ��ȭ���ڸ� ����ϴ� ������ ����ڰ� ������ �Է��ϵ��� �ϱ� �����̴�.
		// �׷��Ƿ� ����ڰ� �Է��� ������ �������� �˾ƾ� �� ���̴�.
		// ��� �� �Լ��� ��ȯ���� String�̴�. �Է��� ������ ��ȯ�޴� ���̴�.
		
		/*String who = JOptionPane.showInputDialog(frame, "�ʴ� ������?");
		// �׷��� ����ڰ� �Է��� ���� ���� ���� �ְ� ����ڰ� �Է��� �߾��
		// ��ҽ�ų �� �ִ�. �׷��� ��ȯ ���� �ùٷ� �����ϴ����� �ݵ�� ����� ����ؾ� �Ѵ�.
		if(who == null || who.length() == 0){
			// ����ڰ� �Է����� �ʾҰų� ��ҽ�Ų ���̴�.
			System.out.println("�Էµ��� �ʾҾ��");
		}
		else{
			//�����ϰ� �Է������� 
			System.out.println("����� " + who);
		}*/
		// JOptionPane.showInputDialog(frame, "�ʴ� ������?", "�޷�");
		// JOptionPane.showInputDialog(frame, "�ʴ� ������?", "�ȳ�", JOptionPane.PLAIN_MESSAGE);
		/*String[] items = {"A", "B", "C", "D", "E"};
		String item = "D";
		JOptionPane.showInputDialog(frame, "�ʴ� ������?", "�ȳ�", JOptionPane.QUESTION_MESSAGE, null, items, item);*/
	}
	
	public void showOption(){
		String[] caps = {"A", "B", "C"};
		String cap = "B";
		JOptionPane.showOptionDialog(frame, "�����ϼ���", "����", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, caps, cap);
		// ĸ���� ȭ�鿡 ��Ÿ���� ��縸 �ٲ���̰� 
		//���� ���ߴ� YES, NO, CANCEL ���߷� �Ǵ��ؾ� �Ѵ�.
	}

	public static void main(String[] args) {
		new Option_01();

	}

	class ButtonEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 1. Confirm ��ȭ���ڸ� ����غ���.
			// ������ �� ����Լ��� ���� ���� ó���Ѵ�.
//			showConfirm();
			// 2. Message ��ȭ���ڸ� ����غ���.
//			showMessage();
			// 3. Input ��ȭ���ڸ� ����غ���
//			showInput();
			showOption();
		}
	}
}