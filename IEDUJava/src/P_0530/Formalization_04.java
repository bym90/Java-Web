package P_0530;

import	java.text.*;
public class Formalization_04 {

	public static void main(String[] args) {
		//����� �����Ͱ� �ϼ��Ǿ��ٰ� ��������.
		Object[]	data = {"ȫ�浿", 'M', 54, 178.25F};

		MessageFormat mf = 
	new MessageFormat("����� �̸��� {0}�̱� ���̴� {2}�̸� ������ {1}�̳׿� �׸��� Ű�� {3}�̱���");
			String	result = mf.format(data);
			System.out.println(result);
	}

}
