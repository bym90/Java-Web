package P_0509;

public class While_04 {
/*
 * 티코와 소나타가 자동차 경주를 한다
 * 티코는 1.35m/s 를 주행하고
 * 소나타는 1.84m/s 를 주행한다
 * 
 * 티코는 처음 출발할때 1000m앞에서 출발하도록 한다
 * 
 * 문제 과연 몇 초 뒤에 소나타는 티코를 앞지를까요?
 */
	public static void main(String[] args) {
		float tico = 1000.0F; //티코의 현재 위치
		float sonata = 0.0F; //소나타의 현재 위치
		int second = 0; //걸린 초를 기억할 변수
		while(sonata < tico){
			second = second + 1;
			tico = tico + 1.35F;
			sonata = sonata + 1.84F;
		}
		System.out.println(second + "초에 소나타가 티코를 앞지른다");

/*
 * 방파제를 건설, 총 방파제는 2844m이다
 * 일과시간에는 하루에 28.5m를 건설할 수 있다
 * 하지만 이로가가 끝나면 파도에 의해 14.1m가 손실된다		
 * 과연 몇일 뒤에 방파제는 완성될 것인가?
 * 단, 완성이 되면 일과가 끝나도 파도에 손실되지 않는다

		float bangpa = 0.0F;
		int day=0;
		while(bangpa < 2844.0F){
			day = day + 1;
			bangpa = bangpa + 28.5F;
			bangpa = bangpa - 14.1F;
		}
		 * System.out.println("총 걸린 일 수는 " + day + "일");
		 * 가끔은 반복 진행 도중에 반복 명령을 종료할 필요가 있는 경도 있다
		 * 이런 경우가 발생하면 조건식을 true로 주어서 무한루프로 돌린다
		 */
		
		float bangpa = 0.0F;
		int day=0;
		while(true){
			day = day + 1;
			bangpa = bangpa + 28.5F;
			if(bangpa >= 2844.0F){
				break;
			}
			bangpa = bangpa - 14.1F;
		}
		System.out.println("총 걸린 일 수는 " + day + "일");
	}

}
