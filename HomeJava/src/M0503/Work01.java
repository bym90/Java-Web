package M0503;

public class Work01 {

	public static void main(String[] args) {
		/*-50~50������ ������ �߻��Ͽ�
			��ȣ�� �����Ͽ� ����϶�.

			���		������ = ??
						����� = ??
		 */
		int num = (int)(Math.random()*(50 - (-50) +1) + (-50));
		int	result = (num > 0) ? -num : -num;
		System.out.println(num);
		System.out.println(result);
		
	}

}