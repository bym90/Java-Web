package LJY.LJY_STUDY.awt;
/*
 * ��ư�� ���ڿ��� [��������]�� Ŭ���ϸ� [�濵������߿�]���� �ٲٰ�
 * �ٽ� Ŭ���ϸ� [����������SW 40��]�� �ٲٰ� �ٽ� Ŭ���ϸ�
 *  [��������]�� ������ �Ͻÿ�.
 *
 */
/**
 * 1. Swing Component�� �����...
 * 2. inner class�� ��������ʰ� new ��Ų ��
 * 3. setDefaultCloseOperation()
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class ButtonEvent01 extends JFrame{
	public ButtonEvent01(){
		setTitle("��ư �������� ����");
		setLayout(new FlowLayout());


		//��ư ����
		JButton btn = new JButton("��������");
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

			if(b.getText().equals("��������")){
				b.setText("�濵������߿�");
				b.setAutoscrolls(true);
			}else if(b.getText().equals("�濵������߿�")){
				b.setText("����������SW 40��");
			}else{
				b.setText("��������");
			}

		}
	}
	//===============================================
	public static void main(String[] args) {
		new ButtonEvent01();
	}
}
