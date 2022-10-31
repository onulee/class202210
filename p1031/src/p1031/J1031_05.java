package p1031;

import java.util.Scanner;

public class J1031_05 {

	public static void main(String[] args) {
		
		// 점수3개를 입력받아 score배열에 저장해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		// 국어,영어,수학
		int[] score = new int[3];
		String name ="";
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		int total =0;
		double avg = 0;
		
		//성적입력
		System.out.println(title[0]+"을 입력하세요.>>");
		name = scan.nextLine();
		
		for(int i=0;i<score.length;i++) {
			System.out.println(title[i+1]+"점수를 입력하세요.>>");
			score[i] = scan.nextInt();
			total = total +score[i];
		}
		
		avg = total/3.0;
		
		//성적출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------------");
		System.out.printf("%s\t",name);
		for(int i=0;i<3;i++) {
			System.out.printf("%d\t",score[i]);
		}
		System.out.printf("%d\t%.2f\n",total,avg);
		
		
		// score 50개배열, 1,3,5,7,9....
//		int[] score = new int[50];
//		for(int i=0;i<50;i++) {
//			score[i] = 2*i+1;
//			System.out.println(score[i]);
//		}
		
		
		//score 100개 배열을 만들고, 0-99값을 입력해서 출력하시오.
//		int[] score = new int[100];
//		for(int i=0;i<100;i++) {
//			score[i] = i;
//			System.out.println(score[i]);
//		}
//		
//		int[] num = {1,2};
//		// num.length
//		
//		System.out.println("배열길이 : "+num.length);
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
		
		
		
		// num 5개 배열 생성후 1,2,3,4,5 값을 입력해서 출력하시오.
		
//		int[] score = new int[50];
//		score[0] = 10;
//		
//		int[] s = {1,2,3,4,5};
//		
//		for(int i=0;i<50;i++) {
//			score[i] = i+1;
//		}
//		
//		for(int i=0;i<50;i++) {
//			System.out.println(score[i]);
//		}
		
		
		

	}

}
