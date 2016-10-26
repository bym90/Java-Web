package P_0524;
/*
 * 단추를 하나 만들고 단추를 클릭하면 hello를 출력하자
 */
import java.awt.*;
import java.awt.event.*;
public class Interface_04 {

	public static void main(String[] args) {
		Frame f = new Frame("대화상자");
		Button b = new Button("Click");

		b.addActionListener(new MyEvent09());//복습내용 : 오브젝트를 변수에 기억하지 않아도 되서 오류x	
		f.add(b);								//재사용할 필요가 없으므로 주소에 기억x
												//꼭 변수에 기억하지 않아도 오브젝트 생성
		
		f.setSize(400, 400);
		f.setVisible(true);
		
	}

}

class MyEvent09 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("hello");
	}
}