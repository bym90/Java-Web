package P_0614;

/*
 * 문제 목록상자를 하나 만들고
 * 단추를 누르면 목록상자에 내용이 입력되도록 하자.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.util.*;
public class JList_01 {
	JList list;
	String[] friends = {"A","B","C","D","E","F","G","H","I","J","K"};
	Vector vector = new Vector();
	public JList_01() {
		CJFrame frame = new CJFrame();
		list = new JList();
		list.setVisibleRowCount(5);
		//스크롤바가 생개지 않으므로 강제로 스크롤바를 입혀주어야한다.
		JScrollPane sp = new JScrollPane(list);
		
		JButton btn = new JButton("Click");
		
		btn.addActionListener(new ButtonEvent());
		
		//컨테이너에는 JScrollPane을 넣어야한다.
		frame.add("North", sp);
		frame.add("South", btn);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JList_01();

	}
	
	class ButtonEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// String[]에 10개의 친구 이름을 준비해놓고
			// 랜덤하게 이 친구 이름 하나를 list에 넣어준다
			int pos = (int)(Math.random()*(11 - 0 + 1) +0);
			String temp = friends[pos];
			// 문제는 JList안에는 들어갈 할목을 배열이나 Vector로 만들어서
			// 넣어야 한다.
			vector.addElement(temp);
			list.setListData(vector);  
			//자동으로 먼저 내용을 싹 지우고
			//벡터나 배열을 데이터를 입력한다.
		}
	}

}
