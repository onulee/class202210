package p1103;

import java.util.Scanner;

public class J1103_08 {

	public static void main(String[] args) {
		
		// 6. 자신 번호 6개 숫자출력
		// 7. 당첨번호개수 출력
		
		// 1. 45개 배열생성
		Scanner scan = new Scanner(System.in);
		int[] lotto_output = new int[45]; //화면출력 로또번호
		int[] lotto = new int[45];        //당첨 로또번호
		int[] input = new int[6];         //내가 입력한 로또번호
		int count=0;                      //입력한 횟수
		
		// 2. 1-45까지 숫자 넣기
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
			lotto_output[i] = i+1;
		}//for
		
		// 3. 랜덤숫자 섞기
		int temp = 0;
		int r_num = 0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}//for
		
		// 4. 6개 번호넣기
		while(count<6) {
			System.out.println("로또번호를 입력하세요.(1-45)>>");
			input[count] = scan.nextInt();
			count++;
		}//while
		
		// 5. 당첨번호 6개의 숫자 출력
		System.out.println("     [ 로또 당첨확인 ]");
		System.out.printf("로또 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		
		// 6. 자신 번호 6개 숫자출력
		

		
		
		

	}//main

}//class
