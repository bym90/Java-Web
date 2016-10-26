package BYM_Study.HomeWork;

//숙제 2. 위쪽에 목록상자를 만들고 아래쪽에 텍스트 필드를 만든 후
//텍스트 필드에서 엔터키를 치면 그 내용이 그대로 위쪽에 목록상자에 추가되도록 하자.
//그리고 자신은 입력된 내용이 자동으로 지워지도록 한다.
import java.awt.*;
import java.awt.event.*;

public class TextField_03 {
	TextField TF;
	List L;

	public TextField_03() {
		Frame f = new Frame();

		TF = new TextField();
		L = new List(5);

		TF.addActionListener(new MyEvent());

		f.add(TF, "North");
		f.add(L, "South");

		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new TextField_03();

	}

	class MyEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String txt = TF.getText();
			TF.setText(" ");
			L.add(txt);
		}
	}

}
