package P_0602;

import java.util.*;
public class TreeMap_01 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("�̸�", "A");
		map.put("��ȭ��ȣ", "010-0000-0000");
		map.put("�̸���", "@naver.com");
		map.put("�ּ�", "��⵵");
		map.put("�ֹι�ȣ", "000000-1111111");
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Map.Entry temp = (Map.Entry) iter.next();
			System.out.println(temp);
		}
		


	}

}