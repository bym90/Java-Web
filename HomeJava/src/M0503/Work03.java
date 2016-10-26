package M0503;

public class Work03 {
/*  1~100사이의 숫자를 랜덤하게 입력한 후
	그 숫자가 3의 배수이면 * 2로 만들어서 출력하고
	3의 배수가 아니면 / 2를 해서 출력하라.
          결과		원래수	= ???
	                    결과수 = ???
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*(100 - 1 + 1) + 1);
		int result = (num % 3 == 0) ? (num*2):(num/2);
		System.out.println(num);
		System.out.println(result);

	}

}
