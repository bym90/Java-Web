package BYM_Study.HomeWork;
import		java.awt.*;
import		java.awt.event.*;
import		javax.swing.*;
import		java.io.*;
import		GUI.*;
public class Assignment01 {
	JTextArea	area;
	CJFrame		frame;
	FileOutputStream fout = null;
	BufferedOutputStream bout = null;
	public Assignment01() {
		frame = new CJFrame();
		area = new JTextArea();
		Font	font = new Font("굴림체", Font.PLAIN, 15);
		area.setFont(font);
		area.setBackground(new Color(224,224,224));
		JScrollPane	sp = new JScrollPane(area);
		
		JButton	openB = new JButton("불러오기");
		JButton saveB = new JButton("저장하기");
		saveB.addActionListener(new ButtonEvent());
		
		JPanel southP = new JPanel(new GridLayout(1,2));
		
		southP.add(openB);
		southP.add(saveB);
		
		frame.add("Center", sp);
		frame.add("South", southP);

		frame.setSize(500, 500);
		frame.setVisible(true);
		
		try{
			fout = new FileOutputStream("D:\\Test06.txt");
			bout = new BufferedOutputStream(fout);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Assignment01();
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				String str = area.getText();
				bout.write(str.getBytes());
			}catch(Exception e1){
				System.out.println(e1);
			}
			finally {
				try {
					bout.close();
					fout.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
