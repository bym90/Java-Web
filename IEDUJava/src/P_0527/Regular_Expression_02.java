package P_0527;
/*
 * �ֹε�Ϲ�ȣ�� �Է¹��� ��(������ �Է��� ��)
 * �ùٸ� �������� �˻� �ϼ���
 */
import java.util.regex.*;
public class Regular_Expression_02 {

	public static void main(String[] args) {
		// �ֹε�Ϲ�ȣ�� �Է¹޴´�
		String pID = "111111-1111111";
		
		// �˻� ����(����)�� ����
		Pattern p = Pattern.compile("[0-9]{6}-[0-9]{7}");
		// �˻縦 �ǽ��Ѵ�
		Matcher m =	p.matcher(pID);
		// Matcher Ŭ���� �ȿ��� �˻��� ����� ���� ������ ���Ǿ� �ִ�
		// �˻簡 �ùٸ��� �˰��ʹ�
		if(m.matches()){
			System.out.println("�ùٸ� �ֹι�ȣ");
		}
		else{
			System.out.println("�ùٸ��� ���� �ֹι�ȣ");
		}
		
	}

}
//���� ������ �ؼ� �ٸ������� �˾Ƴ��� ����� ������ ����