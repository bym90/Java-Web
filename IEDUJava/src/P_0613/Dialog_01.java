package P_0613;

/*
 * Frame에 단추를 만들고 단추를 누르면 또다른 대화상자가 나오도록 하자.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.CFrame;

public class Dialog_01 {
	CFrame frame;

	public Dialog_01() {
		frame = new CFrame();
		Button b = new Button("Click");
		b.addActionListener(new ButtonEvent01());
		frame.add("South", b);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Dialog_01();

	}
	class ButtonEvent01 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			MyDialog dlg = new MyDialog(Dialog_01.this);
			dlg.setSize(400, 400);
			dlg.setVisible(true);
		}
	}

}
// 대화상자안에도 많은 도구들이 들어가야 하므로
// 대화상자도 따로 만들어서 사용하는것이 좋다
// Dialog는 혼자서는 만들지 못하고 반드시 다른 컨테이너가 있어야 한다.
class MyDialog extends Dialog{
	//Dialog_01 main;
	MyDialog(Dialog_01 m){
		super(m.frame, true);//다른 컨테이너는 여기서는 Frame이 될것이다.
		//main = m;
		//이안에 필요한 도구를 만들면 될 것이다.
		//필요하면 x 단추를 누르면 닫히도록 해야할 것이다.
		//무명 클래스를 이용해서 처리하자.
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//이번에는 프로그램을 종료하는 것이 아니고 대화상자만 닫아주어야 한다.
				setVisible(false);
				//반드시 필요한것이 아니고 필요하면 사용하는것
				//메모리에서도 삭제하기를 원하면
				dispose();
				//다만 이명령이 나오면 이 대화상자는 다시 사용할 수 없다.
				//다시 사용하고 싶다면 new부터 다시시켜야 한다.
				//dispose()를 사용하지 않으면
				//setVisible(true)라면 다시 화면에 출력할 수도 있다.
			}
		});
	}
}
