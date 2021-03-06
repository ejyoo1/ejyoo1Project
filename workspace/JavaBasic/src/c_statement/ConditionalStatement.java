package c_statement;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		/*
		 * 조건문 - if 문 - switch문
		 * 
		 * if문 - if(조건식){}: 조건식의 결과가 true이면 블럭안의 문장을 수행한다. - else if(조건식){} :
		 * 다수의 조건이 필요할 때 if 뒤에 추가한다. - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해
		 * 추가한다.
		 */

		int a = 1;
		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 0) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		// if 문은 true 조건이 존재하는 경우 조건문을 빠져 나가게 되고 false 조건이 되는 경우에만 else if를
		// 수행한다.(true인것 딱 하나만 수행)
		// 모두 true 조건 인 경우에는 맨 처음의 true인것만 수행하고 빠져나가게 된다.
		// 모두 false 조건인 경우에는 else 문을 실행하게 된다.
		if (a == 1) {
			System.out.println("a가 1일 때 실행된다.");
		} else if (a == 2) {
			System.out.println("a가 2일 때 하고싶은 것");
		} else if (a == 3) {
			System.out.println("a가 3일 때 하고싶은 것");
		} else {
			System.out.println("이외의 경우에 하고싶은 것");
		}

		// 조건을 한묶음으로 사용하기 위해서는 반드시 else if를 사용해야 한다. 둘중에 하나만 실행됨.
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		} else if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 시험점수가 60점 이상이면합격 그렇지 않으면 불합격
		int score = 50;

		if (score <= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// 성적에 등급을 부여하는프로그램을 만들어 봅시다.
		score = 80;
		String grade = null;

		if (100 >= score && score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + grade + "입니다.");

		// 학점에 '+' '-' '0' 추가
		score = 62;
		grade = null;
		if (100 >= score && score >= 90) {
			grade = "A";
			if (score >= 97) {
				grade += "+";
			} else if (score >= 93) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87) {
				grade += "+";
			} else if (score >= 83) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77) {
				grade += "+";
			} else if (score >= 73) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67) {
				grade += "+";
			} else if (score >= 63) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + grade + "입니다.");
		// 자동정렬 단축 키 : Ctrl + Shift + 'F'
		
		
		/*
		 * switch문
		 * switch(int/String){case 1: break;}
		 * - boolean 타입의 결과를 가지는 논리연산자는 올 수 없다.
		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허옹) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - if 문보다 switch 가 컴파일 속도 더 빠르긴 하다.(실제로는 많이 없음 또한 int와 String만 오기때문에 제한적 상황이발생함.)
		 * */
		
		a = 1;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고 싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고 싶은 것");
			break;
		case 3:
			System.out.println("a가 3인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}
		
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고 싶은 것");
			break;
		default:
			System.out.println("이외의 경우에 하고 싶은 것");
		}
		
		//주어진 월에 해당하는 계절을 출력해 봅시다.
		//조건식에는 변수나 조건식을 사용할수 있다.
		//케이스뒤에는리터럴이나 상수만와야한다.
		int month = 1;
		String season = null;
		switch(month){
		case 12:
		case 1:
		case 2:
			season ="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season ="봄";
			break;
		case 6:
		case 7:
		case 8:
			season ="여름";
			break;
		case 9:
		case 10:
		case 11:
			season ="가을";
			break;
		}
		
		System.out.println("현재 계절은? "+season);
		
		score = 65;
		grade = null;
		switch(score / 10){
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("학점은 ? "+grade);
		
		/*
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>");
		int userNumber = Integer.parseInt(sc.nextLine());
		
		if(userNumber==0){
			System.out.println("0입니다");
		}else{
			System.out.println("0이 아닙니다.");
		}
		*/
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		/*Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>");
		int userNumber = Integer.parseInt(sc.nextLine());
		
		if(userNumber%2==0){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}*/
		
		/*
		//점수 3개를 입력받아 총점, 평균, 등급을출력해주세요.
		//평균은 소수점 1자리까지
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 1 입력>");
		int userScore1 = Integer.parseInt(sc.nextLine());
		System.out.print("점수 2 입력>");
		int userScore2 = Integer.parseInt(sc.nextLine());
		System.out.print("점수 3 입력>");
		int userScore3 = Integer.parseInt(sc.nextLine());
		int total = userScore1 + userScore2 + userScore3;
		//total을 나눌때 3.0이 아닌 3으로 나눈 경우 연산 결과가 int 가 되어 소수점을 버리게 된다.
		//따라서 나눌 때 소수점으로 나누어야 하며,
		//Math.round는 무조건 소수점 첫번째 자리수에서 반올림 하므로 10을 곱한뒤 10을 다시 나누어야 하고, 이때 소수가 아닌 수로 연산을하면 소수점을 버리므로 10.0으로나누어야 한다.
		//곱하기는 소수점 첫번째 자리수까지 표현하기 위해 소수점 두번째 자리 이후는 버려도 되므로 10.0이 아닌 10으로 하였다.
		//10의 자리에 10.0을 써도 되지만무의미 하다.이미 소수점을 total/3.0에서 연산한 결과가 소수점 첫째짜리까지 표현한 정수만 남기때문에
		//10.0으로 곱한 연산 결과는 무조건 '정수.0'이 된다. 따라서 10.0을 쓰는것은 무의미 하다.
		double avg = Math.round((total / 3.0) * 10) / 10.0;
		
		
		if (100 >= avg && avg >= 90) {
			grade = "A";
			if (avg >= 97) {
				grade += "+";
			} else if (avg >= 93) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (avg >= 80) {
			grade = "B";
			if (avg >= 87) {
				grade += "+";
			} else if (avg >= 83) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (avg >= 77) {
				grade += "+";
			} else if (avg >= 73) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else if (avg >= 60) {
			grade = "D";
			if (avg >= 67) {
				grade += "+";
			} else if (avg >= 63) {
				grade += "-";
			} else {
				grade += "0";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 총점 : " + total + " 당신의평균 : " + avg + " 학점 : " + grade);
		*/
		
		/*
		//랜덤 발생
		//Math.random() : 0.0 ~ 0.9999999999999....(1.0 미만의랜덤 수 발생)
		int random = (int)(Math.random() * 100) + 1;//1.99999...~100.99999까지의 난수를 발생하고 int 형으로 받으면 소수점버림
		System.out.println(random);
		*/
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요
		int random1 = (int)(Math.random() * 100) + 1;
		int random2 = (int)(Math.random() * 100) + 1;
		int random3 = (int)(Math.random() * 100) + 1;
		int temp = 0;
		System.out.println("변경 전 random1 : " + random1 + " random2 : " + random2 + " random3 : " + random3);
		//else if 를 쓰지않는 이유는 무조건 3가지 경우의 수는 꼭해야하기 때문이다.
		//여기서부터
		if(random1>random2){
			temp = random1;
			random1 = random2;
			random2 = temp;
		}
		if(random1>random3){
			temp = random1;
			random1 = random3;
			random3 = temp;
		}//여기까지 하면 가장 작은수를 판별할 수있음
		// 이이후부터 중간 수를 구할 수있음.
		if(random2>random3){
			temp = random2;
			random2 = random3;
			random3 = temp;
		}
		System.out.println("random1 : " + random1 + " random2 : " + random2 + " random3 : " + random3);
		
		/* 선생님 코드
		int random1 = (int)(Math.random() * 100) + 1;
		int random2 = (int)(Math.random() * 100) + 1;
		int random3 = (int)(Math.random() * 100) + 1;
		
		System.out.println("변경 전 random1 : " + random1 + " random2 : " + random2 + " random3 : " + random3);
		//여기서부터
		if(random1>random2){
			int temp = random1;
			random1 = random2;
			random2 = temp;
		}
		if(random1>random3){
			int temp = random1;
			random1 = random3;
			random3 = temp;
		}//여기까지 하면 가장 작은수를 판별할 수있음
		// 이이후부터 중간 수를 구할 수있음.
		if(random2>random3){
			int temp = random2;
			random2 = random3;
			random3 = temp;
		}
		System.out.println("random1 : " + random1 + " random2 : " + random2 + " random3 : " + random3);
		*/
	}
}
