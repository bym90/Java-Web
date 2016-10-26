package P_0531;
/*
 * 컬렉션의 장점은 다양한 데이터를 같이 기억할 수 있다는 사실
 * 하지만 실무에서는 하나의 컬렉션에는 같은 형태의 데이터만 기억하도록
 * 하는것이 원칙이다
 */
import java.util.*;
public class Vector_03 {

	public static void main(String[] args) {

		Vector v = new Vector(5,5);
	
		v.add("김태연");
		v.add(27);
		v.addElement(false);
		v.add(1, 153.4F); 
		v.add("111-2222");
		
		int size = v.size();
		for (int i = 0; i < size; i++) {
			//실제는 꺼낸 데이터를 프로그램에서 사용할 목적으로 기억
			//그러므로 꺼낸 데이터는 재사용을 해야한다
			//1. 일단은 모든 형태를 다 기억할 수 있는 Object로 꺼내야 한다
			Object temp = v.get(i);
			//2. 이것을 데이터형에 맞게 형 변환해서 사용해야한 한다
			if (temp instanceof String) {
				String name = (String) temp;
				System.out.println(name);
			}
			else if(temp instanceof Integer){
				int age = (int) temp;
				System.out.println(age);
			}
			else if(temp instanceof Boolean){
				boolean gender = (boolean) temp;
				System.out.println(gender);
			}
			else if(temp instanceof Float){
				float h = (float) temp;
				System.out.println(h);
			}
			//형변환을 해줘야하는 번거로움이 있으므로 같은형태의 데이터만 입력하는것이 좋다
		}
			
	}

}
