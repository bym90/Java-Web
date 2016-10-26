package LJY.LJY_BOOK.자바의정석.chapter9;
/**
 * Card인스턴스의 toString()을 호출하면 인스턴스가 갖고 있는 인스턴스 변수 kind와 number의 값을
 * 문자열로 변환하여 반환하도록 toString()을 오버라이딩 했다.
 *
 * Object 클래스에 정의된 toString()의 접근 제어자가 public이므로 Card클래스의 toString()도
 * public으로 지정을 꼭 해줘야만 한다.
 *
 *
 * @author nostalgia10
 *
 */
public class CardToString2_455 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",10);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}


class Card{
	String kind;
	int number;

	Card(){
		this("SPADE",1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString(){	//toString() 오버라이딩
		return "kind : " +kind + ", nmumber : "+number;
	}
}