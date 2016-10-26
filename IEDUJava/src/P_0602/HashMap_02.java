package P_0602;

/*
 * 5����� �̸��� Map�� ����� �� Set���� ��ȯ�Ͽ� ��� ����϶�
 * 
 * Mapt ��ü�δ� �ѹ��� �Ѱ��� ������ �ִ�
 */
import java.util.*;

public class HashMap_02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "b");
		map.put("2", "d");
		map.put("3", "c");
		map.put("4", "a");
		map.put("5", "f");

		// Set���� ��ȯ����
		// �̷��� �ϸ� Map�� ������ �ִ� �ΰ��� �����Ͱ� Map.Entry��� Ŭ������
		// ������ Set���� ��ȯ�Ǵ���
		Set set = map.entrySet();
		// �����͸� ������ ���ؼ� Iterator�� ��ȯ
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			// �׷��� �������� Map.Entry�� �������Ѵ�
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}

	}
	
	

}