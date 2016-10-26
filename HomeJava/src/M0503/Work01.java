package M0503;

public class Work01 {

	public static void main(String[] args) {
		/*-50~50사이의 난수를 발생하여
			부호를 반전하여 출력하라.

			결과		원래수 = ??
						결과수 = ??
		 */
		int num = (int)(Math.random()*(50 - (-50) +1) + (-50));
		int	result = (num > 0) ? -num : -num;
		System.out.println(num);
		System.out.println(result);
		
	}

}
