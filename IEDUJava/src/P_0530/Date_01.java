package P_0530;
/*
 * 	���� ��¥�� ���� �ð��� �˾ƺ���.
 */
import java.util.*;
public class Date_01 {

	public static void main(String[] args) {
		Date d = new Date();
		
		//�˾ƺ��� ���� ������ ������ getXXX
		int year = d.getYear() + 1900;
		//�� �Լ��� �⵵�� 1900�� ���ĺ��� ���
		//�׷��Ƿ� 1900�� ���ؾ� ��Ȯ�� �⵵�� ����
		int month = d.getMonth() + 1;
		//���� 1���� 0���� �Ͽ� �˷��ش�
		//�� 12���� 11���̶� �˷��ش�
		//�� ���� ���� �Ϲ����� ������� �˷��ش�
		int day = d.getDate();
		
		int yo = d.getDay();
		
		System.out.println(year + "��" + month + "��" + day + "��");
		System.out.println(yo);
	}

}

//���� getday()�� ���Ͽ� �����ϰ� ��뿹�� ���弼��
//������ ��Ÿ���� �Լ� 0 sunday���� ����