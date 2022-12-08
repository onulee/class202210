package p1101;

import java.util.Scanner;

public class J1101_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int choice=0,choice2=0;
		int[][] score = new int[5][5];
		int[] num = new int[25];
		// 25개배열에 숫자입력
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		//랜덤숫자배열 넣기
		int temp=0,r_num=0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*25); //0-24 
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}
		
		// 배열입력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = num[5*i+j]; // <-수정
			}
		}//for
		
		while(true) {
			// 배열출력
			System.out.print("0|\t0\t1\t2\t3\t4\n");
			System.out.println("----------------------------------------");
			for(int i=0;i<5;i++) {
				System.out.printf("%d|\t",i);
				for(int j=0;j<5;j++) {
					System.out.printf("%d\t",score[i][j]);
				}
				System.out.println();
			}//for
			System.out.println("---------------------------------------");
			
			//좌표를 넣으면 0으로 표시
			System.out.println("원하는 x,y좌표를 입력하세요.>>");
			int number = scan.nextInt();
			choice = number/10;
			choice2 = number%10;
			
//			String str = scan.next();
//			choice = str.charAt(0)-'0'; //x좌표
//			choice2 = str.charAt(1)-'0'; //y좌표
			
			// 입력값과 2차원배열 값을 비교
			loop:
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
						score[choice][choice2]=0;
						break loop;
				}
			}//for
		}//while
		
		
		
		
		
	}//main

}//class
