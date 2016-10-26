package ACH.java_array;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

/*
 * 패널에 적용한 보더 예시들. 
 */

class Test02 extends JFrame
{
	int w = 280;
	int h = 40;
	int gap = 15;

	public Test02(){
		
		setBounds(100,200,630,500); //화면 상의 위치와 크기 동시 지정 함수. public void setBounds(int x, int y, int width, int height)
		setLayout(null); //Layout 없음. 사용자가 콤포넌트의 위치 일일이 지정한다.
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