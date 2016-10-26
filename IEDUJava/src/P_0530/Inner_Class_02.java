package P_0530;

import java.net.StandardSocketOptions;

public class Inner_Class_02 {

	public static void main(String[] args) {
		//	이것이 되지 않는다.
		//	Outer02.Inner02 in = new Outer02.Inner02();
		//	이유는 Outer02가 존재하지 않으므로 Inner02는 탄생할 수 없다.
		

		Outer02	out = new Outer02();
		out.a = 10;
		Outer02.Inner02 in = out.new Inner02(); 
		in.a = 20;
		
		//in.lmn();
		in.abc();
		
	}

}


class Outer02 {
	int		a;
	int		b;
	void abc() {
		//lmn(); 바깥 클래스는 절대로 안쪽 클래스의 멤버를 사용할 수 없다
		Inner02 in = this.new Inner02();
		in.lmn();
		//바깥 클래스 주소를 붙이지 않고 new시키는 이유는
		//this가 자동으로 붙기때문이다
		
	}
	void xyz() {
		System.out.println("나는 바깥의 xyz()이다.");
	}
		class Inner02 {
			int a;
			void abc() {
				//a = 10; //자신의 멤버를 우선 사용한다라는 규칙에 의해
						  //안쪽 클래스의 멤버를 사용할 것이다
				System.out.println(a); //20
				System.out.println(this.a); //20
				System.out.println(Outer02.this.a); //10
			}
			void lmn(){
				//아래에서 사용한 두개의 멤버는 Outer 클래스 소속이다
				b = 20;
				xyz();
				System.out.println("B = " + b);
				//이처럼 전역 Inner클래스의 가장 큰 특징은
				//바깥 클래스의 멤버를 마치 자기것처럼 사용하는데 있다
			}
		}
}
