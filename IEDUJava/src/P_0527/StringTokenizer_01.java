package P_0527;

import java.util.*;

public class StringTokenizer_01 {

	public static void main(String[] args) {
		// ���� ���ڿ� �غ�
		String str = "a b c d e f";
		
		StringTokenizer token = new StringTokenizer(str);
		
		// �� �и��� ������ �ݵ�� ������θ� ����
		
		int count = token.countTokens();
		
		//���� �����͸� ����� �ٸ� ������ ����� ����
		String[] temp = new String[count];
		
		
		for (int i = 0; i < count; i++) {
			String data = token.nextToken();
			temp[i] = data;
			System.out.println(data);
		}
		
		System.out.println("�ٽ� ����մϴ�");
		/*for (int i = 0; i < count; i++) {
			String data = token.nextToken();
			System.out.println(data);
		} �ٽ� ���Ұ��� Ŭ����
		*/
		for (int i = 0; i < count; i++) {
			System.out.println(temp[i]);
		}
		//���� ������ ���Ѵٸ� �����͸� �ٸ������� ����س��ƾ� ��

	}

}