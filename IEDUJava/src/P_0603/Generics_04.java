package P_0603;

import java.util.*;
public class Generics_04 {

	public static void main(String[] args) {
//		ArrayList<? extends Son04> a1= new ArrayList<Son04>();
//		ArrayList<? extends Son04> a2= new ArrayList<GrandSon04>();
//		//ArrayList<? extends Son04>	a3 = new ArrayList<Father04>();
//		//����Ŭ������ ������ ����Ŭ������ ���� �ʴ´�
//		ArrayList<? super Son04> a4 = new ArrayList<Son04>();
//		ArrayList<? super Son04> a5 = new ArrayList<Father04>();
//		ArrayList<? super Son04> a6 = new ArrayList<Grand04>();
		//ArrayList<? super Son04> a7 = new ArrayList<GrandSon04>();
		//����Ŭ������ �ް� ����Ŭ������ ���� �ʴ´�
//		ArrayList<? extends Son04> a8= new ArrayList<Son04>();
		
			ArrayList<GrandSon04> 	t1 = new ArrayList<GrandSon04>();
			t1.add(new GrandSon04());
			
			ArrayList<Father04> 	t4 = new ArrayList<Father04>();
			t4.add(new Father04());

			ArrayList<Son04> 		t3 = new ArrayList<Son04>();
			//���ʸ��� Son04�� �����Ƿ� Son04�̿��� ���� �������Ѵ�
//			t3 = t1; 
//			t3 = t4;
			
			ArrayList<? extends Son04> 	t5 = new ArrayList<Son04>();
			t5 = t1;
			//Son04�� ������ ������ �ֵ��� �����Ƿ� GrandSon04�� �ް�
			//Father05�� ���޴´�
//			t5 = t4;
			
			ArrayList<? super Son04> t6 = new ArrayList<Son04>();
			//Son04�� ������ ���� �� �ֵ��� �����Ƿ� Father04�� �ް�
			//GrandSon04�� ���޴´�
//			t6 = t1;
			t6 = t4;
		
	}

}

class Grand04{
	
}
class Father04 extends Grand04{
	
}
class Son04 extends Father04{
	
}
class GrandSon04 extends Son04{
	
}


