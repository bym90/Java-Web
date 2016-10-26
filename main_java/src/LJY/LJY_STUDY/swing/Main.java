package LJY.LJY_STUDY.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements ItemListener {
  public Main() {
    // Add check boxes to the content pane.
    Icon normal = new MyIcon(Color.red);
    Icon rollover = new MyIcon(Color.YELLOW);
    Icon selected = new MyIcon(Color.BLUE);

    JCheckBox cb = new JCheckBox();
    cb.setRolloverIcon(rollover);
    cb.setSelectedIcon(selected);
    cb.addItemListener(this);
    add(cb);

  }

  public void itemStateChanged(ItemEvent ie) {
    JCheckBox cb = (JCheckBox) ie.getItem();
    int state = ie.getStateChange();
    if (state == ItemEvent.SELECTED)
      System.out.println(cb.getText() + " selected");
    else
      System.out.println(cb.getText() + " cleared");
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new Main());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }

}

class MyIcon implements Icon {
  Color cl;

  public MyIcon(Color c) {
    cl = c;
  }

  public int getIconWidth() {
    return 32;
  }

  public int getIconHeight() {
    return 32;
  }

  public void paintIcon(Component c, Graphics g, int x, int y) {
    g.setColor(cl);
    g.drawString("java2s.com", 0, 20);
  }
}