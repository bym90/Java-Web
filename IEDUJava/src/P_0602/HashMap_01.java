package P_0602;
/*
 * ģ���� ������ Map�� ����� ����
 */
import java.util.*;
/**
 * 
 * �� Ŭ������ HashMap�� �׽�Ʈ�ϱ� ���� Ŭ�����Դϴ�
 * @author Administrator
 *
 */

public class HashMap_01 {
	/**
	 * ���� ������ �ΰ� �������. num1�� private�̰� num2�� public�̴�
	 */
	private int num1;
	public int num2;
	/**
	 * �� �Լ��� ������ �Լ��Դϴ�
	 * �Ķ���ʹ� �������ڸ� �޴´�
	 * @param args
	 */

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("�̸�", "ȫ�浿");
		map.put("����", "27");
		map.put("��ȭ��ȣ", "010-0000-0000");
		
		//������ ���
		String name = (String) map.get("�̸�");
		System.out.println("����� �̸� = " + name);
		
	}

}

