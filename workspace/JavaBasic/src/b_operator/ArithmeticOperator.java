package b_operator;

public class ArithmeticOperator {
	public static void main(String[] args){
		/*
		 * 산술 연산자
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, -- 
		 */
		//연산은 왼쪽부터오른쪽으로.
		//연산은 우선순위를 먼저 고려한다. 우선순위가 높은것부터 왼쪽부터 오른쪽
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		// 연산 순서 : 30* 40 -> / 50 -> % 60 -> 10 + 20 - 
		
		//나머지 연산
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력하세요.
		int operator1 = 10 + 20;
		int operator2 = 10 - 20;
		int operator3 = 10 * 20;
		int operator4 = 10 / 20;
		int operator5 = 10 % 20;
		
		System.out.printf("operator1 : %d \noperator2 : %d \n"
				+ "operator3 : %d \noperator4 : %d \noperator5 : %d \n",
				operator1,operator2,operator3,operator4,operator5);
		
		
		//복합연산자
		//변수에 저장되어 있는 값에 연산을 수행할 때 수행할연산자와 대입 연산자를 결합해 사용할 수 있다.
		result += 3;
		System.out.println(result);
		
		result = result + 3;
		System.out.println(result);
		
		result -= 5;
		System.out.println(result);
		
		result *= 2;
		System.out.println(result);
		
		//아래의 무장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		//result = result - 2 * 3;
		result -= 2*3;
		System.out.println(result);
		//result = result % 5;
		result %= 5;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 증가시킨다.
		int i = 0;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i); //i값을 먼저 증가시킨 뒤 출력하겠다.
		i = 0;
		System.out.println("i++ = " + i++);//i를 읽어와서 출력을 한 후 i를 증가시키겠다.
		System.out.println(i);
		
		//피연산자의 타입이 서로같아야만 연산이 가능하다.
		int _int = 10;
		double _double= 3.14;
		double result2 = _int + _double;//표현범위가 더큰 타입으로 형변환 됨.
		// 작은범위에서 큰범위로 형변환할때는 타입 입력을 생략이가능하다. 실제로 위에 있는 _int는 (double)_int와 동일하다.
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long;
		_int = _int + (int)_long;
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;//int 보다 작은타입은 int로 형변환 된다. _byte와 _short는 int가 된다.
		System.out.println(result3);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char;
		System.out.println((int)_char);//유니코드로 출력됨
		System.out.println((int)_char2);//유니코드로 출력됨
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		byte b = 127; //-128~127까지 표현함
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//다음 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456+654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 123456
		//5. 4번의 결과값 % 123456
		
		long testOperation1 = 123456 + 654321;
		testOperation1 *= 123456;
		testOperation1 /= 123456;
		testOperation1 -= 654321;
		testOperation1 %= 123456;
		
		System.out.println(testOperation1);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계 평균을 구해주세요.
		int kor = 113;
		int eng = 223;
		int m = 3323;
		
		int sum = kor + eng + m;
		//double avg = sum / 3; sum은 'int' 3도'int' 그래서 결과가 int라 double 타입으로만들기위해서는 하나를 double 타입으로 바꿔줘야한다.
		// 따라서 아래코드를 사용한다.
		double avg = sum / 3.0;
		System.out.println("합계 : "+sum+"평균 : "+avg);
		
		//반올림
		avg = Math.round(avg); //소수점 첫째자리에서 반올림
		System.out.println("반올림 : " + avg);
		
		//소수점표현
		double avg2 = sum / 3.0;
		avg2 = Math.round(avg2 * 10) / 10.0;//소수점을 옮기고 다시 제자리로돌린다.
		System.out.println("소수점 둘째자리에서 반올림하여 첫째자리까지 표현 : " + avg2);
	}
}
