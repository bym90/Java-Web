package ACH.java_array;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Operations {
	Font font = new Font(Font.SANS_SERIF,Font.BOLD,18);
	Color color = new Color(224,224,224);
	
	JLabel L1 = new JLabel("LAMP");
	JLabel L2 = new JLabel("FAN");
	JLabel L3 = new JLabel("사료공급");
	
	JLabel L4 = new JLabel("OFF");
	JLabel L5 = new JLabel("OFF");
	JLabel L6 = new JLabel("OFF");
	
	ImageIcon iconOn = new ImageIcon("src/ProjectRelated/switchOn11.jpg");
	ImageIcon iconOff = new ImageIcon("src/ProjectRelated/switchOff11.jpg");
	
	JLabel OnS1 = new JLabel(iconOn);
	JLabel OnS2 = new JLabel(iconOn);
	JLabel OnS3 = new JLabel(iconOn);
	
	JLabel OffS1 = new JLabel(iconOff);
	JLabel OffS2 = new JLabel(iconOff);
	JLabel OffS3 = new JLabel(iconOff);
	
	JPanel OpPanel = new JPanel(new GridLayout(1,3));
	JPanel leftP = new JPanel(new GridLayout(3,1));
	JPanel cenP = new JPanel(new GridLayout(3,1));
	JPanel rightP = new JPanel(new GridLayout(3,1));
	
	boolean S1 = false;
	boolean S2 = false;
	boolean S3 = false;
	
	boolean operMode = false;
	
	//Nested Class
	public class OperMode {
		Font font = new Font(Font.SANS_SERIF,Font.PLAIN,14);
		Color color = new Color(224,224,224);
		
		ImageIcon icon1 = new ImageIcon("src/ProjectRelated/AutoMode.jpg");
		ImageIcon icon2 = new ImageIcon("src/ProjectRelated/ManualMode.jpg");
		
		JLabel switchL1 = new JLabel();
		JLabel switchText = new JLabel("AUTO");
		
		
		JPanel OperModeP = new JPanel();
		JPanel letterP = new JPanel();
		JPanel pictureP = new JPanel();
		
		boolean onOff = true;
		
		public OperMode() {
			switchL1.setIcon(icon1);
			
			switchText.setFont(font);
			
			OperModeP.setLayout(new GridLayout(1,2));
			pictureP.setLayout(new BorderLayout());
			letterP.setLayout(new BorderLayout());
			
			OperModeP.setBackground(color);
			letterP.setBackground(color);
			pictureP.setBackground(color);
			
			letterP.add(switchText);
			pictureP.add(switchL1);
			
			OperModeP.add(pictureP);
			OperModeP.add(letterP);
			
			OperModeP.setBounds(270, 140, 180, 80);
			OperModeP.setBorder(new BorderSet().border6);
			
			ModeClick1 evt1 = new ModeClick1();
			pictureP.addMouseListener(evt1);
			
		}
		
		class ModeClick1 extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				if(onOff==true){
					onOff=false;
					switchL1.setIcon(icon2);
					switchText.setText("MANUAL");
					operMode = true;
				}else{
					onOff=true;
					switchL1.setIcon(icon1);
					switchText.setText("AUTO");
					operMode = false;
				}
			}
		}
	}
	public Operations() {
		//폰트 설정
		L1.setFont(font);
		L2.setFont(font);
		L3.setFont(font);
		L4.setFont(font);
		L5.setFont(font);
		L6.setFont(font);
		
		//패널에 라벨 배치
		leftP.setBackground(color);
		cenP.setBackground(color);
		rightP.setBackground(color);
		
		leftP.add(L1);
		leftP.add(L2);
		leftP.add(L3);
		cenP.add(OffS1);
		cenP.add(OffS2);
		cenP.add(OffS3);
		
		OffS1.addMouseListener(new ModeClick1());
		OffS2.addMouseListener(new ModeClick1());
		OffS3.addMouseListener(new ModeClick1());
		
		rightP.add(L4);
		rightP.add(L5);
		rightP.add(L6);

		//메일 패널에 보더 설정 및 left, right 패널 추가.
		OpPanel.setBackground(color);
		OpPanel.setBorder(new BorderSet().border5);
		OpPanel.add(leftP);
		OpPanel.add(cenP);
		OpPanel.add(rightP);
		
		//좌표, 크기 설정
		OpPanel.setBounds(270, 245, 250, 145);
		System.out.println(iconOn.getIconHeight());
	}
	class ModeClick1 extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(operMode == true){
				if(e.getSource() == OffS1){
					if(S1 == false){
						OffS1.setIcon(iconOn);
						S1 = true;
						L4.setText("ON");
					}else{
						OffS1.setIcon(iconOff);
						S1 = false;
						L4.setText("OFF");
					}
				}else if(e.getSource() == OffS2){
					if(S2 == false){
						OffS2.setIcon(iconOn);
						S2 = true;
						L5.setText("ON");
					}else{
						OffS2.setIcon(iconOff);
						S2 = false;
						L5.setText("OFF");
					}
				}else if(e.getSource() == OffS3){
					if(S3 == false){
						OffS3.setIcon(iconOn);
						S3 = true;
						L6.setText("ON");
					}else{
						OffS3.setIcon(iconOff);
						S3 = false;
						L6.setText("OFF");
					}
			}else{
				return;
				 }
			}
		}
	}
}

