package P_0617;

import java.io.*;

public class Person implements Serializable {
	// �� �ȿ� �ܺ���ġ�� ���� ������ ���� ����ȭ �Ǿ�� �Ѵ�.
	String name;
	int age;
	transient float height;// �� �����͸� �������ʴ´�
	boolean gender;
	Score score;
	public Person() {
		
	}
	
	public Person(String n, int a, float h, boolean g){
		name = n;
		age = a;
		height = h;
		gender = g;
	}

}

class Score{
	int kor, mat, eng;
}