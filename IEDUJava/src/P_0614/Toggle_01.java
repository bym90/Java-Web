package P_0614;
/*
 * ��� ���߸� �ϳ� �����
 * Frame�� ������ �����϶�
 * 
 * JFrame�� �������� Layout�� �������� ������� Frame�̴�.
 * ���� ���� �ٱ��� �ִ� Layer���� ������ ĥ �� ���� ����.
 * 
 * ��� ���� Layer�� ������ ĥ�ؾ� ������ ���̰� �ȴ�.
 * 
 * ���� Layer�� �˾Ƴ��¹��
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
			// ���� ������ �Ǿ����� ���������� ĥ�ϰ�
			// ������ ���� �ʾ����� �Ķ������� ĥ�ϰ��� �Ѵ�.
			if(tb.isSelected()){
				// 1. ���� Layer�� �˾Ƴ���
				Container c = getContentPane();
				// 2. ���� Layer�� ������ ĥ�Ѵ�.
				c.setBackground(Color.red);
			}
			else{
				// 1. ���� Layer�� �˾Ƴ���
				Container c = getContentPane();
				// 2. ���� Layer�� ������ ĥ�Ѵ�.
				c.setBackground(Color.CYAN);
			}
		}
	}

}