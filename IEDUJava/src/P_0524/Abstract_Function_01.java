package P_0524;
import java.util.*;
public class Abstract_Function_01 {
	public static void main(String[] args){
		//Calendar c = new Calendar();
		//�߻� Ŭ������ ������ new �� �� ����
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		//���� 1���� 0���� ī��Ʈ �Ѵ�
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + day + "��");
		
	}
	
	
}