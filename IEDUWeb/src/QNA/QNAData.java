package QNA;
//이 클래스의 목적은 여러 데이터를 하나로 묶기위한 것이다.
// 고로 이 클래스는 데이터를 기억할 준비만 하면 된다.

import java.sql.Date;

public class QNAData {
	public int qNO;
	public String qTitle;
	public String qWriter;
	public String qQuestion;
	public Date qDate;
	public int aNO;
	public String aWriter;
	public String aAnswer;
	public Date aDate;
}
