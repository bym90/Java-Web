package P_0603;
/*
 * ArrayList�� ���ڿ��� �Է��ϴ� �÷������� ���� �������
 */
import java.util.*;
public class Generics_02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		String name = list.get(0);
		System.out.println(name);
		
		ArrayList list1 = new ArrayList();
		list1.add("ȫ�浿");
		String name2 = (String) list1.get(0);
		System.out.println(name);
		
		

	}

}