package P_0519;

public class This_01 {
	
	public static void main(String[] args) {
			Test t1 = new Test();
			Test t2 = new Test();
			t1.setNum(50);
			t2.setNum(70);
	}

}

class Test{
	int num;
	void setNum(/*Test this 자바가상머신이 만들어줌*/int a){
		this.num = a;
		this.display();
	}
	void display(/*Test this 자바가상머신이 만들어줌*/){
		System.out.println("결과는" + this.num);
	}
}
