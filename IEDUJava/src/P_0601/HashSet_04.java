package P_0601;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_04 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new MyClass04("홍길동", 24));
		set.add(new MyClass04("박아지", 25));
		set.add(new MyClass04("홍길동", 28));
		set.add(new MyClass04("박아지", 27));
		set.add(new MyClass04("홍길동", 24));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			MyClass04 temp = (MyClass04) iter.next();
			System.out.println(temp.name + " : " + temp.age);
		}

	}

}

class MyClass04{
	String name;
	int age;
	MyClass04(){
		
	}
	MyClass04(String n, int a){
		name = n;
		age = a;
	}
	//팁
	@Override
	//위의 명령은 어노테이션 명력이라고 부르는 것으로(@로 시작하는 명령)
	//@Override 명명은 다음에 만들 함수는 오버라이드 함수이다를 명백하게
	//밝혀주는 기능을 가진 명령
	//따라서 이 명령 다음에 만드는 함수는 오버라이드 규칙을 지키지 않으면
	//강제로 에러 발생하도록 되어있다
	
	//이 클래스가 같은 클래스로 인정받기 위해서는 equals()오버라이드 해야한다
	//hashCode()를 오버라이드 해야한다
	public boolean equals(/* MyClass04 this */Object obj){
		//이름과 나이가 같으면 같은 클래스로 인정해주고 싶다
		//비교할 첫번째 대상 this
		//비교할 두번째 대상 obj
		MyClass04 temp = (MyClass04) obj;
		if(this.name.equals(temp.name) && this.age == temp.age){
			return true;
		}
		else{
			return false;
		}
		//2. hashCode()를 오버라이드해야 한다
			
		}
		@Override
			
			public int hashCode(){
			//이 함수에는 같은 클래스로 인정하고 싶으면 같은 숫자를 반환해야 한다
			//나는 이름과 나이가 같으면 같은클래스로 알려주고 싶다
			//힌트 String은 같은 문자열이면 같은 HashCode값을 알려준다
			int code = name.hashCode();
			//여기에 나이를 더하면 같은이름의 같은나이는 같은숫자가 만들어질것이다
			return code + age;
			}
		
		
		
}