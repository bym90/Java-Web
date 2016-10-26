package P_0608;

/*
 * 단추를 2개 만든후 첫번째 단추를 누르면 5단 구구단을 만들고
 * 					 두번째 단추를 누르면 프로그램을 종료하자.
 */
import java.awt.*;
import java.awt.event.*;

public class Event_02 extends Frame {
	Button b1, b2;

	public Event_02() {
		
		ButtonEvent02 evt = new ButtonEvent02();
		
		b1 = new Button("구구단");
		b2 = new Button("종료하기");
		
		b1.addActionListener(evt);
		b2.addActionListener(evt);

		this.add(b1, "South");
		this.add(b2, "North");

		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Event_02();

	}

	// 이벤트 클래스 제작
	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//이 함수는 JVM이 이벤트가 발생하면 자동 호출하는 함수이다.
			//JVM은 이 함수를 호출하면서 이벤트에 대한 정보를 알려준다
			//예> 어느 위치에서 이벤트가 발생했는지?
			//마우스의 어느 단추가 눌려졌는지?
			//이벤트가 일어난 도구가 무엇인지?
			//이벤트 정보를 받는 부분 ActionEvent e 이다.

			//이 정보중에서 getSource()를 이용하면 이벤트가 일어난 도구를
			//알아낼 수 이다.
			
			//이벤트가 일어난 단추를 알아내서
			Button	target = (Button) e.getSource();
			//그 단추를 구분하여 원하는 처리를 하면된다.
			if(target == b1) {
				for(int i = 1; i <= 9; i++) {
					int	dap = 5 * i;
					System.out.println("5 * " + i + " = " + dap);
				}
			}
			else if(target == b2) {
				//프로그램 종료 방법
				System.exit(0);
			}
		}
	}
	
}


