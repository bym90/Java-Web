package P_0531;
/*
 * �÷����� ������ �پ��� �����͸� ���� ����� �� �ִٴ� ���
 * ������ �ǹ������� �ϳ��� �÷��ǿ��� ���� ������ �����͸� ����ϵ���
 * �ϴ°��� ��Ģ�̴�
 */
import java.util.*;
public class Vector_03 {

	public static void main(String[] args) {

		Vector v = new Vector(5,5);
	
		v.add("���¿�");
		v.add(27);
		v.addElement(false);
		v.add(1, 153.4F); 
		v.add("111-2222");
		
		int size = v.size();
		for (int i = 0; i < size; i++) {
			//������ ���� �����͸� ���α׷����� ����� �������� ���
			//�׷��Ƿ� ���� �����ʹ� ������ �ؾ��Ѵ�
			//1. �ϴ��� ��� ���¸� �� ����� �� �ִ� Object�� ������ �Ѵ�
			Object temp = v.get(i);
			//2. �̰��� ���������� �°� �� ��ȯ�ؼ� ����ؾ��� �Ѵ�
			if (temp instanceof String) {
				String name = (String) temp;
				System.out.println(name);
			}
			else if(temp instanceof Integer){
				int age = (int) temp;
				System.out.println(age);
			}
			else if(temp instanceof Boolean){
				boolean gender = (boolean) temp;
				System.out.println(gender);
			}
			else if(temp instanceof Float){
				float h = (float) temp;
				System.out.println(h);
			}
			//����ȯ�� ������ϴ� ���ŷο��� �����Ƿ� ���������� �����͸� �Է��ϴ°��� ����
		}
			
	}

}