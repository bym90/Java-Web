package P_0526;

public class ToString_01 {
		/*static int asd(){
			return 5;
		}
*/
	public static void main(String[] args) {
		//System.out.println(asd());
		Test021 t = new Test021();
		System.out.println(t); // 여기도 자동으로 toString()가 실행된다
		System.out.println(t.toString());
	}

}

//주소를 출력할때 클래스의 정보를 다른방식으로 알려주고 싶을떄

class Test021{
	int garo = 100;
	int sero = 200;
	public String toString(){
		return "이 클래스는 면적이" + (garo * sero) + "사각형입니다";
	}
	
}