package M0503;

import org.omg.Messaging.SyncScopeHelper;

public class Practice03 {

	public static void main(String[] args) {
		//�������� 3-2
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = 13;
		
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
				
		//�������� 3-3
		int num = 0;
	    String result = (num > 0 ? "���" : (num < 0 ? "����" : "0"));
		System.out.println(result);

		//�������� 3-4
		int num2 = 120;
		String result2 = (num2 == 456 ? "400" : (num2 == 111 ? "100" : "456�� 111�Ѵ� �ƴ�"));
		System.out.println(result2);
		
		int num3 = 120;
		System.out.println(num3/100*100);
		
		
		
	}

}