package P_0525;

/*
 * 	이 클래스는 사용자 예외 던지기에서 사용할 예외 클래스로 제작할 예정이다.
 */
public class AgeException extends Exception {
	public String toString() {
		return "나이는 음수가 입력될 수 없어요... 이바보야";
	}
}
