package b_operator;

public class LogicalOperator {
	public static void main(String[] args){
		/*
		 * 논리연산자
		 * &&(AND), ||(OR), !(NOT)
		 * 피연산자로 boolean만 허용한다.
		 * */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;
		//||보다 &&의 우선순위가 높다.
		// && : 연산 결과가 모두 1일때 결과는 1 나머지는 0 -> 0/1 -> 0, 0/0 -> 0, 1/1 -> 1
		// || : 연산 결과가 하나라도 1일 때 결과는 1 0/0일때만 0
		
		//1 : true , 0 : false
		System.out.println(b);
		
		//Not연산자
		// 이런 연산자 사용은 에러임 -> b = !x < y;
		b = !(x < y);
		System.out.println(b);
		
		//논리연산자는 효율적인 연산을 하게끔 하는 특징이 있다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;//true (1번만 수행)
		b = true && false;//false
		b = false && true;//false (1번만 수행) 앞에만 수행해서 노란줄이 생성된것임.
		b = false && false;//false (1번만 수행) 앞에만 수행해서 노란줄이 생성된 것임.
		// 노란줄은 문제가 될만한요소임.
		
		b = true || true;//true (1번만 수행)
		b = true || false;//true (1번만 수행)
		b = false || true;//true 
		b = false || false;//false 
		
		//논리연산자 작성 시 문제가 될 수 있는 경우
		int a = 10;
		b = a < 5 && 0 < a++; 
		//논리연산자 속에 a 라는 것을 비교한 후 a의 값이 1증가해야하지만.
		//앞에 있는 비교 연산자가 false이기 때문에 뒤에 있는 연산을 수행하지 않은것임.
		System.out.println(a);
		System.out.println(b);
		
		//다음과 같이 변경하면 a증감도 할 수 있고 b 도 도출할 수 있다. 
		//증감연산자와 논리연산자를 이중으로 사용해야되는경우에는, 증감연산자를 앞에다 쓰도록 한다.
		b = a++ < 5 && 0 < a;
		System.out.println(a);
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고, x가 10보다 작다.
		b = x > y || x < 10;
		//2. x가 짝수이고, x가 y의 배수이다.
		b = x % 2 == 0 || x % y == 0;
		//3. x가 3의 배수이거나, x가 5의 배수이다.
		b = x % 3 == 0 && x % 5 == 0;
	}
}
