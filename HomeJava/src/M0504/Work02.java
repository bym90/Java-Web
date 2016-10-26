package M0504;

public class Work02 {

	public static void main(String[] args) {
		/*
		 * 숙제5.	다음 조건을 이용해서 전기 요금을 계산하세요
		 * 사용량 200~500사이의 랜덤한 값
		 * 사용처 가정용(H), 상업용(B), 교육용(S), 공업용(I)
		 * 출력 전기요금 = ????원;
		 * 단, 조건 	가정용 	상업용		교육용		공업용
		 * 	기본요금	3512	3702	2952	1585
		 *  사용요금	125		154		118		85
		 *  전기요금  = 기본요금 + (사용량 * 사용요금)
		 */
		int use = (int)(Math.random()*(500 - 200 + 1) + 1);
		char ch = 'B';
		int charge = 0;
		int ucharge[]={125, 154, 118, 85};
		int bcharge[]={3512, 3702, 2952, 1585};
		 switch(ch){
		 	case 'H': 
		 		charge = bcharge[1] + use * ucharge[1];
		 		break;
		 	case 'B': 
		 		charge = bcharge[2] + use * ucharge[2];
		 		break;
		 	case 'C': 
		 		charge = bcharge[3] + use * ucharge[3];
		 		break;
		 	case 'I': 
		 		charge = bcharge[4] + use * ucharge[4];
		 		break;
		 	default:	
		 }
		 
		 	System.out.println(charge);	
				
	}
		 

}
