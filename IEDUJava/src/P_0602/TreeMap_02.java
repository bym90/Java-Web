package P_0602;
/*
 * ģ���̸��� Map�� ������ ��
 * ģ���̸��� �̿��ؼ� �����Ͽ� ����϶�
 */
import java.util.*;
public class TreeMap_02 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("ģ��", "A");
		map.put("����", "D");
		map.put("�ŷ�ó", "F");
		map.put("����", "c");
		map.put("����", "b");
		
		//���� �̸��� �������� �����ϱ⸦ ���Ѵ�
		Set set = map.entrySet();
		ArrayList list = new ArrayList(set);
		Collections.sort(list, new MySort02());
		
		for (int i = 0; i < list.size(); i++) {
			Map.Entry temp = (Map.Entry) list.get(i);
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}
		
		
	}

}


//���� ����� �����ϱ� ���� Ŭ������ ������ش�
class MySort02 implements Comparator{
	public int compare(Object o1, Object o2){
		//���� �񱳴���� o1�� o2�� ���ϴ� ���·� ����ȯ�ؼ� ����ؾ� �Ѵ�
		Map.Entry temp1 = (Map.Entry) o1;
		Map.Entry temp2 = (Map.Entry) o2;
		
		String name1 = (String) temp1.getValue();
		String name2 = (String) temp2.getValue();
		
		int diff = name1.compareTo(name2);
		return diff;
		
	}
	
	
}