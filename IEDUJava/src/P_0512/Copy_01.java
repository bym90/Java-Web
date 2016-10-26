package P_0512;

public class Copy_01 {

	public static void main(String[] args) {
	//얕은복사
	/*	
	int[] ori = {1,2,3,4,5};
	int[] copy = ori;
	System.out.println("원래값 "+copy[1]);
	ori[1]=10;
	System.out.println("바뀐값 "+copy[1]);
	*/
		
	/*	
	//깊은 복사
	int[] ori = {1,2,3,4,5};
	//강제로 배열하나를 만들어 원본데이터를 복사한다
	int[] copy = new int[5];
	System.arraycopy(ori, 0, copy, 0, 5);
	System.out.println("원래값 "+copy[1]);
	ori[1]=10;
	System.out.println("바뀐값 "+copy[1]);
	System.out.println(ori[1]);
	*/
	
	/*
	int[] ori={1,2,3,4,5};	
	int[] copy={6,7,8,9,10};
	System.arraycopy(ori, 2, copy, 3, 2);
	for(int i=0; i<copy.length; i++){
		System.out.println(copy[i]);
	}
	*/
	






	}

}
