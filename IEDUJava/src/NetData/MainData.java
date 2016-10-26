package NetData;

import java.io.*;

// 스트림에서 사용할 클래스는 반드시 직렬화 되어야한다.
public class MainData implements Serializable {
	// 이 클래스 안에는 공통적인 작업에 필요한 것만 사용한다.
	public int protocol;
	public String id;
	public String pw;
	public boolean isSuccess;
	// 이 클래스는 중심이 되는 클래스로 이 클래스안에 다른 클래스를 포함시켜서
	// 실제로 통심할 때 사용하는 클래스이다.
	public ChatData cData;
	public FileData fData;
}
