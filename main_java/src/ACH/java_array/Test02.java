package ACH.java_array;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

/*
 * �гο� ������ ���� ���õ�. 
 */

class Test02 extends JFrame
{
	int w = 280;
	int h = 40;
	int gap = 15;

	public Test02(){
		
		setBounds(100,200,630,500); //ȭ�� ���� ��ġ�� ũ�� ���� ���� �Լ�. public void setBounds(int x, int y, int width, int height)
		setLayout(null); //Layout ����. ����ڰ� ������Ʈ�� ��ġ ������ �����Ѵ�.
		setTitle("Border Example ( SEXY.PE.KR )");

		JPanel p = new JPanel();
		p.setBounds(gap,gap,w,h);
		p.setBorder(new BevelBorder(BevelBorder.RAISED));
		p.setLayout(new BorderLayout());
		p.add(new JLabel("BevelBorder(BevelBorder.RAISED)",JLabel.CENTER));
		add(p);
		
		
		setVisible(true);
	}

	public static void main(String[] args){
		new Test02();
	}
}