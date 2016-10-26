package ACH.java_array;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
/*
 * ��ư�� ����� ����
 * 
 * Component�� Border �������.
 * 
 * component���� jComponent Ŭ������ ��ӹ޾Ƽ�, �� ��� �޼ҵ��� 
 * .setBorder�� Border�� ���ϸ� �ȴ�. 
 */

public class Empty01 {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Empty Borders"); //������ ����.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� Ŭ���� ����.
    Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 0, 0); //Top, Left, Bottom, Right ����
    JButton emptyButton = new JButton("With Empty");
    emptyButton.setBorder(emptyBorder); //������ ������ emptyborder ����
    JButton nonemptyButton = new JButton("Without Empty"); //������ �������� �ʾƼ� default ������ ����
    Container contentPane = frame.getContentPane(); //��ư �� ���� �� contentpane ����, ��ư �� ���� ����.
    contentPane.add(emptyButton, BorderLayout.NORTH);
    contentPane.add(nonemptyButton, BorderLayout.SOUTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}