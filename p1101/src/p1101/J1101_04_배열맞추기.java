package p1101;

import java.util.Scanner;

public class J1101_04_배열맞추기 {

	public static void main(String[] args) {
		// 5,5의 배열 -> 랜덤으로 섞어서 1,25까지 숫자를 입력
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		Scanner scan = new Scanner(System.in);
		String choice = "";
		
		//랜덤숫자 입력
		int[] num = new int[25];
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		//랜덤섞기
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
				score2[i][j] = ""+num[5*i+j];
			}
		}//for
		
		
		
		
		// 무한반복
		while(true) {
			// 출력
			System.out.println("    [ 배열 확인 ]");
			System.out.printf("0|\t0\t1\t2\t3\t4\n");
			System.out.println("-------------------------------------");
			for(int i=0;i<5;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<5;j++) {
					System.out.printf("%s\t",score2[i][j]);
				}
				System.out.println();
			}//for
			
			System.out.println("-------------------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.next();
			
			//같은 번호 검색
			loop:
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(score2[i][j].equals(choice)) {
						score2[i][j] = "X";
						break loop;
					}
				}
			}
			
			
		}//while
		
		

	}//main

}//class
