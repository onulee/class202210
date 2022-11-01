package p1101;

import java.util.Scanner;

public class J1101_01 {

	public static void main(String[] args) {

		// 45개짜리 배열을 생성후 1-45까지 숫자를 입력하시오.
		// 1. 45개 배열 생성후 1-45까지 숫자넣기
		int[] lotto = new int[45];
		for(int i=0;i<45;i++)
			lotto[i] = i+1;
		
		// 2. 로또배열을 섞기
		int temp=0,r_num=0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*45); //0-44
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
		
		// 3. 6개 번호입력
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for(int i=0;i<input.length;i++) {
			System.out.println((i+1)+"번째 번호를 입력하세요.>>");
			input[i] = scan.nextInt();
		}
		
		// 4. 로또번호 6개 출력
		System.out.print("로또 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		
		
		// 5. 내가 입력한 숫자 6개 출력
		System.out.print("내가 입력한 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",input[i]);
		}
		System.out.println();
		
		// 6. 당첨된 번호 개수 확인  lotto[i] == input[j]
		int count=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==input[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("당첨된 번호 개수 : "+count);
		
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
