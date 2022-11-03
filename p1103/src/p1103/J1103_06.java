package p1103;

import java.util.Scanner;

public class J1103_06 {

	public static void main(String[] args) {
		// 1-25까지 1차원 num 배열에 숫자를 넣어서 출력하시오.
		// 랜덤으로 섞어서 num배열에 넣기
		// 2차원 score배열에 num배열의 숫자 넣기

		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int[] num = new int[25];
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		
		// 1-25까지 입력  // 0-12개, 1-13개
		for(int i=0;i<25;i++) {
			if(i<12) {
				num[i] = 0;
			}else {
				num[i] = 1;
			}
		}//for
		
		//랜덤섞기-500
		int temp=0,r_num=0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}
		
		// 랜덤 숫자 입력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				score[i][j] = num[5*i+j];   //5*i+j+1;  //0-24  1-25
				score2[i][j] = "♥";
			}
		}//for
		
		
		
		
		//무한반복 시작 --->
		while(true) {
		
			// score배열 출력
			System.out.println("               [ 배열 확인 ]");
			System.out.printf("0|\t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			for(int i=0;i<5;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<5;j++) {
					System.out.printf("%s\t",score[i][j]);
				}
				System.out.println();
			}//for
			
			
			// score배열 출력
			System.out.println("               [ 배열 확인 ]");
			System.out.printf("0|\t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------------");
			for(int i=0;i<5;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<5;j++) {
					System.out.printf("%s\t",score2[i][j]);
				}
				System.out.println();
			}//for
			
			System.out.println("X 좌표를 입력하세요.(0-4)>>");
			x = scan.nextInt();
			System.out.println("Y 좌표를 입력하세요.(0-4)>>");
			y = scan.nextInt();
			
			//프로그램 구성
			if(score[x][y]==1) {
				score2[x][y]="당첨";
			}else {
				score2[x][y]="꽝";
			}
			
			
		
		}//while
		
		// 무한반복 끝 ---->
		

	}

}
