package P_0616;

/*
 * 	문제
 * 		단추를 하나 만들고 단추를 클릭하면 파일선택 대화상자가 나오게 하고
 * 		파일을 선택하면 그 파일의 내용을 읽어서 텍스트 에리어에 출력하자.
 * 
 * 		메모장의 불러오기 기능을 만들어보자.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import GUI.*;
public class Test_01 {
	JTextArea area;
	CJFrame frame;
	public Test_01() {
		frame = new CJFrame();
		area = new JTextArea();
		Font font = new Font("굴림체", Font.PLAIN, 15);
		area.setFont(font);
		area.setBackground(Color.MAGENTA);
		JScrollPane sp = new JScrollPane(area);
		
		JButton btn = new JButton("불러오기");
		btn.addActionListener(new ButtonEvent());
		
		frame.add("Center", sp);
		frame.add("South", btn);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	public String fileChooser(){
		// 선택한 파일의 이름의 알려주기 위해서 반환값을 String으로 지정
		JFileChooser fc = new JFileChooser();
		int kind = fc.showOpenDialog(frame);
		if(kind == JFileChooser.APPROVE_OPTION){
			File file = fc.getSelectedFile();
			// 이 안에서 필요한 내용을 꺼내서 사용해야 한다.
			String path = file.getPath();
			return path;
		}
		else{
			return null;
		}
	}
	
	public void getFileText(String name){
		// 오늘 수업의 핵심
		FileInputStream fin = null;
		try {
			// 1. 파일에 연결된 스트림을 생성한다.
			fin = new FileInputStream(name);
			while(true){
			byte[] buff = new byte[256];
			int len = fin.read(buff);
			if(len == -1){
				break;
			}
			// 읽은 내용을 출력하기 위해서 String으로 변환한다.
			String text = new String(buff, 0, len);
			// 2. 텍스트에 출력한다.
			area.append(text);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			}
			catch(Exception e) {}
		}
		
	}
	
	public static void main(String[] args) {
		new Test_01();

	}
	
	class ButtonEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 1. 파일을 선택할 수 있는 대화상자를 출력하자.
			// 2. 선택한 파일의 이름을 알아낸다.
			String filename = fileChooser();
			// 3. 그 파일의 내용을 불러온다.
			if(filename != null){
				getFileText(filename);
			}
		}
	}

}
