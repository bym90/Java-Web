package P_0601;
/*
 * �ߺ������� �������� �ʴ´�
 * ���� �ζǺ��� �����ȣ ������
 */
import java.util.*;
public class HashSet_02 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		// ��� �õ��ؾ� 6���� ��ȣ�� �ϼ����� �𸣹Ƿ� ���ѹݺ�
		while(true){
			int temp = (int)(Math.random()*(45 - 1 + 1) + 1);
			set.add(temp);
			if(set.size() == 6){
				break;
			}
		}

		//���� ����� Iterator�� ó���ؾ� �Ѵ�
		//���� Set�� �ܼ��� ����ϸ� ���������� toString()�� �������̵� �ؼ�
		//�����͸� ����ϴ� ������� ����� ���Ҵ�
		//�ܼ��� �����͸� ���������� ��¸� �ص� �ȴ�
		System.out.println(set);
		//�̰��� �÷��ǿ� �ִ� �����͸� ����ϴ� ���� �ƴϰ� �ܼ��� ���븸
		//Ȯ���ϱ� ���� ����!!!
		
		
	}

}