package BYM_Study.HomeWork;

//���� 2. ���ʿ� ��ϻ��ڸ� ����� �Ʒ��ʿ� �ؽ�Ʈ �ʵ带 ���� ��
//�ؽ�Ʈ �ʵ忡�� ����Ű�� ġ�� �� ������ �״�� ���ʿ� ��ϻ��ڿ� �߰��ǵ��� ����.
//�׸��� �ڽ��� �Էµ� ������ �ڵ����� ���������� �Ѵ�.
import java.awt.*;
import java.awt.event.*;

public class TextField_03 {
	TextField TF;
	List L;

	public TextField_03() {
		Frame f = new Frame();

		TF = new TextField();
		L = new List(5);

		TF.addActionListener(new MyEvent());

		f.add(TF, "North");
		f.add(L, "South");

		f.setSize(400, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new TextField_03();

	}

	class MyEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String txt = TF.getText();
			TF.setText(" ");
			L.add(txt);
		}
	}

}