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
//		Button b = new Button("눌러봐");
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
//		//자바는 기본적으로 모달이 false이다... true로 설정하자.
//		super(m.frame,true); //Dialog (Frame  owner, boolean modal)
//		//super(다른 컨테이너);
//		//다른 컨테이너는 여기서는 Frame이 될 것이다.
//		main = m;
//		//이 안에 필요한 도구를 만들면 될 것이다.
//
//		//필요하면 x 단추를 누르면 닫히도록 해야 할 것이다.
//		//무명 클래스를 이용해서 처리하자
//		this.addWindowListener(new WindowAdapter(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				super.windowClosing(e);
//				//이번에는 프로그램을 종료하는 것이 아니고 대화상자만
//				//닫아주어야 한다.
//				setVisible(false);
//				//반드시 필요한 것이 아니고 필요하면 사용하는 것인데
//				//메모리에서도 삭제하기를 원하면
//				dispose();
//				//다만 이 명령이 나오면 이 대화상자를 다시 사용할 수 없고
//				//다시 사용하고 싶으면 new 부터 다시 시켜야 한다.
//				// dispose()를 사용하지 않으면
//				// setVisible(true)하면 다시 화면에 출력할 수도 있다.
//			}
//		});
//
//	}
////	MyDialog() {} //기본생성자
//}