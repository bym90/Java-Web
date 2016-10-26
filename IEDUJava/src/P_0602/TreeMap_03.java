package P_0602;
/*
 * ���ĺ� 'A' ~ 'J'������ �����ϰ� 100���� �߻��� ��
 * ������ ���ĺ� ���ڰ� ��� �߻��Ǿ������� ó���ϴ� ���α׷��� ������
 */
import java.util.*;
public class TreeMap_03 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		//���ڸ� 100�� �߻��Ѵ�
		for (int i = 0; i < 100; i++) {
			char ch = (char)(Math.random()*('J' - 'A' + 1) + 'A');
			//�� ���ڰ� �̹� Ű������ ��ϵǾ������� �˾ƺ���
			if(map.containsKey(ch)){
				//�̹� �߻������� �ִ� �����̴�
				//���� ����� �˾Ƴ���
				int temp = (int) map.get(ch);
				// + 1�� �ؾ��Ѵ�
				temp = temp + 1;
				map.put(ch, temp);
				//map�� Ư¡�� Ű���� �ߺ��Ǹ� ������ Ű���� ������
			}
			else{
				//���� ó�� �߻��� �����̴�
				map.put(ch, 1);
			}
		}
		
		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		while(iter.hasNext()){
			char key = (char) iter.next();
			int value = (int) map.get(key);
			System.out.println(key + " == " + value);
		}
		
		
		
	}

}