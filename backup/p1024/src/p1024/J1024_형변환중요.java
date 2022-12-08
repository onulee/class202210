package p1024;

import java.util.Scanner;

public class J1024_형변환중요 {

	public static void main(String[] args) {
		// int -> String    7+""="7"
		// 숫자char -> int   '1'-'0'=1
		// String -> char   charAt()
		// String -> int    Integer.parseInt()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요.>>");
		String input = scan.next();
		// String -> int
		int num = Integer.parseInt(input);
//		String input = scan.next();
		System.out.println("2번째 숫자를 입력하세요.>>");
		int input2 = scan.nextInt();
		System.out.println("두수의 합 : "+(num+input2));

	}

}
