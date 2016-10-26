package P_0530;

import	java.text.*;
public class Formalization_04 {

	public static void main(String[] args) {
		//출력할 데이터가 완성되었다고 가정하자.
		Object[]	data = {"홍길동", 'M', 54, 178.25F};

		MessageFormat mf = 
	new MessageFormat("당신의 이름은 {0}이구 나이는 {2}이며 성별은 {1}이네요 그리고 키는 {3}이군요");
			String	result = mf.format(data);
			System.out.println(result);
	}

}

