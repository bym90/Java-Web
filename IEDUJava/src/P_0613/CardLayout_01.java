package P_0613;

/*
 * ����
 * 3���� ī�带 ����� �̰��� CardLayout�� ���� �� �ʿ��ϸ� ī�带 ��ü
 * �ϵ��� �Ѵ�.
 */
import java.awt.*;
import java.awt.event.*;
import GUI.CFrame;

public class CardLayout_01 extends CFrame{
	CardLayout card;
	OneCard one;
	TwoCard two;
	ThreeCard three;
	public CardLayout_01() {
		card = new CardLayout();
		this.setLayout(card);
		//�ʿ��� ���� ����
		one = new OneCard(this);
		two = new TwoCard(this);
		three = new ThreeCard(this);
		
		this.add(one, "ONE");
		this.add(two, "TWO");
		this.add(three, "THREE");
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CardLayout_01();
	}

}

// ������ ī��� �ϳ��� ���� �����ؾ� �Ѵ�.
// ��, ȭ�鿡�� ������ ī�常 ���̹Ƿ� ������ ī��� �ʿ��� ����
// �����Ǿ� �־�� �Ѵ�.
// ���� ���鶩�� �������� ������ �ʿ��ϹǷ�
// �������� ī�带 �ѹ��� ����°��� �ſ� ������ ���̴�.
// ������ ī�带 �ٸ� Ŭ������ ���� ����ϰ��� �Ѵ�.
class OneCard extends Panel {
	// �̰��� �ϳ��� ī���� ��������.
	CardLayout_01 main;
	OneCard() {}
	OneCard(CardLayout_01 c1) {
		main = c1;
		// �ʿ��� ������ ������.
		Button b = new Button("1�� ī��");
		b.addActionListener(new Event1());
		this.add(b);
	}
	class Event1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// ���߸� ������ 3�� ī�尡 ���̰� �ʹ�.
			main.card.show(main, "THREE");
		}
	}
}

class TwoCard extends Panel {
	CardLayout_01 main;
	TwoCard(){}
	TwoCard(CardLayout_01 c2) {
		main = c2;
		Choice c = new Choice();
		c.add("A");
		c.add("B");
		c.add("C");
		Button b = new Button("2�� ī��");
		b.addActionListener(new Event2());
		this.add(c);
		this.add(b);
	}
	class Event2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// ���߸� ������ 1�� ī�尡 ���̰��ʹ�.
			main.card.previous(main);
		}
	}
}

class ThreeCard extends Panel {
	CardLayout_01 main;
	ThreeCard(){}
	ThreeCard(CardLayout_01 c3) {
		main = c3;
		Checkbox cb1 = new Checkbox("A");
		Checkbox cb2 = new Checkbox("B");
		Checkbox cb3 = new Checkbox("C");
		Button b = new Button("3�� ī��");
		b.addActionListener(new Event3());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(b);
		// �ǹ������� �� ���� ���� ������ ��쿡��
		// ���߿� ��ġ�� ����� ���� ����Ѵ�	
	}
	class Event3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// ���߸� ������ 2�� ī�尡 ���̰��ʹ�.
			main.card.previous(main);
		}
	}
}