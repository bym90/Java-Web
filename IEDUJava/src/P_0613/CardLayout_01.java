package P_0613;

/*
 * 문제
 * 3자의 카드를 만들고 이것을 CardLayout에 넣은 후 필요하면 카드를 교체
 * 하도록 한다.
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
		//필요한 도구 생성
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

// 각각의 카드는 하나의 폼을 구성해야 한다.
// 즉, 화면에는 한장의 카드만 보이므로 한장의 카드는 필요한 폼이
// 구성되어 있어야 한다.
// 폼을 만들땐느 여러개의 도구가 필요하므로
// 여러개의 카드를 한번에 만드는것은 매우 복잡할 것이다.
// 각각의 카드를 다른 클래스로 만들어서 사용하고자 한다.
class OneCard extends Panel {
	// 이것을 하나의 카드라고 생각하자.
	CardLayout_01 main;
	OneCard() {}
	OneCard(CardLayout_01 c1) {
		main = c1;
		// 필요한 도구를 만들자.
		Button b = new Button("1번 카드");
		b.addActionListener(new Event1());
		this.add(b);
	}
	class Event1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 단추를 누르면 3번 카드가 보이고 싶다.
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
		Button b = new Button("2번 카드");
		b.addActionListener(new Event2());
		this.add(c);
		this.add(b);
	}
	class Event2 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 단추를 누르면 1번 카드가 보이고싶다.
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
		Button b = new Button("3번 카드");
		b.addActionListener(new Event3());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(b);
		// 실무에서도 각 폼에 조금 복잡한 경우에는
		// 나중에 합치는 방법을 많이 사용한다	
	}
	class Event3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			// 단추를 누르면 2번 카드가 보이고싶다.
			main.card.previous(main);
		}
	}
}
