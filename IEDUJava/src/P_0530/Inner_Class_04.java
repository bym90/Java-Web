package P_0530;

public class Inner_Class_04 {

	public static void main(String[] args) {
		MyTest03 t = new MyTest03(){
			public String toString(){
				return "��������Ŭ����";
			}
		};
		//�� Ŭ������ ����� �� Ŭ������ ��³����� �����ϱ� ���ؼ���
		// toString()�� �������̵��Ͽ� ����� �ٲ��
			System.out.println(t);
	}

}

class MyTest03{
	
}

/*class YouTest03 extends MyTest03{
	public String toString(){
		
	}
}*/