package M0503;

public class Work03 {
/*  1~100������ ���ڸ� �����ϰ� �Է��� ��
	�� ���ڰ� 3�� ����̸� * 2�� ���� ����ϰ�
	3�� ����� �ƴϸ� / 2�� �ؼ� ����϶�.
          ���		������	= ???
	                    ����� = ???
 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*(100 - 1 + 1) + 1);
		int result = (num % 3 == 0) ? (num*2):(num/2);
		System.out.println(num);
		System.out.println(result);

	}

}