package LJY.form;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;


public class SignUp extends JDialog {
	public SignUp() {


		MainUI.m_Button3.addActionListener(new ButtonEvent01());


			this.addWindowListener(new WindowAdapter(){
				@Override
				public void windowClosing(WindowEvent e) {
					super.windowClosing(e);
					dispose();
				}
			});

		}
	}

	class ButtonEvent01 extends JFrame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			SignUp dlg = new SignUp();

			JPanel jp = new JPanel();
			JLabel jlName = new JLabel("���̵�");

			GridLayout glay = new GridLayout();
			jlName.setLayout(glay);




			JButton jb = new JButton("�ߺ�Ȯ��");
			JLabel jl = new JLabel("��¯�߷� ���Ű� ȯ���մϴ�.");
			jb.setLayout(null);
			jb.setBounds(100, 100, 100, 100);
			dlg.add(jb);

			dlg.setSize(500,500);
			dlg.setVisible(true);
			dlg.setResizable(false);
		}
	}

