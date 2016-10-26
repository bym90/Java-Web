package P_0613;

/*
 * 체크상자 2개를 만들고 그 위에 테두리를 둘러보자.
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import GUI.*;

public class Border_01 extends CJFrame {

	public Border_01() {
		this.setLayout(new FlowLayout());
		// Swing은 오직 체크박스만 만들 수 있다.
		// 라디오단추는 만들지 못한다.
		JCheckBox b1 = new JCheckBox("A");
		JCheckBox b2 = new JCheckBox("B");
		JCheckBox b3 = new JCheckBox("C");

		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);

		// BevelBorder border = new BevelBorder(BevelBorder.RAISED, Color.red, Color.green);
		// SoftBevelBorder border = new SoftBevelBorder(SoftBevelBorder.RAISED);
		// EtchedBorder border = new EtchedBorder(EtchedBorder.RAISED);
		// LineBorder border = new LineBorder(Color.BLACK, 3, true);
		/*
		 * ImageIcon icon = new ImageIcon("src/P_0613/wavy.gif"); 
		 * Insets set = new Insets(5,5,10,10); 
		 * MatteBorder border = new MatteBorder(set, icon);
		 */
		
		EtchedBorder	temp = new EtchedBorder(EtchedBorder.RAISED);
		Font	font = new Font("궁서체", Font.PLAIN, 20);
		TitledBorder border = new TitledBorder(temp, "제목", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, font, Color.blue);
	
		/*
		 * 나는 안쪽은 그림으로 배경을 칠하고 MatteBorder 
		 * 바깥에는 전체적으로 튀어나온 모습으로 테두리를 만들고싶다. BevelBorder
		 */
		/*
		 * ImageIcon icon = new ImageIcon("src/P0613/icon.gif");
		 * Insets set = new Insets(30, 30, 30, 30);
		 * MatteBorder border1 = new MatteBorder(set, icon);
		 * 
		 * BevelBorder border2 = new BevelBorder(BevelBorder.RAISED);
		 * 
		 * CompoundBorder border = new CompoundBorder(border2, border1);
		 */
//		BevelBorder border1 = new BevelBorder(BevelBorder.RAISED);
//		EmptyBorder border2 = new EmptyBorder(30,30,30,30);
//		CompoundBorder border = new CompoundBorder(border1, border2);
		// StrokeBorder border = new StrokeBorder(); 조사
		p.setBorder(border);

		this.add(p);
		this.setSize(400, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Border_01();

	}

}
