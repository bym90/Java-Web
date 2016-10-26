package P_0608;

/*
 * ���߸� 2�� ������ ù��° ���߸� ������ 5�� �������� �����
 * 					 �ι�° ���߸� ������ ���α׷��� ��������.
 */
import java.awt.*;
import java.awt.event.*;

public class Event_02 extends Frame {
	Button b1, b2;

	public Event_02() {
		
		ButtonEvent02 evt = new ButtonEvent02();
		
		b1 = new Button("������");
		b2 = new Button("�����ϱ�");
		
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

	// �̺�Ʈ Ŭ���� ����
	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//�� �Լ��� JVM�� �̺�Ʈ�� �߻��ϸ� �ڵ� ȣ���ϴ� �Լ��̴�.
			//JVM�� �� �Լ��� ȣ���ϸ鼭 �̺�Ʈ�� ���� ������ �˷��ش�
			//��> ��� ��ġ���� �̺�Ʈ�� �߻��ߴ���?
			//���콺�� ��� ���߰� ����������?
			//�̺�Ʈ�� �Ͼ ������ ��������?
			//�̺�Ʈ ������ �޴� �κ� ActionEvent e �̴�.

			//�� �����߿��� getSource()�� �̿��ϸ� �̺�Ʈ�� �Ͼ ������
			//�˾Ƴ� �� �̴�.
			
			//�̺�Ʈ�� �Ͼ ���߸� �˾Ƴ���
			Button	target = (Button) e.getSource();
			//�� ���߸� �����Ͽ� ���ϴ� ó���� �ϸ�ȴ�.
			if(target == b1) {
				for(int i = 1; i <= 9; i++) {
					int	dap = 5 * i;
					System.out.println("5 * " + i + " = " + dap);
				}
			}
			else if(target == b2) {
				//���α׷� ���� ���
				System.exit(0);
			}
		}
	}
	
}

