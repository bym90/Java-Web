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
		 //�̰����� Two�� ������ �ʿ䰡 �����
		 s12 = new Two(this);//Two�� �ּҸ� One�� ���
		
	 }
	
}
class Two{
	int two;
	One s11;
	Two(){}
	Two(One o){
		s11 = o;//One�� �ּҸ� s11�� �������
	}

}