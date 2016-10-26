package LJY.LJY_STUDY.awt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonEvent02 extends JFrame {
	public ButtonEvent02() {
		setTitle("마우스 제어 예제");
		setLayout(new FlowLayout());

		//버튼생성
		JButton btn = new JButton("마우스 이벤트 버튼");
		btn.setBackground(Color.LIGHT_GRAY);

		//이벤트 처리
		MyMouseEvent mme = new MyMouseEvent();
		btn.addMouseListener(mme);

		//버튼을 달자
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
	public void mouseEntered(MouseEvent e){//마우스가 컴포넌트 위에 올라올 때
		JButton btn = (JButton)e.getSource();

		btn.setBackground(Color.red); //버튼색을 변경

	}
	@Override
	public void mouseExited(MouseEvent e){//컴포넌트 위에 올라온 마우스가 컴토넌트를 벗어날 때
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.yellow);
	}
	@Override
	public void mousePressed(MouseEvent e) {}//마우스 버튼이 눌러질 때
	@Override
	public void mouseReleased(MouseEvent e) {}//눌러진 버튼이 떼어질 때
	@Override
	public void mouseClicked(MouseEvent e) {}//마우스 버튼이 클릭 될 때
}
