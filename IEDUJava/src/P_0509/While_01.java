package P_0509;

public class While_01 {
/*
 * Hello World를 10번 출력하라
 */
	public static void main(String[] args) {
		int count = 0;//변수의 초기화
		/*
		 *  while()안에는 조건식이 들어가야 하는데 조건식은 결과가 논리값이 나와야한다.
		 *  지금은 논리값을 강제로 참으로 입력했다
		 *  질문을 할 떄 마다 참으로 대답함으로 이 프로그램은 무한루프!!
		 */
			while(true){
				System.out.println("Hello World");
				//카운터 증가
			    count = count + 1;
			    if(count == 10){
			    	break;	    	
					
			    }//1 if의 블럭은 break가 적용되지 않으므로  while블럭인 2번 블럭으로 빠져나감
			    
			}//2
				
	}//3

}//4
