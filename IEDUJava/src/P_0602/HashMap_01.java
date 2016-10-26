package P_0602;
/*
 * 친구의 정보를 Map에 기억해 놓자
 */
import java.util.*;
/**
 * 
 * 이 클래스는 HashMap을 테스트하기 위한 클래스입니다
 * @author Administrator
 *
 */

public class HashMap_01 {
	/**
	 * 나는 변수를 두개 만들었다. num1은 private이고 num2는 public이다
	 */
	private int num1;
	public int num2;
	/**
	 * 이 함수는 진입점 함수입니다
	 * 파라미터는 실행인자를 받는다
	 * @param args
	 */

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("이름", "홍길동");
		map.put("나이", "27");
		map.put("전화번호", "010-0000-0000");
		
		//데이터 사용
		String name = (String) map.get("이름");
		System.out.println("당신의 이름 = " + name);
		
	}

}


