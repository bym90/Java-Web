package P_0531;
/*
 * 5���� �����͸� ���Ϳ� ����� �� �������
 */
import java.util.*;
public class Vector_02 {

	public static void main(String[] args) {
		Vector v = new Vector(5,5);
		//���� �������� �ִ� ������ jdk1.4���� ���ʹ� ���ʸ��� ����ϵ��� �����ϰ� �ִµ�
		//�������� ���ʸ��� ������� �ʾұ� ������ �ߴ°�

		v.add("���¿�");
		v.add(27);
		v.addElement(true);
		v.add(1, 153.4F); // �߰��� �����ֱ� �Ѱ�
		v.add("111-2222");
		
		
		//������ �����͸� ��� �������� ���� ������
		int size = v.size();
		for (int i = 0; i < size; i++) {
			System.out.println(v.get(i));
		}
		
	}

}