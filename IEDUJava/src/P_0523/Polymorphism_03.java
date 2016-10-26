package P_0523;

public class Polymorphism_03 {
	public static void main(String[] args){
		Grand g1 = new GrandSon();
		Father g2 = (Father) g1;
		g2.abc();
		//g1.abc(); 할아버지부터 손자까지 가기로 했는데
		//할아버지쪽에 출발하는 함수가 없다
		//g에서부터 계층추적하여 GrandSon까지 추적하면서
		//마지막 만나는 함수를 선택한다
		//여기서는 Son에 있는 함수가 선택된다
	}
}

class Grand{
	
}

class Father extends Grand{
	void abc(){
		System.out.println("할아버지");
	}
}

class Son extends Father{
	void abc(){
		System.out.println("아들");
	}
}

class GrandSon extends Son{
	
}