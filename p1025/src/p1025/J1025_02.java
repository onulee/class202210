package p1025;

import java.util.Scanner;

public class J1025_02 {

	public static void main(String[] args) {
		// 점수 score1,score2,score3 3개를 입력받아 합계를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.>>");
		int score1 = scan.nextInt();
		System.out.println("점수를 입력하세요.>>");
		int score2 = scan.nextInt();
		System.out.println("점수를 입력하세요.>>");
		int score3 = scan.nextInt();
		int sum = score1 + score2 + score3;
		double avg = sum/3.0;
		System.out.printf("합계 : %d\t",sum);  // \t:tab키, \n:줄바꿈
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println(avg);
		
		
		
		
		
		
		
//		int a = 10000000;
//		int result1 = a * a / a;
//		int result2 = a / a * a;
//		
//		System.out.println(result1);
//		System.out.println(result2);

	}

}
