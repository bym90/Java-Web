package P_0601;
/*
 * HashSet�� Ư¡�� �˾ƺ���
 */
import java.util.*;
public class HashSet_01 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("ȫ�浿");
		set.add("�嵶��");
		set.add("�ھ���");
		set.add("ȫ�浿");
		
		int size = set.size();
		System.out.println("ũ�� = " + size);
		//�ߺ������ʹ� ����
		
		//������ �ޱ�
		//Iterator�� �ѹ� ����ϸ� �����Ͱ� ��������
		Iterator iter = set.iterator();
		System.out.println("�ѹ�");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("�ι�");
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		

	}

}