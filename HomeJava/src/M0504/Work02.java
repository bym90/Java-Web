package M0504;

public class Work02 {

	public static void main(String[] args) {
		/*
		 * ����5.	���� ������ �̿��ؼ� ���� ����� ����ϼ���
		 * ��뷮 200~500������ ������ ��
		 * ���ó ������(H), �����(B), ������(S), ������(I)
		 * ��� ������ = ????��;
		 * ��, ���� 	������ 	�����		������		������
		 * 	�⺻���	3512	3702	2952	1585
		 *  �����	125		154		118		85
		 *  ������  = �⺻��� + (��뷮 * �����)
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