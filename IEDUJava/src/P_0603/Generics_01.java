package P_0603;

public class Generics_01 {

	public static void main(String[] args) {
		Test01<String> t = new Test01<String>();
		t.setTemp("ASD");
		String name = t.getTemp();
		System.out.println(name);
		
		Test01<Integer> t1 = new Test01<Integer>();
		t1.setTemp(123);
		int num = t1.getTemp();
		System.out.println(num);

	}

}

//이렇게 만들어진 클래스를 제너릭 클래스라고 부른다
class Test01<T>{
	T temp;
	public void setTemp(T t){
		temp = t;
	}
	public T getTemp(){
		return temp;
	}
}