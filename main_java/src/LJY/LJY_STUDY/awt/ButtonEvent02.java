package LJY.LJY_STUDY.awt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonEvent02 extends JFrame {
	public ButtonEvent02() {
		setTitle("���콺 ���� ����");
		setLayout(new FlowLayout());

		//��ư����
		JButton btn = new JButton("���콺 �̺�Ʈ ��ư");
		btn.setBackground(Color.LIGHT_GRAY);

		//�̺�Ʈ ó��
		MyMouseEvent mme = new MyMouseEvent();
		btn.addMouseListener(mme);

		//��ư�� ����
		add(btn);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ButtonEvent02();

	}
}

class MyMouseEvent implements MouseListener{
	@Override
	public void mouseEntered(MouseEvent e){//���콺�� ������Ʈ ���� �ö�� ��
		JButton btn = (JButton)e.getSource();

		btn.setBackground(Color.red); //��ư���� ����

	}
	@Override
	public void mouseExited(MouseEvent e){//������Ʈ ���� �ö�� ���콺�� �����Ʈ�� ��� ��
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.yellow);
	}
	@Override
	public void mousePressed(MouseEvent e) {}//���콺 ��ư�� ������ ��
	@Override
	public void mouseReleased(MouseEvent e) {}//������ ��ư�� ������ ��
	@Override
	public void mouseClicked(MouseEvent e) {}//���콺 ��ư�� Ŭ�� �� ��
}