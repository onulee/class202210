package p1024;

import java.util.Scanner;

public class J1024_10 {

	public static void main(String[] args) {
		// 문자열을 입력받아 문자열을 출력하시오.
		// 72 -> 7 + 2 = 9,     85 -> 8 + 5 = 13
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.>>");
		String input = scan.next(); 
//		for(int i=0;i<input.length();i++) {
//			ch[i] = input.charAt(i);
//		}
		
		// 문자열을 char분리
		char ch = input.charAt(0);  //String -> char
		// 숫자char -> int변경   '1'-'0'  ch-'0'
		int num = ch-'0';
		// 문자열을 char분리
		char ch2 = input.charAt(1);  //String -> char
		// 숫자char -> int변경
		int num2 = ch2-'0';
		// 두 숫자 더함.
		int result = num + num2;
		
		System.out.println("입력문자 : "+input);
		System.out.println("1문자 : "+num);
		System.out.println("2문자 : "+num2);
		System.out.println("결과값 : "+result);
		

	}

}
