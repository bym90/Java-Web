package P_0510;

public class Continue_01 {

	public static void main(String[] args) {
		
		/*
		for(int i=0; i<10; i++){
			if(i==5){
				continue; //5�϶� ���� ����
			}
			System.out.println("I = " + i);
		}
		*/
		
		
		
/*
 * �Ҽ���?
 * 2 ~ �ڽź��� �������� �����ȿ� ������ �������� ���� �ϳ��� ���� ���		
 */
		/*
		//�Ҽ� ������ �������� ��ĥ�� �Ѵ�
		int flag = 1; //1�� �Ͼ��
		int num = (int)(Math.random()*(100-1+1)+1);
		
		for(int i=2; i < num; i++){
			int na = num % i;
				if(na==0){
					flag = 2;
					
					break;//(1)
				}
		}
		if(flag == 1){
			System.out.println(num + "�� �Ҽ��̴�");
		}
		else{
			System.out.println(num + "�� �Ҽ��� �ƴϴ�");
		}
		//(1) for�� break ���ɾ� ������ ��ġ�� ����
		*/
		

		
/*
 * 3~100������ ���� �߿��� �Ҽ��� ��� ����϶�		
 */
		/*
		dasi:
		//3~100���� ���ڸ� �Ǵ��ϱ� ���� �ݺ�	
		for(int i=3; i<=100; i++){
			//Ư�� ���ڰ� �Ҽ������� �Ǵ��ϱ� ���� �ݺ�
			for(int j=2; j<i; j++){
				int na = i % j;
					if(na==0){
						//�� ���ڴ� �Ҽ��� �ƴϴ�
						continue dasi;
					}
			}
			//continue�� ������ �ʾұ� ������ �̺κ��� ����� �� �ִ�. ���� �� ���ڴ� �Ҽ��̴�
			System.out.println(i + "�� �Ҽ��̴�");
		}
		*/
		
		
/*����4
 * ������ ���
 * 1*1=1 2*1=2 3*1=3
 * 1*2=2 2*2=4 3*2=6...
 * 4*1=4...
 * 7*1=7...
 * for������ 3�� ����. ���� ���� for�� 3���� ������ ����ϱ� ���� for
 * ��� for�� �� ���� ����ϱ� ���� for
 * ���� �ٱ� for�� �� ������ ��� 3�� �ݺ��Ǿ�� �Ѵ�		
 */
		
		int dan=0;
		
		for(int z=1; z<=9; z+=3){
			for(int y=1; y<=9; y++){
				for(int x=z; x<=z+2; x++){
					dan=y*x;
					System.out.print(x + "*" + y +"="+ dan +"  ");	
				}
				System.out.println();
			}
			System.out.println();
		}	
			
		
		
		
	/*	
	for(int i=1 ; i<=3; i++){
		
		for(int j=1; j<=9; j++) {

			if(i==1){
			for(int k=1; k<=3; k++) {
				int	dap = k * j;
				System.out.print(k + " * " + j + " = " + dap);
				System.out.print("     ");
				}
			}
			else if(i==2){
				for(int k=4; k<=6; k++) {
					int	dap = k * j;
					System.out.print(k + " * " + j + " = " + dap);
					System.out.print("     ");
				}
			}
			else for(int k=7; k<=9; k++) {
				int	dap = k * j;
				System.out.print(k + " * " + j + " = " + dap);
				System.out.print("     ");
				
			}
			System.out.println();
		}
		System.out.println();
	}	
	*/
		/*
		for(int i= ; i<3; i++){
			
			for(int j=1; j<=9; j++) {
				
				for(int k=1; k<=3; k++) {
					int	dap = (i + k) * j;
					System.out.print(k + " * " + j + " = " + dap);
					System.out.print("     ");
					
					}
					System.out.println();
				}
				System.out.println();
			}
		*/
			
	
		
	
	
/* ����5
 * 1   2*-1   
 * 1 + (-2) + 3 + (-4) + 5 +(-6)......
 * Ȧ���� ���ϰ� ¦���� ����	
 * �� ���� 100�̻��� �Ǵ� ������ ���϶�
 */
		/*
		int sum=0;
		int flag=1;
		int num=0;
		for(int i=1; ;i++){
			num=i*flag;
			flag=flag*(-1);
			sum+=num;
				if(sum>=100){
					break;
				}
		}		
		System.out.println(num);
		*/
		
		
		
	/*	
	int flag=1;
	
	for(int i=1; i<=10; i++){
		int dap = i * flag;
		flag = flag * (-1);
		System.out.println(dap);
		
	}
	*/
	
		
	
		
	}

}