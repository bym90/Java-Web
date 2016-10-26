package P_0613;

public class ClassCM_01 {

	public ClassCM_01() {
		One o = new One();
		o.abc();
	}

	public static void main(String[] args) {
		new ClassCM_01();

	}

}

class One{
	 int one;
	 Two s12;
	 void abc(){
		 //이곳에서 Two를 생성할 필요가 생겼다
		 s12 = new Two(this);//Two의 주소를 One에 기억
		
	 }
	
}
class Two{
	int two;
	One s11;
	Two(){}
	Two(One o){
		s11 = o;//One의 주소를 s11에 집어넣음
	}

}