package dynamic_beat_1;
import javax.swing.JFrame;//JFrame을 사용하기 위해 패키지 선언함.(Ctrl+Shift+O)

public class DynamicBeat extends JFrame {
// 클래스 이름은 항상 대문자로
//JFrame : 자바에서 GUI 기반의 프로그램을 만들기위해서 기본적으로  JFrame(이미 존재하는 라이브러리)이라는것을 상속 받아야함.
//눈으로 보고 즐기기 위한 것임.
	//생성자 생성
	public DynamicBeat(){
		//클래스와 같은 이름을 가진 메서드
		setTitle("Dynamic Beat");//이름 설정
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//게임창을 1280*720으로 설정함.
		setResizable(false);//게임창은 사용자가 임의적으로 줄이거나 키울 수 없다.
		setLocationRelativeTo(null);//우리가 만든 창이 컴퓨터 중앙에 생성됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임을 종료했을 때, 프로그램 전체가 종료됨. 반드시 필요한 부분임
		setVisible(true);//우리가 만든 화면을 표시하게 하는 것임. 반드시 true 라고 해야됨.
	}
}
