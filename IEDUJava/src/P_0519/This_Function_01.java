package P_0519;
/*
 * ģ���� ������ �����ϴ� Ŭ������ ������
 * 
 * �� Ŭ������ new��Ű�� ���
 * 1. ����Ʈ
 * 2. �̸��� �ƴ� ����
 * 3. �̸��� ���̸� �ƴ� ����
 * 4. �̸��� ����, ������ �ƴ� ����
 * 5. �̸��� ����, ������ ��ȭ��ȣ�� �ƴ� ���·� �����Ͽ� ������
 */
public class This_Function_01 {

	public static void main(String[] args) {
		
	}

}


class Friend{
	String name;
	int age;
	boolean gender;
	String tel;
	
	Friend(){
		this("", 0, true,"");
	}
	
	Friend(String n){
		this(n, 0, true, "");
	}
	
	Friend(String n , int a){
		this(n, a, true, "");
	}

	Friend(String n , int a, boolean g){
		this(n, a, g, "");
	}
	
	Friend(String n , int a, boolean g, String t){
		name = n;
		age = a;
		gender = g;
		tel = t;
	}
	
}




/*
//This �Լ� ����
class Test005{
	Test005(){
		System.out.println("���");
		//this(5); �ٸ� ������ ���� ���ԵǸ� ����
		
	}
	Test005(int a){
		this(); //����
	}
	
	void abc(){
		//this();�Ϲ��Լ����� �� �� ���� �������Լ����� �� �� �ִ�
	}
}
*/