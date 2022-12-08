package p1101;

import java.util.Scanner;

public class J1101_09 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자 맞추기 게임
		// user 입력한 값도 출력을 하시오.
		Scanner scan = new Scanner(System.in);
		int count=0;
		int r_num = (int)(Math.random()*100)+1; //1-100 랜덤숫자
		int[] score = new int[10]; //입력받을 배열변수
		
		int i=0;
		//10번 반복
		while(i<10) {
			System.out.println("1-100사이의 숫자를 입력하세요.>>");
			score[i] = scan.nextInt();
			if(score[i]==r_num) {
				System.out.println("정답입니다.!!");
				i++;
				break;
			}else if(score[i]<r_num) {
				System.out.println("입력한 숫자보다 더 큽니다.");
			}else {
				System.out.println("입력한 숫자보다 작습니다.");
			}
			i++;
		}//while
		
		// [ 출력 ]
		System.out.println("[ 숫자맞추기 요약 ]");
		System.out.println("랜덤숫자 : "+r_num);
		System.out.println("총 도전횟수 : "+i);
		System.out.print("입력한 숫자 : ");
		for(int j=0;j<i;j++) {
			System.out.printf("%d,",score[j]);
		}
		
		

	}//main

}//class
