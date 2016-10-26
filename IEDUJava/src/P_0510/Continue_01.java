package P_0510;

public class Continue_01 {

	public static void main(String[] args) {
		
		/*
		for(int i=0; i<10; i++){
			if(i==5){
				continue; //5일때 실행 제외
			}
			System.out.println("I = " + i);
		}
		*/
		
		
		
/*
 * 소수란?
 * 2 ~ 자신보다 자은수의 범위안에 나누어 떨어지는 수가 하나도 없는 경우		
 */
		/*
		//소수 판정에 들어가기전에 분칠을 한다
		int flag = 1; //1이 하얀색
		int num = (int)(Math.random()*(100-1+1)+1);
		
		for(int i=2; i < num; i++){
			int na = num % i;
				if(na==0){
					flag = 2;
					
					break;//(1)
				}
		}
		if(flag == 1){
			System.out.println(num + "는 소수이다");
		}
		else{
			System.out.println(num + "는 소수가 아니다");
		}
		//(1) for와 break 명령어 끝나는 위치가 같다
		*/
		

		
/*
 * 3~100사이의 숫자 중에서 소수만 골라서 출력하라		
 */
		/*
		dasi:
		//3~100까지 숫자를 판단하기 윈한 반복	
		for(int i=3; i<=100; i++){
			//특정 숫자가 소수인지를 판단하기 위한 반복
			for(int j=2; j<i; j++){
				int na = i % j;
					if(na==0){
						//이 숫자는 소수가 아니다
						continue dasi;
					}
			}
			//continue를 당하지 않았기 떄문에 이부분이 실행될 수 있다. 따라서 이 숫자는 소수이다
			System.out.println(i + "는 소수이다");
		}
		*/
		
		
/*숙제4
 * 구구단 출력
 * 1*1=1 2*1=2 3*1=3
 * 1*2=2 2*2=4 3*2=6...
 * 4*1=4...
 * 7*1=7...
 * for명령이 3번 들어간다. 가장 안쪽 for는 3단의 한줄을 출력하기 위한 for
 * 가운데 for는 한 단을 출력하기 위한 for
 * 가장 바깥 for는 이 과정이 모두 3번 반복되어야 한다		
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
			
	
		
	
	
/* 숙제5
 * 1   2*-1   
 * 1 + (-2) + 3 + (-4) + 5 +(-6)......
 * 홀수는 더하고 짝수는 뺀다	
 * 이 합이 100이상이 되는 시점을 구하라
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
