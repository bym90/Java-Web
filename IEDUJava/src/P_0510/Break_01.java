package P_0510;

public class Break_01 {

	public static void main(String[] args) {
		
		
		ONE:
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j==3){
					//break; //(1)
					break ONE; //(2)
				}
				System.out.println("I= " +i+ "J= " +j);
			}//(1)
		}//(2)
		
	
	
	
	
	
	}

}
