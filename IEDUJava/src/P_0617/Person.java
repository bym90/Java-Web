package P_0617;

import java.io.*;

public class Person implements Serializable {
	// 이 안에 외부장치로 나갈 데이터 역시 직렬화 되어야 한다.
	String name;
	int age;
	transient float height;// 이 데이터만 나가지않는다
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