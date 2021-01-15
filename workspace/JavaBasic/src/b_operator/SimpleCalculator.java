package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		
		//두개의 숫자와 연산자를 입력받아 연산 결과를 알려주는 프로그램을 만들어주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산을 할 첫번째 숫자를 입력하세요 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("연산을 할 두번째 숫자를 입력하세요 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println("어떤 연산을 수행하시겠습니까?"
				+ "(+(더하기), -(빼기), /(나누기), *(곱하기), %(나머지)");
		String userCalculator = sc.nextLine();
		
		String result = 
			userCalculator.equals("+")? ""+(num1+num2): 
			(userCalculator.equals("-")? ""+(num1-num2):
			(userCalculator.equals("/")? ""+(Math.round((num1/num2)*10)/10.0):
			(userCalculator.equals("*")? ""+(Math.round((num1*num2)*10)/10.0):
			(userCalculator.equals("%")? ""+(num1%num2):"확인불가")
			)));
		
		System.out.println(result);
		
		/*
		 * 선생님 코드
		 * int result = op.equals("+") ? x + y 
		 * : op.equals("-") ? x - y
		 * : op.equals("*") ? x * y
		 * : op.equals("/") ? x / y
		 * : x % y;
		 * 
		 * System.out.println(x + " " + op + " " + y + " = " + result);
		 * */
		
		/*
		char userCalculator2 = sc.nextLine().charAt(0);
		
		System.out.println(userCalculator2 == '+' ? num1+num2: 
			(userCalculator2 == '-'? num1-num2:
			(userCalculator2 == '/'? Math.round((num1/num2)*10)/10.0:
			(userCalculator2 == '*'? Math.round((num1*num2)*10)/10.0:
			(userCalculator2 == '%'? num1%num2:"확인불가")
			))));
		

		
		System.out.println(
				userCalculator.equals("+")? num1+num2: 
			(userCalculator.equals("-")? num1-num2:
			(userCalculator.equals("/")? Math.round((num1/num2)*10)/10.0:
			(userCalculator.equals("*")? Math.round((num1*num2)*10)/10.0:
			(userCalculator.equals("%")? num1%num2:"확인불가")
			))));
			
		*/
			
	}

}
