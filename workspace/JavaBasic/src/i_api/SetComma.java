package i_api;

import java.util.Arrays;
import java.util.Scanner;

public class SetComma {
	//숫자를 입력받아 입력받은 숫자 3자리 마다 콤마(,)를 붙여 출력해주세요.
	//1,234,567
	public static void main (String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		//문자열 뒤집기
//		int count = 0;
//		String rev = "";
//		for(int i = str.length () - 1 ; 0 <= i ; i--) {
//			if(count == 3) {
//				rev += ",";
//				count = 0;
//				rev += str.charAt (i);
//				count++;
//			}else {
//				rev += str.charAt (i);
//				count++;
//			}
//		}
//		System.out.println (rev);
//		
//		
//		for(int i = rev.length()-1 ; i >= 0; i--) {
//			char charAt = rev.charAt (i);
//			System.out.print (charAt);
//		}
		/*
		Scanner sc = new Scanner(System.in);
		String userValue = sc.nextLine();
	    for(int i = userValue.length () - 1 ; 0 <= i ; i--) {
	    	if(i > 0 && (i%3) == 0) {
	    		System.out.print (userValue.charAt (userValue.length() - i - 1) + ",");
	    	}else {
	    		System.out.print (userValue.charAt (userValue.length() - i - 1) );
	    	}
	    		
	    }
	    */
		
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String number2 = "";
		int count = 0;
		for(int i = number.length() - 1 ; i >= 0 ; i--) {
			number2 = number.charAt (i) + number2;
			count++;
			if(count % 3 == 0 && count != number.length ()) {
				number2 = "," + number2;
			}
			System.out.println (number2);
		}
	    
	}

}

