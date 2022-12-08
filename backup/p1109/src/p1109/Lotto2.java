package p1109;

import java.util.Scanner;

public class Lotto2 {
	
	static Scanner scan = new Scanner(System.in);
	
	// 2. 1-45까지 숫자넣기 메소드
	void lotto_input(int[] lotto) {
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}//for
	}//method
	
	// 3. 랜덤숫자 섞기 메소드
	void lotto_shuffle(int[] lotto) {
		int temp = 0;
		int r_num = 0;
		for(int i=0;i<500;i++) {
			r_num = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}//for
	}//method
	
	// 4. 6개 번호넣기
	void my_input(int[] input) {
		int count=0;
		while(count<6) {
			System.out.println("로또번호를 입력하세요.(1-45)>>");
			input[count] = scan.nextInt();
			count++;
		}//while
		
	}//method
	
	// 5. 당첨번호 6개의 숫자 출력
	void lotto_print(int[] lotto) {
		System.out.println("     [ 로또 당첨확인 ]");
		System.out.printf("로또 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d  ",lotto[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		
	}//method

	// 6. 자신 번호 6개 숫자출력
	void my_print(int[] input) {
		System.out.printf("나의 로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d  ",input[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		
	}//method
	
	// 7. 당첨번호개수 확인
	int lotto_count(int[] lotto,int[] input,int[] l_no) {
		int num = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==input[j]) {
					l_no[num] = input[j]; //당첨된 번호를 l_no배열에 넣기
					num++;
					break;
				}//if
			}//for
		}//for
		
		return num;
		
	}//method
	
	//8. 당첨번호개수, 번호출력
	void lotto_no(int num,int[] l_no) {
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
		
	}//method
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
