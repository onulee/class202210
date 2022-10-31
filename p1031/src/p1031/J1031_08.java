package p1031;

import java.util.Scanner;

public class J1031_08 {

	public static void main(String[] args) {
		// 45개짜리 배열을 생성후 1-45까지 숫자를 입력하시오.
		// 1. 45개 배열 생성후 1-45까지 숫자넣기
		// 2. 로또배열을 섞기 
		//    - temp,r_num 변수선언
		//    - 반복문 500번 실행 
		//    - r_num : 0-44까지 랜덤숫자 생성, 
		//    - temp<-lotto[0], lotto[0]<-lotto[r_num], lotto[r_num]=temp
		// 3. 6개 번호입력
		//    - 6개 배열 생성후 scan직접입력
		// 4. 로또번호 6개 출력
		// 5. 내가 입력한 숫자 6개 출력
		
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] input = new int[6];
		int count = 0;
		
		// 1. 45개 배열 생성후 1-45까지 숫자넣기
		for(int i=0;i<45;i++) {
			lotto[i]=i+1; //1-45
		}
		
		// 2. 로또배열을 섞기 
		int temp=0;
		int r_num=0;
		for(int i=0;i<500;i++) {
			//랜덤 숫자생성
			r_num = (int)(Math.random()*45); //0-44배열번호
			//섞기
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
		//로또출력
		System.out.println("[ 로또 번호 게임 ] ");
		System.out.printf("로또 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		
		// 6개 번호입력 
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 로또 입력 : ");
			input[i] = scan.nextInt();
		}
		
		
		// 내가 입력한 로또출력
		System.out.printf("내가 입력한 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",input[i]);
		}
		System.out.println();
		System.out.println();
		
		// 맞는 개수 확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==input[j]) {
					count++;
					break;
				}
			}
		}//for
		
		// 맞는 개수출력
		System.out.println("[ 당첨결과 ]");
		System.out.printf("맞는 개수 : %d 개\n",count);
		
		switch(count) {
		case 0:case 1:case 2:
			System.out.println("다시 도전하세요.");
			break;
		case 3:
			System.out.println("당첨 : 5,000원");
			break;
		case 4:
			System.out.println("당첨 : 50,000원");
			break;
		case 5:
			System.out.println("당첨 : 1,500,000원");
			break;
		case 6:
			System.out.println("당첨 : 1,500,000,000원");
			break;
		}//switch

	}//main

}//class
