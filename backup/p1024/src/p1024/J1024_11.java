package p1024;

import java.util.Scanner;

public class J1024_11 {
	public static void main(String[] args) {
		//문자열을 2개 입력받아, 숫자로 변환후 두수를 더해서 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		//1번째 입력
		System.out.println("1번째 숫자를 입력하세요.>>");
		// 문자열 입력
		String input = scan.next();
		// 문자열을 숫자로 취환
		int num = Integer.parseInt(input);
		
		//2번째 입력
		System.out.println("2번째 숫자를 입력하세요.>>");
		String input2 = scan.next();
		int num2 = Integer.parseInt(input2);
		
		
		System.out.println("두수의 합 : "+(num+num2));
		
	}

}
