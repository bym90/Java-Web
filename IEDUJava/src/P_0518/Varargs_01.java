package P_0518;

public class Varargs_01 {

	public static void main(String[] args) {
		Test031	t = new Test031();
		
		int	hap = t.add(5, 6, 7, 8, 5, 3, 6, 7, 5, 7);
		System.out.println("��� = " + hap);
	}
}


class Test031 {
	int add(int ... nums) { //(int ... nums, int c) �������� �ڿ��� ������ ���� ���Ѵ�
		//	�� �Լ� �ȿ����� nums ��� ������ �迭 ������ �Ǿ�����
		//	�׷��Ƿ� ��ġ �迭������ ����ϵ��� ����ϸ� �ȴ�
		int		sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
}