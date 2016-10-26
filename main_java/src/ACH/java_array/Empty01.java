package ACH.java_array;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
/*
 * 버튼에 적용된 보더
 * 
 * Component의 Border 설정방법.
 * 
 * component들은 jComponent 클래스를 상속받아서, 그 멤버 메소드인 
 * .setBorder로 Border를 정하면 된다. 
 */

public class Empty01 {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Empty Borders"); //프레임 생성.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도 클로즈 설정.
    Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 0, 0); //Top, Left, Bottom, Right 간격
    JButton emptyButton = new JButton("With Empty");
    emptyButton.setBorder(emptyBorder); //생성된 보더에 emptyborder 삽입
    JButton nonemptyButton = new JButton("Without Empty"); //보더를 생성하지 않아서 default 보더가 설정
    Container contentPane = frame.getContentPane(); //버튼 두 개가 들어갈 contentpane 생성, 버튼 두 개를 삽입.
    contentPane.add(emptyButton, BorderLayout.NORTH);
    contentPane.add(nonemptyButton, BorderLayout.SOUTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
