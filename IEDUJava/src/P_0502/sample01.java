package P_0502;

public class sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �׻� ���α׷��� �⺻�� �ƴ� �����͸� �˷��ְ� �������� ����� ����*/
		int num = 35168;
		
		int man, chun, back, sib, il;
		man = num / 10000;
        num = num % 10000;
        chun = num /1000;
        num = num % 1000;
        back = num / 100;
        num = num % 100;
        sib = num / 10;
        num = num % 10;
        il = num;
        
		System.out.println("10000������->" + man);
		System.out.println("1000������->" + chun);
		System.out.println("100������->" + back);
		System.out.println("10������->" + sib);
		System.out.println("1������->" + il);
		
	}

}