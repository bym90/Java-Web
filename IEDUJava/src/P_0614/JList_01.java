package P_0614;

/*
 * ���� ��ϻ��ڸ� �ϳ� �����
 * ���߸� ������ ��ϻ��ڿ� ������ �Էµǵ��� ����.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.util.*;
public class JList_01 {
	JList list;
	String[] friends = {"A","B","C","D","E","F","G","H","I","J","K"};
	Vector vector = new Vector();
	public JList_01() {
		CJFrame frame = new CJFrame();
		list = new JList();
		list.setVisibleRowCount(5);
		//��ũ�ѹٰ� ������ �����Ƿ� ������ ��ũ�ѹٸ� �����־���Ѵ�.
		JScrollPane sp = new JScrollPane(list);
		
		JButton btn = new JButton("Click");
		
		btn.addActionListener(new ButtonEvent());
		
		//�����̳ʿ��� JScrollPane�� �־���Ѵ�.
		frame.add("North", sp);
		frame.add("South", btn);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JList_01();

	}
	
	class ButtonEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// String[]�� 10���� ģ�� �̸��� �غ��س���
			// �����ϰ� �� ģ�� �̸� �ϳ��� list�� �־��ش�
			int pos = (int)(Math.random()*(11 - 0 + 1) +0);
			String temp = friends[pos];
			// ������ JList�ȿ��� �� �Ҹ��� �迭�̳� Vector�� ����
			// �־�� �Ѵ�.
			vector.addElement(temp);
			list.setListData(vector);  
			//�ڵ����� ���� ������ �� �����
			//���ͳ� �迭�� �����͸� �Է��Ѵ�.
		}
	}

}