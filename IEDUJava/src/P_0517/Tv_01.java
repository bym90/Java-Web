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
		System.out.println("���� ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("���� ä���� " + t2.channel + "�� �Դϴ�.");
		t2 = t1; //�ּҸ� ���� �ϴ°��̱� ������ t2�� t1�� �ּҸ� ���´�.
		t1.channel = 7;
		System.out.println("���� ä���� " + t1.channel + "�� �Դϴ�.");
		System.out.println("���� ä���� " + t2.channel + "�� �Դϴ�.");

	}

}