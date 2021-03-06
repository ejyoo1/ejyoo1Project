package a_variable;//클래스 위치

import java.util.Scanner;

public class Variable {//클래스 명

	public static void main(String[] args) {//main 메서드 시작
		//메서드이름 : main
		//메서드 특징 : 이름뒤에()가 붙음
		//여러가지 명령이 존재
		//역할 : 프로그램의 시작과 끝을 담당
		//'//' 한줄 주석을 의미함. (Ctrl+Shift+'c')
		//'/**/' 범위 주석을 의미함. 
		//범위주석의 적용은 범위를 잡은 후 (Ctrl+Shift+'/') 
		//범위주석의 해제는 커서를 아무곳이나 놓고 (Ctrl+Shift+'\')
	
		// 변수 ? 데이터를 담는 그릇
		// 기본형 단위
//		* 정수형 : byte(1), short(2), int(4), long(8)
//		* 실수형 : float(4), double(8)
//		* 문자형 : char(2)
//		* 논리형 : boolean(1)
		
		int x; //변수 선언 : 변수를 만든다.
		/*double x;*/ //블럭{}에서 변수 이름은 중복될 수 없다.
		double y;
		
		// 대입 연산자 : 오른쪽의 값을 왼쪽의 변수에 저장 
		// 변수에 값을 저장하는 것을 초기화 라고 함.
		x = 10;
		y = 3.14;
		
		int abc = 30; //변수의 선언과 초기화를 동시에 함
		long l = 40L; //접미사를 붙이는이유? 정수에 아무것도 붙어있지 않으면 int 타입이 됨.
		float f = 5.5F; //접미사를 'f'를 붙여야 Float타입이 된다. 붙이지 않으면 실수는 double 타입이 됨.
		// 접미사 붙일때 되도록이면 대문자를 사용한다.
		char c = '한';
		//char은 무조건 한글자를 넣어야함.(아무것도 넣지않거나 두글자이상 넣으면 컴파일에러)
		boolean b = false; //true, false
		
		// 8가지 기본형 타입을 모두 사용을하여 8개의 변수를 선언하고 값을 넣어 초기화한다.
		boolean test1 = false; //1바이트
		char test2 = 'A'; // 2바이트(한글은 무조건 2바이트!)
		byte test3 = 1; // 1바이트
		short test4 = 2; // 2바이트
		int test5 = 3; // 4바이트
		long test6 = 4L; // 8바이트
		float test7 = 3.14F; // 4바이트(정확도:소수점7자리수까지)
		double test8 = 3.14; // 8바이트(정확도:소수점15자리수까지)
		
		x = 20; //변수의 값을 변경한다. 기존에 저장되었던 10은 사라진다.(덮어쓰기)
		y = 5.5;
		
		//위에서 만든 변수의 값8개를 새로운 값으로 변경하시오.
		test1 = true;
		test2 = 'B';
		test3 = 10;
		test4 = 9;
		test5 = 8;
		test6 = 7L;
		test7 = 3.15F;
		test8 = 3.15;
		
		//콘솔창에 변수 값을 출력하시오.
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test6);
		System.out.println(test7);
		System.out.println(test8);
		
		//문자열을 표현하기 위한 String 데이터 타입
		String str = "문자 여러개..."; //String이라는 이름을 가진 클래스
		//문자열은 다른 데이터형과 결합되면 문자열이 된다.
		System.out.println(str+(50+30));
		System.out.println(50+30+str+(50+30));
		
		//형변환
		// 다른 타입을변경하는것을형변환이라고 하며 영어로 typecasting이라고 한다.
		int small = 10;
		long big = 10L;
		
		small = (int)big;//형변환이 높은것에서 작은것으로 갈때는 타입을 명시해줘야 한다.
		big = small;//형변환이 낮은것에서 높은것으로 갈 때는 타입이 자동으로 변경된다.
		//이것은 즉 '데이터 손실'이 있을수도 있는 경우에만 명시적으로 형변환을 해야된다.
		
		//명명규칙
		//일부 특수문자, 예약어, 변수 첫글자가 숫자 는 변수 이름으로 사용할 수 없다.
		//변수 이름은 낙타식표기법을사용한다.처음에 소문자로 시작했다가 두번째 단어부터 앞글자를 대문자로 만든다. (sampleProjectTest)
		//클래스 이름은 앞글자도 대문자로 한다. (SimpleProjectTest)
		
		//상수
		//값을 변경할 수 없는 변수'final'이라는 예약어를 사용함.
		//리터럴에 의미를 부여하기위해 사용한다.
		//하드코딩이 되어있는 경우, 앞으로도 변할일이 없는 것일 때, 의미를 부여하기위해 사용함.
		final int MAX_NUMBER =10;
		
		//출력
		System.out.print("a");//줄바꿈을 하지 않는다.
		System.out.print("c \n");//"\n"은 탈출문자. '\'를 사용함으로써 문자였던n 가 다른 의미를 부여하도록 함.
		System.out.print("d \t e");
		System.out.println("b");// 줄바꿈을 한다.
		System.out.printf("문자열 : %s, 숫자 : %d","단일",1);
		System.out.println();
		
		//입력
		//입력을 받기위해서는 클래스의 도움을 받아야함.
		//해당 클래스를 사용하기 위해서는 상단에 import java.util.Scanner; 위치를알려줘야한다.
		//import 자동으로 하는 단축키 Ctrl+Shift+'O'
		Scanner sc = new Scanner(System.in);
		//스캐너 안에있는 함수인 System.in을 사용함. 
		//System.in은 사용자에게 입력을 받을 수있는 함수임. 
		//다른 클래스도 있지만. 스캐너가 제일 간단한입력방법임.
		/*System.out.println("입력하세요:");*/
		//사용자가 입력을 할 때까지 프로그램이 멈추게 된다.
		//사용자가 입력을 한 후 Enter를 클릭하면 프로그램이 다시 시작된다.
		/*String userInsert = sc.nextLine();//nextLine이라는 메서드 호출
		System.out.println(userInsert);*/
		//숫자를 입력받고 싶은 경우
		/*System.out.println("숫자입력");
		int userInsert1 = sc.nextInt();
		System.out.println(userInsert1);
		
		System.out.println("입력하세요:");
		String userInsert = sc.nextLine();
		System.out.println(userInsert);
		System.out.println("입력끝");*/
		//nextInt를 먼저 입력을 받은 후 nextLine이 동작하지 않는 버그가 존재한다.
		//따라서 nextInt를 사용하지 않고 nextLine으로 받은 후 int 형으로 캐스팅해야한다.
		/*System.out.println("숫자입력");
		int number = Integer.parseInt(sc.nextLine());//문자열을 숫자로 바꿔줌
		//문자열은 캐스팅으로 변환할 수없음 따라서 위의 문장을 사용하여야 함.
		System.out.println(number);*/
		
		//변수를 만들고 그 변수에 본인이름을 저장한다.
		String myName;
		
		//방금만든 변수를 초기화할것이다. 입력을 받아서 초기화한다.
		System.out.println("당신의 이름을 입력하세요");
		myName = sc.nextLine();
		
		//나이를 저장할 변수를생성한다.
		int myAge;
		
		//나이의 변수를 초기화하는데 입력을 받아서 초기화 한다.
		System.out.println("당신의 나이를 입력하세요");
		myAge = Integer.parseInt(sc.nextLine());//다음한줄을 입력받겠다.
		
		System.out.println("당신의 이름은 : " + myName + "\t 당신의 나이는 : " + myAge);
		
		
	}//main 메서드 종료
}