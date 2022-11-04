package p1103;

import java.util.Scanner;

public class J1103_08_로또번호맞추기 {

	public static void main(String[] args) {
		
		// 1. 45개 배열생성
		Scanner scan = new Scanner(System.in);
		String[] lotto_output = new String[45]; //화면출력 로또번호
		int[] lotto = new int[45];        //당첨 로또번호
		int[] input = new int[6];         //내가 입력한 로또번호
		int[] l_no = new int[6];          //당첨된 번호
		int count=0;                      //입력한 횟수
		int num=0;                        //당첨개수
		
		// 2. 1-45까지 숫자 넣기
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
			lotto_output[i] = i+1+"";
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
			System.out.println("        [ 로또 번호 ]");
			int j=1;
			for(int i=0;i<45;i++) {
				if(j%5==0) {
					System.out.printf("%s\t",lotto_output[i]);
					System.out.println();
				}else {
					System.out.printf("%s\t",lotto_output[i]);
				}//if
				j++;
			}//for
			
			
			System.out.println("로또번호를 입력하세요.(1-45)>>");
			input[count] = scan.nextInt();
			for(int i=0;i<45;i++) {
				if(lotto_output[i].equals(input[count]+"")) {
					lotto_output[i]="♥";
				}//if
			}//for
			
			count++;
		}//while
		
		// 5. 당첨번호 6개의 숫자 출력
		System.out.println("     [ 로또 당첨확인 ]");
		System.out.printf("로또 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d  ",lotto[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		
		// 6. 자신 번호 6개 숫자출력
		System.out.printf("나의 로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d  ",input[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		
		
		// 7. 당첨번호개수 확인
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==input[j]) {
					l_no[num] = input[j]; //당첨된 번호를 l_no배열에 넣기
					num++;
					break;
				}//if
			}//for
		}//for
		
		//8. 당첨번호개수, 번호출력
		System.out.printf("당첨번호 개수 : %d \n",num);
		System.out.println("-------------------------------");
		System.out.printf("당첨번호 : ");
		if(num==0) {
			System.out.printf("당첨번호가 없습니다.");
		}else {
			for(int i=0;i<num;i++) {
				System.out.printf("%d  ",l_no[i]);
			}//for
		}//if
		System.out.println();
		

	}//main

}//class
