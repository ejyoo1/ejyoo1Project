package dynamic_beat_4;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;//JFrame을 사용하기 위해 패키지 선언함.(Ctrl+Shift+O)
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {
// 클래스 이름은 항상 대문자로
//JFrame : 자바에서 GUI 기반의 프로그램을 만들기위해서 기본적으로  JFrame(이미 존재하는 라이브러리)이라는것을 상속 받아야함.
	//눈으로 보고 즐기기 위한 것임.
	
	//더블버퍼링을 위한 것으로 전체화면에 이미지를 담기 위한 인스턴스임.
	private Image screenImage;
	private Graphics screenGraphic;
	
	//가져온 이미지를 담을 수있는 객체임.
	//메인 클래스 위치를 기반으로 해서 리소스 즉 인트로 백그라운드라는 이미지 파일을 얻어온 뒤에 이미지 인스턴스를 이미지 변수에 introbackground에 초기화를 시켜준다.
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
	//메뉴바라는 객체안에  해당 이미지가 들어가게됨.
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	
	//생성자 생성
	public DynamicBeat(){
		//클래스와 같은 이름을 가진 메서드
		setUndecorated(true);//실행 시 기본적으로 존재하는 메뉴바가 보이지 않게 함.
		setTitle("Dynamic Beat");//이름 설정
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//게임창을 1280*720으로 설정함.
		setResizable(false);//게임창은 사용자가 임의적으로 줄이거나 키울 수 없다.
		setLocationRelativeTo(null);//우리가 만든 창이 컴퓨터 중앙에 생성됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임을 종료했을 때, 프로그램 전체가 종료됨. 반드시 필요한 부분임
		setVisible(true);//우리가 만든 화면을 표시하게 하는 것임. 반드시 true 라고 해야됨.
		setBackground(new Color(0,0,0,0));//paintComponents를 했을 때 회색이 아닌 흰색으로 보이게 함.
		setLayout(null);//버튼이나 JLabel을 넣었을 때, 그 위치에 보이게 함.
		
		menuBar.setBounds(0,0,1280,30);
		add(menuBar);//메뉴바 삽입
		
		exitButton.setBounds(50, 50, 30, 30);
		//JButton 세팅해야함.(버튼 영역표시 제거하고 이미지만 표시함)
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		add(exitButton);//엑스 버튼 삽입
		
		Music introMusic = new Music("introMusic.mp3", true);//음악 재생되도록 선언
		introMusic.start();
	}
	
	//paint와 screenDraw 메서드를통하여 게임을 하는 도중에도 이미지가 출력되도록한것임.
	//하나의 약속된 메서드
	public void paint(Graphics g){
		//Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT라는 이미지를 생성하여 screenImage 라는 변수에 삽입하여틀 생성
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		//스크린 이미지(해상도 크기)를 이용해서 그래픽 객체를얻어옴
		screenGraphic = screenImage.getGraphics();
		//그래픽 객체를넣어 스크린 윈도우 호출 ?????이건뭔소리 -> 스크린드로우에서 이미지 해상도를 그려질 수 있도록 작업함. 
		screenDraw(screenGraphic);
		//screenDraw에서 삽입한 이미지를 가지고 사이즈에 맞추어
		//0,0의 위치에 스크린이미지(를 그려주는 것.(우리 게임창에 스크린 이미지가 그려지는 것임)
		g.drawImage(screenImage, 0, 0, null);
	}
	
	//화면에 그려주는 것임. 0,0에 특정 리소스를 그릴 수 있도록 세팅함.
	public void screenDraw(Graphics g){
		//이미지 리소스 정보가 담긴 인트로백그라운드를 전체 이미지 즉 스크린 이미지에 그려질 수 있도록 준비함.
		//페인트에서 이미지 객체까지 선언한다음 개별적으로 리소스를 담아 재가공해야 함.
		//drawImage는 단순한 그림을 그려주게 하는 함수
		g.drawImage(introBackground,0,0,null);
		paintComponents(g);//JFrame에 메뉴바를 추가하면 그것을 그려주는것을 의미한다. 
		/*
		 * 이미지를 그려주는 방법은 drawImage로 그리는방법이 있고 paintComponents로 그리는 방법이 있다.
		 * drawImage는 보통 역동적인 이미지 (언제든지사라질 수 있는 이미지 같은 경우에 사용)
		 * paintComponents는 메뉴바 같은 항상 고정된 이미지를 사용할때 쓰면 좋다. 버튼이나 고정된 이미지는 이것으로 함.
		 * */
		//paint는 JFrame을 상속받아 GUI게임에서 가장 첫번째로 화면에 그려주는함수이므로 약속된것임. 바뀌지 않음.
		this.repaint();//다시 페인트 함수를 불러오는것. 즉 전체 화면 이미지를 매 순간마다 프로그램이 종료되는 순간 까지 왓다갔다 그려주는것임.
	}
	
}
