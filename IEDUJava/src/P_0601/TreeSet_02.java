package P_0601;
/*
 * 10����� �̸��� �Է��س��� �������� �����Ͽ� �����غ���
 */
import java.util.*;
public class TreeSet_02 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new MySort02());
		
		set.add("a");
		set.add("d");
		set.add("h");
		set.add("z");
		set.add("b");
		set.add("t");
		set.add("Y");
		set.add("P");
		set.add("L");
		set.add("E");
		
		System.out.println(set);
	
		
	}

}

//���� ����� �����ϱ� ���ؼ���
//Comparator �������̽��� ��ӹ��� Ŭ������ �����ϰ�
//�׾ȿ� it compare(T o1, T o2)�� �������̵� ����
//0, ���, ������ ��ȯ�����ν� ���Ĺ���� ���� �� �ִ�

class MySort02 implements Comparator{
	@Override
	public int compare(Object o1, Object o2){
		String temp1 = (String) o1;
		String temp2 = (String) o2;
		
		int diff = temp1.compareTo(temp2);
		
		return -diff;
		
	}
}