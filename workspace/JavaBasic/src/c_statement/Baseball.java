package c_statement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		/*
		 * 135 123 : 1S 1B 1O 531 : 1S 2B 0O 321 : 0S 2B 1O
		 * 
		 * 스트라이크 : 1이라는 숫자와 자리수도같을 때 볼 : 3이라는 숫자가 있지만 자리수가 다름 아웃 : 아예 없을 경우
		 */
		// 1부터 9까지의 숫자를 3개 발생시키고 겹치지 않게
		int random1 = (int) (Math.random() * 9) + 1;
		int random2 = (int) (Math.random() * 9) + 1;
		int random3 = (int) (Math.random() * 9) + 1;

		// 게임종료 flag
		boolean result = true;

		// 스트라이크가 3개가 될 때 까지 무한반복
		while (result) {
			//
			while (true) {
				random1 = (int) (Math.random() * 9) + 1;
				random2 = (int) (Math.random() * 9) + 1;
				random3 = (int) (Math.random() * 9) + 1;
				if(random1 != random2 && random1 != random3 && random2 != random3){
					break;
				}
			}
			int strike = 0;
			int ball = 0;
			int out = 0;

			System.out.print(random1 + "\t");
			System.out.print(random2 + "\t");
			System.out.println(random3);

			// 사용자 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 숫자 입력>");
			int userNum1 = Integer.parseInt(sc.nextLine());
			System.out.print("두번째 숫자 입력>");
			int userNum2 = Integer.parseInt(sc.nextLine());
			System.out.print("세번째 숫자 입력>");
			int userNum3 = Integer.parseInt(sc.nextLine());

			/*
			 * // 스트라이크==================
			 * 
			 * if (random1 == userNum1) { strike++; } if (random2 == userNum2) {
			 * strike++; } if (random3 == userNum3) { strike++; }
			 * 
			 * // 볼=====================
			 * 
			 * if (random1 == userNum2 || random1 == userNum3) { ball++; } if
			 * (random2 == userNum1 || random2 == userNum3) { ball++; } if
			 * (random3 == userNum1 || random3 == userNum2) { ball++; }
			 * 
			 * // 아웃==================
			 * 
			 * if (random1 != userNum1 && random1 != userNum2 && random1 !=
			 * userNum3) { out++; } if (random2 != userNum2 && random2 !=
			 * userNum1 && random2 != userNum3) { out++; } if (random3 !=
			 * userNum3 && random3 != userNum1 && random3 != userNum2) { out++;
			 * }
			 */

			// ==================

			if (random1 == userNum1) {
				strike++;
			} else if (random1 == userNum2 || random1 == userNum3) {
				ball++;
			} else{
				out++;
			}
			
			// ==================
			
			if (random2 == userNum2) {
				strike++;
			} else if (random2 == userNum1 || random2 == userNum3) {
				ball++;
			} else{
				out++;
			}
			
			// ==================
			
			if (random3 == userNum3) {
				strike++;
			} else if (random3 == userNum1 || random3 == userNum2) {
				ball++;
			} else{
				out++;
			}

			// 결과 : =======================
			System.out.println("스트라이크 : " + strike + " 볼 : " + ball + " 아웃 : "
					+ out);

			// 동기부여 ==============================
			if (strike == 3) {
				System.out.println("성공!!!!!!!!!야구게임을 종료합니다.");
				break;
			} else if (strike == 2) {
				System.out.println("오오!!! 조금만 더!!!!");
			} else {
				System.out.println("잘 생각해 보시오ㅋㅋ");
			}
			System.out.println("==========================");
		}
	}
}
