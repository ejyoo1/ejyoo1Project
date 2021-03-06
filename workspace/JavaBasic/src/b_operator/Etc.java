package b_operator;

import java.util.Scanner;

public class Etc {
	public static void main(String[] args){
		/*
		 * 비트 연산자
		 * | & ^ ~ << >>
		 * - 비트 단위로 연산한다.
		 * 
		 * 기타 연산자
		 * .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
		 * (type) : 형변환
		 * ? : (삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * */
		
		//비트 연산자는 잘 사용하지 않음. 특수한 경우에만 사용함.
		//1byte : 01010101 (8개)
		System.out.println(10 | 15);// | : 둘다 0인 경우 0 그외 1
		//10 : 00001010
		//15 : 00001111
		//   : 00001111 ----> 15
		
		//삼항연산자(중요)
		
		int x = 10;
		int y =20;
		int result = x < y ? x : y; // int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2이면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은?"+gender);
		//위의 코드는 문제가 있다. 1이 아니면 무조건 여자가 되는것임
		//결과적으로 3이면 여자가 되는것이다.(주민번호 체계가 1,2 가 있다고 가정)
		//아래와 같이 수정할 수 있다.
		gender = regNo == 1 ? "남자" : (regNo == 2? "여자" : "확인불가");
		System.out.println("당신의 성별은?"+gender);
		
		//2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요
		Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.print("첫번째 숫자를 입력하세요 : ");
		int i = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 : ");
		int j = Integer.parseInt(sc.nextLine());
		
		System.out.println(i <j ? j : i);
		*/
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면여자를 출력해 주세요.
		//그 외의 숫자를 입력하면 확인 불가를 출력해주세요
		
		//1. 숫자를 입력받는다.
		System.out.print("성별을 판별할 주민번호 뒷번호의  첫번째 자리를 입력하세요 : ");
		int k = Integer.parseInt(sc.nextLine());
		
		// 비교한다.
		//항상 예외처리를 할것을 생각해야된다. 나의 코딩은 예외처리를 생각하지 않고 옳은 것만 생각한다.(개발자 오류)
		//String resultk = (k == 1) && (k == 3) ? "남자" : "여자";
		//String resultk = k == 1 || k == 3 ? "남자" : "여자";
		String resultk = k == 1 || k == 3 ? "남자" : (k == 2 || k == 4 ? "여자" : "확인불가");
		System.out.println("성별은 : " + resultk);
	}
}
