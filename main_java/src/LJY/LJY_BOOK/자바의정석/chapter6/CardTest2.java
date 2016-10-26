package LJY.LJY_BOOK.자바의정석.chapter6;

public class CardTest2 {
	public static void main(String[] args) {
		Card1 c = new Card1();


		c.setKind("스페이드");
		System.out.println(c.kind);
	}
}

class Card1{
	String kind;
	int number;
	static int w = 100;



	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static int getW() {
		return w;
	}
	public static void setW(int w) {
		Card1.w = w;
	}
	@Override
	public String toString() {
		return "Card1 [kind=" + kind + ", number=" + number + ", getKind()=" + getKind() + ", getNumber()="
				+ getNumber() + "]";
	}

}