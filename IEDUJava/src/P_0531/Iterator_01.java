package P_0531;

import java.util.*;
public class Iterator_01 {
		static void getData(Iterator iter){
			while(iter.hasNext()){
			System.out.println(iter.next());
			}
		}
		//�������� ���Լ����� Iterator�� �ָ� �����͸� ������ ����ϴ� �Լ�
	
	
	public static void main(String[] args) {
		//Vector v = new Vector();
		HashSet v = new HashSet();
		v.add("�¿�");
		v.add("����");
		v.add("���");
		v.add("ȿ��");
		v.add("����ī");
		v.add("Ƽ�Ĵ�");
		v.add("����");
		v.add("����");
		v.add("����");
	
		getData(v.iterator());
		
	}

}

//arraylistŬ���� ����
