//package IEDU.project;
//
//import java.awt.Button;
//import java.awt.Dialog;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import IEDU.GUI.CFrame;
//
//
//
//public class SignUp {
//
//	CFrame frame;
//	public SignUp() {
//		frame = new CFrame();
//
//		Button b = new Button("������");
//		b.addActionListener(new ButtonEvent01());
//		frame.add("South", b);
//		frame.setSize(400,400);
//		frame.setVisible(true);
//
//	}
//
//	class ButtonEvent01 implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			MyDialog dlg = new MyDialog(SignUp.this);
//			dlg.setSize(300,300);
//			dlg.setVisible(true);
//		}
//	}
//}
//
//class MyDialog extends Dialog{
//	SignUp main;
//
//	MyDialog(SignUp m){
////		super(m.frame);
//		//�ڹٴ� �⺻������ ����� false�̴�... true�� ��������.
//		super(m.frame,true); //Dialog (Frame  owner, boolean modal)
//		//super(�ٸ� �����̳�);
//		//�ٸ� �����̳ʴ� ���⼭�� Frame�� �� ���̴�.
//		main = m;
//		//�� �ȿ� �ʿ��� ������ ����� �� ���̴�.
//
//		//�ʿ��ϸ� x ���߸� ������ �������� �ؾ� �� ���̴�.
//		//���� Ŭ������ �̿��ؼ� ó������
//		this.addWindowListener(new WindowAdapter(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				super.windowClosing(e);
//				//�̹����� ���α׷��� �����ϴ� ���� �ƴϰ� ��ȭ���ڸ�
//				//�ݾ��־�� �Ѵ�.
//				setVisible(false);
//				//�ݵ�� �ʿ��� ���� �ƴϰ� �ʿ��ϸ� ����ϴ� ���ε�
//				//�޸𸮿����� �����ϱ⸦ ���ϸ�
//				dispose();
//				//�ٸ� �� ������ ������ �� ��ȭ���ڸ� �ٽ� ����� �� ����
//				//�ٽ� ����ϰ� ������ new ���� �ٽ� ���Ѿ� �Ѵ�.
//				// dispose()�� ������� ������
//				// setVisible(true)�ϸ� �ٽ� ȭ�鿡 ����� ���� �ִ�.
//			}
//		});
//
//	}
////	MyDialog() {} //�⺻������
//}