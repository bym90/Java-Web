package P_0602;
/*
 *  5����� �Է��� �� ���� ������ �������
 */
import java.util.*;
public class HashMap_03 {

	public static void main(String[] args) {
		//���� ��Ű�� ��θ� ����ϴ� �������� �ᵵ�ȴ�
		//���� �Ź� ����� ������ ������־�� �Ѵ�
		java.util.HashMap map = new java.util.HashMap();
		
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		map.put("5", "E");

		//Ű���� Set���� ��ȯ����
		//�� �ȿ��� Ű���� Set���� ��ȯ���ֹǷ�
		Set set = map.keySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()){
			String key = (String) iter.next();
			//Ű���� �˾����Ƿ� �����͸� ���� �� �ִ�
			String data = (String) map.get(key);
			System.out.println(key + " : " + data);
		}
		
	
	}

}