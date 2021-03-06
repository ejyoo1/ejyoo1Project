package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * < > <= >= == !=
		 * 문자열 비교 : equals()
		 * */
		
		int x = 10;
		int y = 20;
		boolean b;
		b = x < y;//비교 연산의 연산 결과는 boolean이다.
		System.out.println(b);
		
		b = x <= y - 15; //산술연산 후 비교연산을 수행한다.
		System.out.println(b);
		
		//아래의 연산 결과는 true임 변수라는 것을 선언하면 다른 주소값을 갖는것이원칙인데
		// true 로 된 이유는, 자바에서 str1, str2의 값이 같기때문에
		// 자동으로 메모리 절약을 하기 위해 같은 주소로 저장한 것이다. 
		//str2의 값이다르면 다른 메모리의 주소를 참조하기때문에 결과값이 false로 변한다.
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2;//문자열의 내용이 아닌주소를 비교한 것이다.
		System.out.println(b);
		
		//String의 내용을 비교하기 위해서는 equals()데서드를 사용한다.
		b = str1.equals(str2);
		System.out.println(b);
		b = !str1.equals(str2);
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		int num1 = 20;
		int num2 = 25;
		//1. x가 y보다 크다.
		boolean eResult1 = num1 > num2;
		//2. x + 5와 y는 같다.
		boolean eResult2 = num1 + 5 == num2;
		//3. y는홀수이다.
		boolean eResult3 = num2 % 2 == 1;
		//4. "기본형"과 "참조형"은 다르다.
		boolean eResult4 = !"기본형".equals("참조형");
		
		System.out.println(eResult1+","+eResult2+","+eResult3+","+eResult4);
	}

}
