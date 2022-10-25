package p1024;

import java.util.Scanner;

public class J1024_06 {

	public static void main(String[] args) {
		// 소수점을 입력받아 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점을 입력하세요.");
		double input = scan.nextDouble();
		// 퀴즈
		// 소수점 2짜리에서 반올림해서 출력하시오.
		input = Math.round(input*10)/10.0;
		
		
		
		System.out.println("결과 : "+input);
		
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		System.out.println("입력숫자 : "+input);
		
		
		
		
//		System.out.println("소수점을 입력하세요.>>");
//		double input = scan.nextDouble();
//		System.out.println("출력 : "+input);
		
//		System.out.println("문자열을 입력하세요. : ");
//		String input = scan.nextLine();
//		System.out.println("문자열 : "+input);
		

	}

}
