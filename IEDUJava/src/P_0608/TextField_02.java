package P_0608;
/*
 * 문제
 * 위쪽과 아래에 텍스트 필드를 넣은 후
 * 아래쪽은 암호 입력 상자로 만든다
 * 아래쪽에 내용을 입력하면 입력하는 순간 그 내용이 위쪽에 표시되도록 하라.
 */
import java.awt.*;
import java.awt.event.*;
public class TextField_02 extends Frame {
	TextField upF, downF;
	public TextField_02() {
		upF = new TextField();
		downF = new TextField();
		downF.setEchoChar('@');
		
		downF.addTextListener(new MyEvent());
		
		this.add("North", upF);
		this.add("South", downF);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextField_02();

	}
	
	class MyEvent implements TextListener{
		public void textValueChanged(TextEvent e){
			//1. 아래쪽에 현재까지 입력한 내용을 알아낸다
			//2. 그 내용을 위쪽에 쓴다.
			String text = downF.getText();
			upF.setText(text);
			
		}
	}
	
}

//숙제 2. 위쪽에 목록상자를 만들고 아래쪽에 텍스트 필드를 만든 후
//텍스트 필드에서 엔터키를 치면 그 내용이 그대로 위쪽에 목록상자에 추가되도록 하자.
//그리고 자신은 입력된 내용이 자동으로 지워지도록 한다.

