package LJY.LJY_BOOK.자바의정석.chapter6;
/**
 * 객체 배열 생성 예제
 * @author nostalgia10
 *
 */
public class TvTest4_241 {

	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3];

		for(int i=0; i< tvArr.length; i++){
			tvArr[i] = new Tv4();

			tvArr[i].channel = i+10;
			System.out.println("tvArr["+i+"].channel 값은"+tvArr[i].channel+"입니다.");
		}
	}
}

class Tv4{
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	//TV 기능(메서드)
	void power() { power = !power;}
	void channelUp(){ ++channel;}
	void chanlleDown(){ --channel;}
}