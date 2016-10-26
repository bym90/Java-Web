package P_0608;
/*
 * ����
 * ���ʰ� �Ʒ��� �ؽ�Ʈ �ʵ带 ���� ��
 * �Ʒ����� ��ȣ �Է� ���ڷ� �����
 * �Ʒ��ʿ� ������ �Է��ϸ� �Է��ϴ� ���� �� ������ ���ʿ� ǥ�õǵ��� �϶�.
 */
import java.awt.*;
import java.awt.event.*;
public class TextField_02 extends Frame {
	TextField upF, downF;
	public TextField_02() {
		upF = new TextField();
		downF = new TextField();
		downF.setEchoChar('@');
		
		downF.addTextListener(new MyEvent());
		
		this.add("North", upF);
		this.add("South", downF);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextField_02();

	}
	
	class MyEvent implements TextListener{
		public void textValueChanged(TextEvent e){
			//1. �Ʒ��ʿ� ������� �Է��� ������ �˾Ƴ���
			//2. �� ������ ���ʿ� ����.
			String text = downF.getText();
			upF.setText(text);
			
		}
	}
	
}

//���� 2. ���ʿ� ��ϻ��ڸ� ����� �Ʒ��ʿ� �ؽ�Ʈ �ʵ带 ���� ��
//�ؽ�Ʈ �ʵ忡�� ����Ű�� ġ�� �� ������ �״�� ���ʿ� ��ϻ��ڿ� �߰��ǵ��� ����.
//�׸��� �ڽ��� �Էµ� ������ �ڵ����� ���������� �Ѵ�.
