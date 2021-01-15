package dynamic_beat_1;

public class Main {
	//public static 이란? 모든 프로젝트에서 공유할 수 있는 하나의 변수를 의미함. 
	//final 이란 ? 변하지 않는 변수를 의미함. 상수 = 상수는 모두 대문자로 정의함.
	//int 이란 ? 정수를 의미함.
	//SCREEN_WIDTH, SCREEN_HEIGHT : 우리가 만들 게임의 변수를 의미함.
	//해상도는 1280*720 임
	public static final int SCREEN_WIDTH = 1280; //너비
	public static final int SCREEN_HEIGHT =720; //높이
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//게임을 실행하기 위한 명령어
		
		new DynamicBeat();//DynamicBeat 클래스를 하나 생성
	}

}
