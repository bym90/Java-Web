package P_0531;
/*
 * 5개의 데이터를 벡터에 기억한 후 출력하자
 */
import java.util.*;
public class Vector_02 {

	public static void main(String[] args) {
		Vector v = new Vector(5,5);
		//옆에 노란경고가 있는 이유는 jdk1.4이후 부터는 제너릭을 사용하도록 권장하고 있는데
		//아직까지 제너릭을 사용하지 않았기 때문에 뜨는것

		v.add("김태연");
		v.add(27);
		v.addElement(true);
		v.add(1, 153.4F); // 중간에 끼워넣기 한것
		v.add("111-2222");
		
		
		//보관한 데이터를 사용 시점에서 가서 꺼내자
		int size = v.size();
		for (int i = 0; i < size; i++) {
			System.out.println(v.get(i));
		}
		
	}

}
