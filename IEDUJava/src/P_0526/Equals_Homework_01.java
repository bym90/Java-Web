package P_0526;

/*
   int garo, sero, area; ������ ���� Ŭ������ �����
1) new Sagak()
   new Sagak(int g, int s);�� ������� new�� �����ϵ��� ������ �Լ��� �����Ѵ�
2) ������ ����ϴ� calcArea() �Լ��� �����
3) ������ ������ ���� Ŭ������ �����ϵ��� equals �Լ��� �������̵��ϼ���
*/
public class Equals_Homework_01 {

	public static void main(String[] args) {
		sagak s1 = new sagak(10, 20);
		sagak s2 = new sagak(20, 10);
			
			s1.calcArea(s1.garo, s1.sero);
		
			s2.calcArea(s2.garo, s2.sero);
			
		if (s1.equals(s2)) {
			System.out.println("����");
		}
		else{
			System.out.println("�ٸ���");
		}

	}

}

class sagak{
	int garo;
	int sero;
	int area;
	
	sagak(){
		
	}
	sagak(int g, int s){
		garo=g;
		sero=s;
	}
	void calcArea(int g, int s){
		area = g * s;
	}
	
	
	public boolean equals(Object obj){
		sagak temp = (sagak) obj;
		
		if(this.area==temp.area){
			return true;
		}
		else{
			return false;
		}
				
				
	}
	
}