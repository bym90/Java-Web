package IMSI;
//이 클래스는 이 안에 4가지 접근지정 권한을 가진 변수를
//변수를 만들 예정이다

//이 안에 있는 변수가 어디에서 사용할 수 있고
//어디에서 사용할 수 없는지를 확인해 보도록 한다
public class Sample01 {
	public int 	pub = 100;
	protected int 	pro = 200;
	int 			pac = 300;
	private int 	pri = 400;
// 1. 같은 클래스 안에서는 무엇을 사용할 수 있나?
	void abc(){
		pub = 1000;
		pro = 2000;
		pac = 3000;
		pri = 4000;
	}

	
	
	
	
	
}
