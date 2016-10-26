package P_0517;
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}


public class Tv_01 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("현재 채널은 " + t1.channel + "번 입니다.");
		System.out.println("현재 채널은 " + t2.channel + "번 입니다.");
		t2 = t1; //주소를 복사 하는것이기 때문에 t2는 t1의 주소를 갖는다.
		t1.channel = 7;
		System.out.println("현재 채널은 " + t1.channel + "번 입니다.");
		System.out.println("현재 채널은 " + t2.channel + "번 입니다.");

	}

}
