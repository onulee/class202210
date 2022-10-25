package p1024;

import java.util.Scanner;

public class J1024_12 {

	public static void main(String[] args) {
		// 숫자 3개를 입력받아 합을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		//1번째 입력
		System.out.println("1번째 숫자를 입력하세요.>>");
		int num = scan.nextInt();
		
		//2번째 입력
		System.out.println("2번째 숫자를 입력하세요.>>");
		int num2 = scan.nextInt();
		
		//3번째 입력
		System.out.println("3번째 숫자를 입력하세요.>>");
		int num3 = scan.nextInt();
		
		System.out.println("3개의 수 합 : "+(num+num2+num3));

	}

}
