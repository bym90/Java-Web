package ACH.java.semi;
import java.awt.*;
import javax.swing.*;

public class ProperConditions {
	Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
	Color color = new Color(224,224,224);
	
	JLabel L1 = new JLabel("�µ�");
	JLabel L2 = new JLabel("10~30��");
	JLabel L3 = new JLabel("��ź����");
	JLabel L4 = new JLabel("7%");
	JLabel L5 = new JLabel("����");
	JLabel L6 = new JLabel("30~70%");
	
	JPanel ConditionPanel = new JPanel(new FlowLayout());
	JPanel leftP = new JPanel(new GridLayout(3,1));
	JPanel rightP = new JPanel(new GridLayout(3,1));
	
	public ProperConditions() {
		//��Ʈ ����
		L1.setFont(font);
		L2.setFont(font);
		L3.setFont(font);
		L4.setFont(font);
		L5.setFont(font);
		L6.setFont(font);
		
		//�гο� �÷� ����
		leftP.setBackground(color);
		rightP.setBackground(color);
		ConditionPanel.setBackground(color);
		
		//�гο� �� ��ġ
		leftP.add(L1);
		leftP.add(L2);
		leftP.add(L3);
		rightP.add(L4);
		rightP.add(L5);
		rightP.add(L6);

		//���� �гο� ���� ���� �� left, right �г� �߰�.
		ConditionPanel.setBorder(new BorderSet().border2);
		ConditionPanel.add(leftP);
		ConditionPanel.add(rightP);
		
		//��ǥ, ũ�� ����
		ConditionPanel.setBounds(183, 10, 163, 120);
		
	}
}