package P_0527;
/*
 * 주민등록번호를 입력받은 후(강제로 입력한 후)
 * 올바를 형태인지 검사 하세요
 */
import java.util.regex.*;
public class Regular_Expression_02 {

	public static void main(String[] args) {
		// 주민등록번호를 입력받는다
		String pID = "111111-1111111";
		
		// 검사 패턴(형식)을 지정
		Pattern p = Pattern.compile("[0-9]{6}-[0-9]{7}");
		// 검사를 실시한다
		Matcher m =	p.matcher(pID);
		// Matcher 클래스 안에는 검사한 결과에 대한 정보가 기억되어 있다
		// 검사가 올바른지 알고싶다
		if(m.matches()){
			System.out.println("올바른 주민번호");
		}
		else{
			System.out.println("올바르지 않은 주민번호");
		}
		
	}

}
//숙제 구글을 해서 다른정보를 알아내는 방법도 공부해 두자