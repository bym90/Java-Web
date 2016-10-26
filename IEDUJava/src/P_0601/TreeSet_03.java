package P_0601;

import java.util.*;
public class TreeSet_03 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new MyClass03("ȫ�浿", 24));
		set.add(new MyClass03("�ھ���", 27));
		set.add(new MyClass03("�嵶��", 21));
	
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			MyClass03 temp = (MyClass03) iter.next();
			System.out.println(temp.name + " : " +temp.age);
		}
	}

}

//�� Ŭ������ �����ؾ� �� �ʿ䰡 �����(TreeSet�� �־�� �ϸ�)
//1. Comparable ��ӹ޾Ƽ� �����
class MyClass03 implements Comparable{
	String name;
	int age;
	MyClass03(){
		
	}
	MyClass03(String n, int a){
		name = n;
		age = a;
	}
	//int compareTo(T o)�� �������̵� �Ѵ�
	@Override
	public int compareTo(/*MyClass03 this*/Object o){
		//�� �Լ����� �����ϴ� ����� ����
		//���� �� �Լ��� �񱳴���� ���;� �ϴµ� �񱳴���� �ϳ����̴�
		// 	   ������ �ϳ��� ã�ƾ��Ѵ�
		//��Ʈ �� �Լ��� ������ �ؾ��ϴ� Ŭ����
		// 	   ������ �ϳ��� this�� �������ִ�
		MyClass03 temp = (MyClass03) o;
		//���� ���̸� �������� �ؼ� ����
		
		int diff = this.age - temp.age;
		return diff;
		//���� �̸��� �������� �ؼ� ����
//		int diff = this.name.compareTo(temp.name);
//		return diff;
	}
}



//���� class Test00 {
//		int ban; �� ���
//		int no;  ��ȣ ���
//		String name;  �̸� ���
//		�ʿ��� ������ �Լ��ۼ��ϼ���
//		}
//���� Ŭ������ �̿��ؼ� ������ ������ �л��� TreeSet�� ����ϼ���
//�� ��������� �ݼ������ �ϸ� ������ ��쿡�� ��ȣ������� �Ѵ�


