package P_0614;

/*
 * 	문제 단추를 2개 만들고
 * 		 앞의 단추를 누르면 열기용 대화상자
 * 		 뒤의 단추를 누르면 저장용 대화상자를 출력하고
 * 
 * 	선택한 파일의 이름을 출력하도록 한다.
 */
import java.awt.event.*;
import javax.swing.*;
import GUI.*;
import java.io.*;
public class JFile_01 extends CJFrame {
	JButton openB, saveB;
	JTextField field;
	public JFile_01() {
		openB = new JButton("열기");
		saveB = new JButton("저장");
		
		ButtonEvent evt = new ButtonEvent();
		openB.addActionListener(evt);
		saveB.addActionListener(evt);
		
		JPanel p = new JPanel();
		p.add(openB);
		p.add(saveB);

		field = new JTextField();
		this.add("North", p);
		this.add("South", field);

		this.setSize(400, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new JFile_01();
	}

	class ButtonEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			//어느 단추에서 이벤트가 발생할지 구분
			JButton target = (JButton) e.getSource();
			if(target == saveB){
				// 1. JFileChooser를 생성한다.
				JFileChooser fc = new JFileChooser("C:\\Users\\Administrator\\Desktop");
				// 2. 화면에 출력한다.
				int kind = fc.showSaveDialog(JFile_01.this);
				if (kind == JFileChooser.APPROVE_OPTION) {
					//확인단추를 제대로 눌렀는지를 질문하는것
					//getSelectedFile()가 선택한 파일을 알아내는 함수
					File file = fc.getSelectedFile();
					String filename = file.getName();
					field.setText("저장을 위해 선택한 파일은 " + filename);
				}
			}
			else if(target == openB){
				JFileChooser fc = new JFileChooser("C:\\Users\\Administrator\\Desktop");
				fc.showOpenDialog(JFile_01.this);
				int kind = fc.showSaveDialog(JFile_01.this);
				if (kind == JFileChooser.APPROVE_OPTION) {
					//확인단추를 제대로 눌렀는지를 질문하는것
					//getSelectedFile()가 선택한 파일을 알아내는 함수
					File file = fc.getSelectedFile();
					String filename = file.getName();
					field.setText("불러오기를 위해 선택한 파일은 " + filename);
				}
			}
		}
	}
	
}
