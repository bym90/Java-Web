package ACH.java_array;
import java.awt.*;
import javax.swing.*;

public class ProperConditions {
	Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
	Color color = new Color(224,224,224);
	
	JLabel L1 = new JLabel("온도");
	JLabel L2 = new JLabel("10~30도");
	JLabel L3 = new JLabel("메탄가스");
	JLabel L4 = new JLabel("7%");
	JLabel L5 = new JLabel("습도");
	JLabel L6 = new JLabel("30~70%");
	
	JPanel ConditionPanel = new JPanel(new FlowLayout());
	JPanel leftP = new JPanel(new GridLayout(3,1));
	JPanel rightP = new JPanel(new GridLayout(3,1));
	
	public ProperConditions() {
		//폰트 설정
		L1.setFont(font);
		L2.setFont(font);
		L3.setFont(font);
		L4.setFont(font);
		L5.setFont(font);
		L6.setFont(font);
		
		//패널에 컬러 설정
		leftP.setBackground(color);
		rightP.setBackground(color);
		ConditionPanel.setBackground(color);
		
		//패널에 라벨 배치
		leftP.add(L1);
		leftP.add(L2);
		leftP.add(L3);
		rightP.add(L4);
		rightP.add(L5);
		rightP.add(L6);

		//메일 패널에 보더 설정 및 left, right 패널 추가.
		ConditionPanel.setBorder(new BorderSet().border2);
		ConditionPanel.add(leftP);
		ConditionPanel.add(rightP);
		
		//좌표, 크기 설정
		ConditionPanel.setBounds(183, 10, 163, 120);
		
	}
}
