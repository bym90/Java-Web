package P_0614;
/*
 * 토글 단추를 하나 만들고
 * Frame의 색상을 변경하라
 * 
 * JFrame은 여러개의 Layout이 겹쳐져서 만들어진 Frame이다.
 * 그중 가장 바깥에 있는 Layer에는 색상을 칠 할 수가 없다.
 * 
 * 결론 안쪽 Layer에 색상을 칠해야 색상이 보이게 된다.
 * 
 * 안쪽 Layer를 알아내는방법
 * getContentPane()
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import GUI.*;

public class Toggle_01 extends CJFrame {
	JToggleButton tb;
	public Toggle_01() {
		this.setLayout(new FlowLayout());
		
		tb = new JToggleButton("Click");
		tb.addChangeListener(new ToggleEvent());
		
		this.add(tb);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Toggle_01();

	}
	
	class ToggleEvent implements ChangeListener{
		public void stateChanged(ChangeEvent e){
			// 만약 선택이 되었으면 빨간색으로 칠하고
			// 선택이 되지 않았으면 파란색으로 칠하고자 한다.
			if(tb.isSelected()){
				// 1. 안쪽 Layer를 알아낸다
				Container c = getContentPane();
				// 2. 안쪽 Layer에 색상을 칠한다.
				c.setBackground(Color.red);
			}
			else{
				// 1. 안쪽 Layer를 알아낸다
				Container c = getContentPane();
				// 2. 안쪽 Layer에 색상을 칠한다.
				c.setBackground(Color.CYAN);
			}
		}
	}

}
