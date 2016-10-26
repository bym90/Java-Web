package P_0616;

/*
 * 시 한수를 파일에 저장해보자.
 */
import java.io.*;

public class PrintStream_01 {

	public PrintStream_01() {
		FileOutputStream fout = null;
		PrintStream ps = null;
		try {
			// 먼저 타겟 스트림을 개설한다.
			fout = new FileOutputStream("src/P_0616/PrintStream_01");
			// 필터와 연결한다.
			ps = new PrintStream(fout);
			// ps = new Print("src/P_0616/PrintStream_01"); 가능
			ps.println("시간은 끊임없이 흐르지 그에 따라 난 내 발을 구르지");
			ps.println();
			ps.println("죽을힘으로 달려도 죽을지언정 절대로 땅에 내 무릎이");
			ps.println("닿지 아니하게 할거야 내 무릎은 오직 주님 앞에서만");
			ps.println("꿇을 것이고 내 눈은 언제나 보이지 않는 미래를 째려봐");
			ps.println();
			ps.println("그 때를 위해 내가 무엇을 해야 하나 그 해답의 첫 번째");
			ps.println("기도 두 번째는 펜을 쥐고 세 번째는 꿈을 꿔 네 번짼");
			ps.println("의심 없이 믿고 또 믿어 그리고 기대함으로 Just wait");
			ps.println("그날의 시간을 지금 가져왔다 생각하고 행동해");
			System.out.println("완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new PrintStream_01();

	}

}
