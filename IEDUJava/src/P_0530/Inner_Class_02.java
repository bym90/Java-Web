package P_0530;

import java.net.StandardSocketOptions;

public class Inner_Class_02 {

	public static void main(String[] args) {
		//	�̰��� ���� �ʴ´�.
		//	Outer02.Inner02 in = new Outer02.Inner02();
		//	������ Outer02�� �������� �����Ƿ� Inner02�� ź���� �� ����.
		

		Outer02	out = new Outer02();
		out.a = 10;
		Outer02.Inner02 in = out.new Inner02(); 
		in.a = 20;
		
		//in.lmn();
		in.abc();
		
	}

}


class Outer02 {
	int		a;
	int		b;
	void abc() {
		//lmn(); �ٱ� Ŭ������ ����� ���� Ŭ������ ����� ����� �� ����
		Inner02 in = this.new Inner02();
		in.lmn();
		//�ٱ� Ŭ���� �ּҸ� ������ �ʰ� new��Ű�� ������
		//this�� �ڵ����� �ٱ⶧���̴�
		
	}
	void xyz() {
		System.out.println("���� �ٱ��� xyz()�̴�.");
	}
		class Inner02 {
			int a;
			void abc() {
				//a = 10; //�ڽ��� ����� �켱 ����Ѵٶ�� ��Ģ�� ����
						  //���� Ŭ������ ����� ����� ���̴�
				System.out.println(a); //20
				System.out.println(this.a); //20
				System.out.println(Outer02.this.a); //10
			}
			void lmn(){
				//�Ʒ����� ����� �ΰ��� ����� Outer Ŭ���� �Ҽ��̴�
				b = 20;
				xyz();
				System.out.println("B = " + b);
				//��ó�� ���� InnerŬ������ ���� ū Ư¡��
				//�ٱ� Ŭ������ ����� ��ġ �ڱ��ó�� ����ϴµ� �ִ�
			}
		}
}