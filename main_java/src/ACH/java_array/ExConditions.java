package ACH.java_array;
import java.awt.*;
import javax.swing.*;

public class ExConditions {
	Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
	Color color = new Color(224,224,224);
	
	JLabel L1 = new JLabel("개체수");
	JLabel L2 = new JLabel("300두");
	JLabel L3 = new JLabel("외부온도");
	JLabel L4 = new JLabel("30도");
	JLabel L5 = new JLabel("외부습도");
	JLabel L6 = new JLabel("70%");
	JLabel L7 = new JLabel("날씨");
	JLabel L8 = new JLabel("흐림");
	
	JPanel ExConPanel = new JPanel(new FlowLayout());
	JPanel leftP = new JPanel(new GridLayout(4,1));
	JPanel rightP = new JPanel(new GridLayout(4,1));
	public ExConditions() {
		//라벨에 폰트 설정.
		L1.setFont(font);
		L2.setFont(font);
		L3.setFont(font);
		L4.setFont(font);
		L5.setFont(font);
		L6.setFont(font);
		L7.setFont(font);
		L8.setFont(font);
		
		leftP.setBackground(color);
		rightP.setBackground(color);
		ExConPanel.setBackground(color);
		
		
		//패널에 라벨 배치
		leftP.add(L1);
		leftP.add(L3);
		leftP.add(L5);
		leftP.add(L7);
		rightP.add(L2);
		rightP.add(L4);
		rightP.add(L6);
		rightP.add(L8);

		//패널에 보더 설정 및 left, right 패널 추가.
		ExConPanel.setBorder(new BorderSet().border3);
		ExConPanel.add(leftP);
		ExConPanel.add(rightP);
		
		ExConPanel.setBounds(356, 10, 163, 120);
		
	}
}
