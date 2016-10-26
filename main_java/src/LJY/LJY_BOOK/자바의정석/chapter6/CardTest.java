package LJY.LJY_BOOK.자바의정석.chapter6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);

		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은"+c1.kind+","+c1.number+"이며 크기는 "+c1.height+","+c1.width+"입니다.");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며 크기는 "+c2.height+","+c2.width+"입니다.");

		System.out.println("============================================");

		c1.height = 300;	// 클래스이름.으로 객체를 가져오는 것이 정석이다.
		c1.width = 150;


		System.out.println("c1은"+c1.kind+","+c1.number+"이며 크기는 "+c1.height+","+c1.width+"입니다.");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며 크기는 "+c2.height+","+c2.width+"입니다.");

	}

}

class Card{
	String kind;	//인스턴스 변수
	int number;		//인스턴스 변수
	static int width = 100;	//클래스 변수
	static int height = 250;	//클래스 변수
}