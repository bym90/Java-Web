package P_0525;

public class User_Exception_01 {

	public static void main(String[] args) {
		int age;
		age = -10;
		try{
		if(age<0){
			//�� ���� JVM���� ���ܷ� �����϶�� ��Ź�ϰ��� �Ѵ�
			throw new AgeException();
			//�̷��� �ϸ� JVM�� ���ܰ� �߻��� ������ �����ϰ� ����ó���� �õ��Ѵ�
		}
		}
		catch(Exception e){
			System.out.println("����"+ e);
		}
		System.out.println(age);
		
		
		
		
		
	}

}