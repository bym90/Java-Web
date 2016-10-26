package P_0601;

import java.util.*;
public class TreeSet_03 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new MyClass03("홍길동", 24));
		set.add(new MyClass03("박아지", 27));
		set.add(new MyClass03("장독대", 21));
	
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			MyClass03 temp = (MyClass03) iter.next();
			System.out.println(temp.name + " : " +temp.age);
		}
	}

}

//이 클래스를 정렬해야 할 필요가 생기면(TreeSet에 넣어야 하면)
//1. Comparable 상속받아서 만든다
class MyClass03 implements Comparable{
	String name;
	int age;
	MyClass03(){
		
	}
	MyClass03(String n, int a){
		name = n;
		age = a;
	}
	//int compareTo(T o)를 오버라이드 한다
	@Override
	public int compareTo(/*MyClass03 this*/Object o){
		//이 함수에서 정렬하는 방식을 제공
		//문제 이 함수는 비교대상이 들어와야 하는데 비교대상이 하나뿐이다
		// 	   나머지 하나를 찾아야한다
		//힌트 이 함수는 정렬을 해야하는 클래스
		// 	   나머지 하나는 this가 가지고있다
		MyClass03 temp = (MyClass03) o;
		//문제 나이를 기준으로 해서 정렬
		
		int diff = this.age - temp.age;
		return diff;
		//문제 이름을 기준으로 해서 정렬
//		int diff = this.name.compareTo(temp.name);
//		return diff;
	}
}



//숙제 class Test00 {
//		int ban; 반 기억
//		int no;  번호 기억
//		String name;  이름 기억
//		필요한 생성자 함수작성하세요
//		}
//위의 클래스를 이용해서 적당한 숫자의 학생을 TreeSet에 기억하세요
//단 저장순서는 반순서대로 하며 같은반 경우에는 번호순서대로 한다



