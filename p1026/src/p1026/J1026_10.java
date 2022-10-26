package p1026;

import java.util.Scanner;

public class J1026_10 {

	public static void main(String[] args) {
		// 주민번호를 입력받아 남자인지 여자인지 출력하시오.
		// 880101-1111111
		// 1,3-남자   2,4-여자
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 2;
		
		System.out.println("10과2의 숫자를 4칙연산을 합니다. 원하는 사칙연산을 입력하세요.");
		System.out.println("(예:+,-,*,/ 1개를 입력)");
		String str = scan.next();
		char ch = str.charAt(0);  //+,-,*,/
		switch(ch) {
		case '+':
			System.out.printf("%d + %d = %d\n",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n",a,b,a-b);
			break;
		}
		
		
		
		
		
		
//		System.out.println("주민번호를 입력해주세요.");
//		//880101-1111111
//		String str = scan.next();
//		char ch = str.charAt(7);
//		int num = ch-'0'; 
//		// 1,3 -> 남자  2,4 -> 여자
//		switch(ch) {
//		
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2': case '4':	
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("다시 입력하세요.");
//			break;
//		}

	}//main

}//class
