package P_0520;
//다른 패키지 소속 클래스를 사용하기 위해서는 반드시 import를 사용
import IMSI.*;
//이 클래스는 Sample01를 상속받아서 만들 예정이다
//즉, 상속관계에 있는 클래스에서는 어디까지 사용할 수 있는지 확인

public class IMSI_Test_01 extends Sample01{
	void abc(){
		pub = 1000;
		pro = 2000;
		//pac = 3000;
		//pri = 4000;
	}
}

