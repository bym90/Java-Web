package LJY.LJY_BOOK.자바의정석.chapter6;

public class TvTest2_237 {
	public static void main(String[] args) {
		Tv2 t1 = new Tv2();
		Tv2 t2 = new Tv2();

		System.out.println("t1의 channel값은"+t1.channel);
		System.out.println("t2의 channel값은"+t2.channel);


		t1.channel = 8;
		System.out.println("t1의 채널이"+t1.channel +"로 변경되었습니다.");


		System.out.println("t1의 channel값은"+t1.channel);
		System.out.println("t2의 channel값은"+t2.channel);



	}

}

class Tv2{
	String color;
	boolean power;
	int channel;

	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown(){ --channel;}

}

