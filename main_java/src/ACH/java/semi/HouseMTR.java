package ACH.java.semi;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class HouseMTR{
	Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
	Color color = new Color(224,224,224);
	
	JLabel temperLabel = new JLabel("�µ�");
	JLabel gasLabel = new JLabel("��ź����");
	JLabel humidLabel = new JLabel("����");
	
	JLabel temperValue = new JLabel("22��");
	JLabel gasValue = new JLabel("5%");
	JLabel humidValue = new JLabel("40%");
	
	JPanel MTRPanel = new JPanel(new FlowLayout());
	JPanel leftP = new JPanel(new GridLayout(3,1));
	JPanel rightP = new JPanel(new GridLayout(3,1));
	
	public HouseMTR() {
		temperLabel.setFont(font);
		gasLabel.setFont(font);
		humidLabel.setFont(font);
		temperValue.setFont(font);
		gasValue.setFont(font);
		humidValue.setFont(font);
		
		//�гο� �÷� ����. 
		leftP.setBackground(color);
		rightP.setBackground(color);
		MTRPanel.setBackground(color);
		
		leftP.add(temperLabel);
		leftP.add(gasLabel);
		leftP.add(humidLabel);

		rightP.add(temperValue);
		rightP.add(gasValue);
		rightP.add(humidValue);
		
		MTRPanel.setBorder(new BorderSet().border1);
		MTRPanel.add(leftP);
		MTRPanel.add(rightP);
		
		MTRPanel.setBounds(10, 10, 163, 120);
	}
}