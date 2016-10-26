package P_0613;

import java.awt.*;
import javax.swing.*;
import GUI.*;
import java.util.*;
public class List_01 {

	public List_01() {
		CJFrame f = new CJFrame();
		f.setLayout(new FlowLayout());
		
		Vector v = new Vector();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		v.add("6");
		
		JList list = new JList(v);
		list.setVisibleRowCount(3);
		JScrollPane sp = new JScrollPane(list);
		//swing은 스크롤바가 자동으로 생성되지 않기때문데 카운트표시를 해줘도
		//6개가 다 뜬다. 그래서 JScrollPane을 생성해줘야 된다.
		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new List_01();

	}

}
