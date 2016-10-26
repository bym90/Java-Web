package LJY.LJY_STUDY.awt;
/*
 * 버튼의 문자열이 [공부하자]을 클릭하면 [경영기술개발원]으로 바꾸고
 * 다시 클릭하면 [빅데이터응용SW 40기]로 바꾸고 다시 클릭하면
 *  [공부하자]로 나오게 하시오.
 *
 */
/**
 * 1. Swing Component을 사용한...
 * 2. inner class를 사용하지않고 new 시킨 점
 * 3. setDefaultCloseOperation()
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class ButtonEvent01 extends JFrame{
	public ButtonEvent01(){
		setTitle("버튼 연습문제 예제");
		setLayout(new FlowLayout());


		//버튼 생성
		JButton btn = new JButton("공부하자");
		MyActionListener mal = new MyActionListener();
		btn.addActionListener(mal);

		add(btn);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);

	}

	//===============================================
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();

			if(b.getText().equals("공부하자")){
				b.setText("경영기술개발원");
				b.setAutoscrolls(true);
			}else if(b.getText().equals("경영기술개발원")){
				b.setText("빅데이터응용SW 40기");
			}else{
				b.setText("공부하자");
			}

		}
	}
	//===============================================
	public static void main(String[] args) {
		new ButtonEvent01();
	}
}

