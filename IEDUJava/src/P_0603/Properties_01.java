package P_0603;
/*
 * �ϴ� Properties�� Map�̶�°��� ��������
 */
import java.util.*;
public class Properties_01 {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		pro.setProperty("�̸�", "ȫ�浿");
		pro.getProperty("����", "27");
		
		String name = pro.getProperty("�̸�");
		System.out.println(name);
		
	}

}