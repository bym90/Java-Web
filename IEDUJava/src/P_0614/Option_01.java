package P_0614;

/*
 * 단추하나 만들고 그 단추를 클릭하면 각종 Option 대화상자를 출력해보자
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import GUI.*;

public class Option_01 {
	CJFrame frame;

	public Option_01() {
		frame = new CJFrame("옵션 테스트");
		JButton btn = new JButton("Click");
		btn.addActionListener(new ButtonEvent01());
		frame.add("South", btn);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	// Confirm 대화상자를 출력할 함수를 따로 제작하자.
	public void showConfirm() {
		// JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?");
		int	kind = JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?");
		//	kind에는 눌려진 단추의 종류가 기억된다.
		//	그 종류는 변수로 준비되어 있다.
		if(kind == JOptionPane.YES_OPTION) {
			//	이 질문이 YES(예) 단추를 눌렸는지를 질문하는 것이다.
			System.out.println("예");
		}
		else if(kind == JOptionPane.NO_OPTION) {
			//	이 질문이 NO(아니오) 단추를 눌렸는지를 질문하는 것이다.
			System.out.println("아니오");
		}
		else if(kind == JOptionPane.CANCEL_OPTION) {
			//	이 질문이 Cancel(취소) 단추를 눌렸는지를 질문하는 것이다.
			System.out.println("취소");
		}
		else {
			//	기타 단추를 눌렸는지 질문한다.
			System.out.println("기타");		
		}
		// JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?", "저장확인", JOptionPane.YES_NO_OPTION);
		// JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?", "저장확인", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		// JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?", "저장확인", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon("./src/P_0613/icon.gif"));
	}

	public void showMessage() {
		// JOptionPane.showMessageDialog(frame, "저장되었습니다.");
		// JOptionPane.showMessageDialog(frame, "종료되었습니다.", "종료확인", JOptionPane.ERROR_MESSAGE);
		// JOptionPane.showMessageDialog(frame, "에러발생", "에러", 0, new ImageIcon("./src/P_0613/icon.gif"));
		// 이 대화상자는 목적이 경고에 있기 때문에 사용자의 선택 권한이 없다.
		// 반환값도 존재하지 않는다.
	}
	
	public void showInput(){
		// 이 대화상자를 출력하는 목적은 사용자가 뭔가를 입력하도록 하기 위함이다.
		// 그러므로 사용자가 입력한 내용이 무엇인지 알아야 할 것이다.
		// 결론 이 함수의 반환값은 String이다. 입력한 내용을 반환받는 것이다.
		
		/*String who = JOptionPane.showInputDialog(frame, "너는 누구니?");
		// 그런데 상요자가 입력을 하지 않을 수도 있고 사용자가 입력을 했었어도
		// 취소시킬 수 있다. 그래서 반환 값이 올바로 존재하는지를 반드시 물어보고 사용해야 한다.
		if(who == null || who.length() == 0){
			// 사용자가 입력하지 않았거나 취소시킨 것이다.
			System.out.println("입력되지 않았어요");
		}
		else{
			//온전하게 입력했을때 
			System.out.println("당신은 " + who);
		}*/
		// JOptionPane.showInputDialog(frame, "너는 누구니?", "메롱");
		// JOptionPane.showInputDialog(frame, "너는 누구니?", "안녕", JOptionPane.PLAIN_MESSAGE);
		/*String[] items = {"A", "B", "C", "D", "E"};
		String item = "D";
		JOptionPane.showInputDialog(frame, "너는 누구니?", "안녕", JOptionPane.QUESTION_MESSAGE, null, items, item);*/
	}
	
	public void showOption(){
		String[] caps = {"A", "B", "C"};
		String cap = "B";
		JOptionPane.showOptionDialog(frame, "선택하세요", "선택", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, caps, cap);
		// 캡션은 화면에 나타나는 모양만 바뀐것이고 
		//실제 단추는 YES, NO, CANCEL 단추로 판단해야 한다.
	}

	public static void main(String[] args) {
		new Option_01();

	}

	class ButtonEvent01 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// 1. Confirm 대화상자를 출력해보자.
			// 내용이 길어서 출력함수를 따로 만들어서 처리한다.
//			showConfirm();
			// 2. Message 대화상자를 출력해보자.
//			showMessage();
			// 3. Input 대화상자를 출력해보자
//			showInput();
			showOption();
		}
	}
}