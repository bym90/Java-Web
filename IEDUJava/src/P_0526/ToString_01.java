package P_0526;

public class ToString_01 {
		/*static int asd(){
			return 5;
		}
*/
	public static void main(String[] args) {
		//System.out.println(asd());
		Test021 t = new Test021();
		System.out.println(t); // ���⵵ �ڵ����� toString()�� ����ȴ�
		System.out.println(t.toString());
	}

}

//�ּҸ� ����Ҷ� Ŭ������ ������ �ٸ�������� �˷��ְ� ������

class Test021{
	int garo = 100;
	int sero = 200;
	public String toString(){
		return "�� Ŭ������ ������" + (garo * sero) + "�簢���Դϴ�";
	}
	
}