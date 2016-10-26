package P_0708;
/*
 * 오늘 수업의 핵심으로 이 클래스를 이용해서 클라이언트가 준 데이터를
 * 서버에 전달하도록 할 예정이다.
 * 
 * 이처럼 클라이언트가 준 정보를 서버에 전달하는 역할을 하는 클래스를 우리는
 * 데이터 빈 클래스라고 부른다.
 * 
 * 데이터 빈 클래스가 되기 위해서는 3가지 요소를 갖추어야 한다.
 * 1. 데이터를 기억할 변수
 * 	  클라이언트가 준 데이터를 기억할 변수를 만들면 된다.
 *    변수의 이름은 마음대로 지으면 되는데
 *    불문율 변수의 이름은 name속성값으로 한다.
 * 2. 데이터를 받을 함수
 * 	  setXxx()의 형태를 갖추어야 한다.
 *  	Xxx의 1. name속성값과 동일해야 한다.
 *  		  2. 첫글자는 반드시 대문자이어야 하고 나머지 문자는 name속성과 동일해야 한다.
 *    예> <input type="text" name="age">
 *    		setAge()
 *    예> <input type="text" name="nowAge">
 *    		setNowage()
 * 3. 데이터를 전달할 함수
 * 	  getXxx() 형태를 갖추어야 한다.
 * 	  Xxx의 규칙은 set과 동일하다.
 */
public class JoinData {
	// 접근지정자는 반드시 private가 될 필요는 없지만
	// 객체지향원리에 따라서 변수는 감추고 대신 변수를
	// 사용할 함수를 제공한다 - 은닉화
	private String id;
	private String pw;
	private String name;
	private String tel;
	// 데이터 형태에 따라서 직접 원하는 형태로 사용할 수 있다.
	private	 int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// 데이터 빈 클래스를 상요하면 한가지 더 좋은점
		// 데이터의 무결성 검사를 할 수 있다는 사실이다.
		if(age < 0){
			this.age = -age;
		}
		else{
			this.age = age;
		}
	}
}
