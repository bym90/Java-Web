package ACH.java.semi;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import GUI.*;

public class DailyFrame extends CJFrame{
	public DailyFrame() {
		super("���� ��� ���� ");
		this.setLayout(null);
		
		//����Ȳ�� ����
		add(new HouseMTR().MTRPanel);
		add(new ProperConditions().ConditionPanel);
		add(new ExConditions().ExConPanel);
		add(new CCTV().CCTVPanel);
		
		Operations opera = new Operations();
		
		add(opera.OpPanel);
		add(opera.new OperMode().OperModeP);
		add(new advertise().adP);
		add(new Logo().logoP);
		
		Container c = getContentPane();
		c.setBackground(new Color(224,224,224));
		setSize(700, 450);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DailyFrame();
	}
}