package P_0608;

/*
 * 문제 위쪽과 아래쪽에 2개의 콤보상자를 만든다.
 * 내용은 위쪽에만 입력하도록 한다.
 * 
 * 위쪽 콤보상자에서 하나를 선택하면 선택한 항목이 아래쪽에 추가되도록 하자.
 */
import java.awt.*;
import java.awt.event.*;

public class Choice_01 {
	Choice upC, downC;

	public Choice_01() {
		Frame f = new Frame();
		ComboEvent e = new ComboEvent();
		upC = new Choice();
		upC.add("A");
		upC.add("B");
		upC.add("C");
		upC.add("D");
		upC.add("E");
		
		
		upC.addItemListener(e);
		
		downC = new Choice();
		downC.add("F");
		downC.add("G");
		downC.add("H");
		downC.add("I");
		downC.add("J");
		downC.addItemListener(e);
		
		
		f.add("North", upC);
		f.add("South", downC);

		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new Choice_01();

	}
	
	class ComboEvent implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e){
			//비록 콤보상자는 2개를 만들었지만 문제산
			//한곳에만 이벤트를 등록하면 된다.
			//굳이 어느곳에서 이벤트가 발생했는지 구분할 필요가 없다.
			//1. 선택한 항목을 알아낸다.
			//2. 아래쪽에 그 항목을 표시한다.
			
			Choice target = (Choice) e.getSource();
			if(target == upC){
			String item = upC.getSelectedItem();
			downC.add(item);
			upC.remove(item);
			}
			
			if(target == downC){
			String item2 = downC.getSelectedItem();
			upC.add(item2);
			downC.remove(item2);
			}
			
		}
	}

}

//숙제 1. 두개의 콤보상자를 만들고 두곳 모두 항목을 입력해 놓고
//		  하나를 선택하면 선택한 항목을 상대방 콤보상자로 이동하도록 하자.

