package P_0607;

/*
 * ���߸� �ϳ� ����� ���߸� ���������� �������� ������ �����ϰ� �����϶�
 */
import java.awt.*;
import java.awt.event.*;

public class Event_02 {
	Frame frame;

	// �� ������ �ٸ��������� ����� �ʿ䰡 ������ �������� �����
	// ����� �ʿ䰡 ������ �������� ����� �ȴ�.
	public Event_02() {
		frame = new Frame();

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		Button b = new Button("Click");
		b.addActionListener(new ButtonEvent02());
		
		frame.add(b);
	}

	public static void main(String[] args) {
		new Event_02();
	}

	class ButtonEvent02 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// ��
			// awt���� ������ �����ϴ� ���
			// colorŬ������ �̿��Ѵ�.
			// ��� 1. �̹� ������ ������ �̿��Ѵ�.
			// ��> Color.green
			// 2. �ʿ��� ������ ���� �����Ѵ�.
			// ��> new Color();
			int red = (int) (Math.random() * (255 - 0 + 1) + 0);
			int blue = (int) (Math.random() * (255 - 0 + 1) + 0);
			int green = (int) (Math.random() * (255 - 0 + 1) + 0);

			Color color = new Color(red, green, blue);
			// ������ ĥ�ϴ� �Լ��� setBackground(����);
			frame.setBackground(color);

		}
	}
}