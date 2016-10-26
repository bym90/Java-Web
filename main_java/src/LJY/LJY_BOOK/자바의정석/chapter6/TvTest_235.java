package LJY.LJY_BOOK.자바의정석.chapter6;
/**
 * 자바의정석 교재 235페이지
 *
 */
public class TvTest_235 {
		public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7;
		t.chnanelDown();

		System.out.println("현재 채널은 "+t.channel +"이다.");
		t.power();
		System.out.println(t.power);
	}
}

class Tv{
	String color;
	boolean power;
	int channel;

	void power(){
//		power = !power;
		if(power){
			power = false;
		}else{
			power = true;
		}

	}

	void channelUp(){
		++channel;
	}

	void chnanelDown(){
		--channel;
	}

}