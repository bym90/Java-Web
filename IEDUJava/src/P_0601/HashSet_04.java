package P_0601;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_04 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new MyClass04("ȫ�浿", 24));
		set.add(new MyClass04("�ھ���", 25));
		set.add(new MyClass04("ȫ�浿", 28));
		set.add(new MyClass04("�ھ���", 27));
		set.add(new MyClass04("ȫ�浿", 24));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			MyClass04 temp = (MyClass04) iter.next();
			System.out.println(temp.name + " : " + temp.age);
		}

	}

}

class MyClass04{
	String name;
	int age;
	MyClass04(){
		
	}
	MyClass04(String n, int a){
		name = n;
		age = a;
	}
	//��
	@Override
	//���� ������ ������̼� �����̶�� �θ��� ������(@�� �����ϴ� ����)
	//@Override ������ ������ ���� �Լ��� �������̵� �Լ��̴ٸ� �����ϰ�
	//�����ִ� ����� ���� ����
	//���� �� ���� ������ ����� �Լ��� �������̵� ��Ģ�� ��Ű�� ������
	//������ ���� �߻��ϵ��� �Ǿ��ִ�
	
	//�� Ŭ������ ���� Ŭ������ �����ޱ� ���ؼ��� equals()�������̵� �ؾ��Ѵ�
	//hashCode()�� �������̵� �ؾ��Ѵ�
	public boolean equals(/* MyClass04 this */Object obj){
		//�̸��� ���̰� ������ ���� Ŭ������ �������ְ� �ʹ�
		//���� ù��° ��� this
		//���� �ι�° ��� obj
		MyClass04 temp = (MyClass04) obj;
		if(this.name.equals(temp.name) && this.age == temp.age){
			return true;
		}
		else{
			return false;
		}
		//2. hashCode()�� �������̵��ؾ� �Ѵ�
			
		}
		@Override
			
			public int hashCode(){
			//�� �Լ����� ���� Ŭ������ �����ϰ� ������ ���� ���ڸ� ��ȯ�ؾ� �Ѵ�
			//���� �̸��� ���̰� ������ ����Ŭ������ �˷��ְ� �ʹ�
			//��Ʈ String�� ���� ���ڿ��̸� ���� HashCode���� �˷��ش�
			int code = name.hashCode();
			//���⿡ ���̸� ���ϸ� �����̸��� �������̴� �������ڰ� ����������̴�
			return code + age;
			}
		
		
		
}