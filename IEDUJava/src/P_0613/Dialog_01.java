package P_0613;

/*
 * Frame�� ���߸� ����� ���߸� ������ �Ǵٸ� ��ȭ���ڰ� �������� ����.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.CFrame;

public class Dialog_01 {
	CFrame frame;

	public Dialog_01() {
		frame = new CFrame();
		Button b = new Button("Click");
		b.addActionListener(new ButtonEvent01());
		frame.add("South", b);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Dialog_01();

	}
	class ButtonEvent01 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			MyDialog dlg = new MyDialog(Dialog_01.this);
			dlg.setSize(400, 400);
			dlg.setVisible(true);
		}
	}

}
// ��ȭ���ھȿ��� ���� �������� ���� �ϹǷ�
// ��ȭ���ڵ� ���� ���� ����ϴ°��� ����
// Dialog�� ȥ�ڼ��� ������ ���ϰ� �ݵ�� �ٸ� �����̳ʰ� �־�� �Ѵ�.
class MyDialog extends Dialog{
	//Dialog_01 main;
	MyDialog(Dialog_01 m){
		super(m.frame, true);//�ٸ� �����̳ʴ� ���⼭�� Frame�� �ɰ��̴�.
		//main = m;
		//�̾ȿ� �ʿ��� ������ ����� �� ���̴�.
		//�ʿ��ϸ� x ���߸� ������ �������� �ؾ��� ���̴�.
		//���� Ŭ������ �̿��ؼ� ó������.
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				//�̹����� ���α׷��� �����ϴ� ���� �ƴϰ� ��ȭ���ڸ� �ݾ��־�� �Ѵ�.
				setVisible(false);
				//�ݵ�� �ʿ��Ѱ��� �ƴϰ� �ʿ��ϸ� ����ϴ°�
				//�޸𸮿����� �����ϱ⸦ ���ϸ�
				dispose();
				//�ٸ� �̸����� ������ �� ��ȭ���ڴ� �ٽ� ����� �� ����.
				//�ٽ� ����ϰ� �ʹٸ� new���� �ٽý��Ѿ� �Ѵ�.
				//dispose()�� ������� ������
				//setVisible(true)��� �ٽ� ȭ�鿡 ����� ���� �ִ�.
			}
		});
	}
}