package P_0502;

public class sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 항상 프로그램의 기본은 아는 데이터를 알려주고 가공한후 결과를 본다*/
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
        
		System.out.println("10000단위는->" + man);
		System.out.println("1000단위는->" + chun);
		System.out.println("100단위는->" + back);
		System.out.println("10단위는->" + sib);
		System.out.println("1단위는->" + il);
		
	}

}
