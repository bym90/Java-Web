package BYM_Study.HomeWork;

/*
 * ���� ���ʰ� �Ʒ��ʿ� 2���� �޺����ڸ� �����.
 * ������ ���ʿ��� �Է��ϵ��� �Ѵ�.
 * 
 * ���� �޺����ڿ��� �ϳ��� �����ϸ� ������ �׸��� �Ʒ��ʿ� �߰��ǵ��� ����.
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
			//��� �޺����ڴ� 2���� ��������� ������
			//�Ѱ����� �̺�Ʈ�� ����ϸ� �ȴ�.
			//���� ��������� �̺�Ʈ�� �߻��ߴ��� ������ �ʿ䰡 ����.
			//1. ������ �׸��� �˾Ƴ���.
			//2. �Ʒ��ʿ� �� �׸��� ǥ���Ѵ�.
			
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

//���� 1. �ΰ��� �޺����ڸ� ����� �ΰ� ��� �׸��� �Է��� ����
//		  �ϳ��� �����ϸ� ������ �׸��� ���� �޺����ڷ� �̵��ϵ��� ����.
