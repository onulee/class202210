package p1027;

import java.util.Scanner;

public class J1027_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length1 = 0, length2=0;
		
		// 넓이 구하는 프로그램
		System.out.println("[넓이 구하는 프로그램 ]");
		System.out.println("1.정사각형 넓이");
		System.out.println("2.삼각형 넓이");
		System.out.println("3.마름모 넓이");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("가로길이를 입력하세요.");
			length1 = scan.nextInt();
			System.out.println("세로길이를 입력하세요.");
			length2 = scan.nextInt();
			System.out.printf("정사각형 넓이 : %d ㎠ ", length1*length2);
			break;
			
		case 2:
			System.out.println("밑변길이를 입력하세요.");
			length1 = scan.nextInt();
			System.out.println("높이를 입력하세요.");
			length2 = scan.nextInt();
			System.out.printf("삼각형 넓이 : %.2f ㎠ ", length1*length2*0.5);
			break;
		
		case 3:
			System.out.println("대각선길이를 입력하세요.");
			length1 = scan.nextInt();
			System.out.println("대각선길이2를 입력하세요.");
			length2 = scan.nextInt();
			System.out.printf("마름모 넓이 : %.2f ㎠ ", length1*length2*0.5);
			break;
		}
		
		
		
//		System.out.println("두수를 입력하세요.>>");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("사칙연산 부호를 입력하세요.(+,-,*,/)>>");
//		String str = scan.next();
//		char ch = str.charAt(0);
////		char ch = scan.next().charAt(0);
//		switch(ch) {
//		case '+':
//			
//			System.out.printf("%d + %d = %d \n", a,b,a+b);
//			break;
//		case '-':
//			System.out.printf("%d - %d = %d \n", a,b,a-b);
//			break;
//		case '*':
//			System.out.printf("%d * %d = %d \n", a,b,a*b);
//			break;
//		case '/':
//			System.out.printf("%d / %d = %.1f \n", a,b,(double)a/b);
//			break;
//		default:
//			System.out.println("잘못입력하셨습니다. 다시입력하세요.");
//			break;
//			
//		}//switch
//
		
		
	}//main

}//class
