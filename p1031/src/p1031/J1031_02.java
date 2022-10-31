package p1031;

import java.util.Scanner;

public class J1031_02 {

	public static void main(String[] args) {
		// 1-10까지의 랜덤숫자를 맞추는 게임 0-9
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int i = 0;
		// 1. 랜덤숫자 생성
		int r_num = 0;
		r_num = (int) (Math.random() * 100) + 1; // (int)1<=(int)(x*10)+1<(int)11

		// 10번 반복
		for (i = 0; i < 10; i++) {
			// 2. 숫자입력
			System.out.println("숫자를 입력하세요.>>");
			input = scan.nextInt();

			// 3. 입력한 숫자와 랜덤숫자 비교
			if (r_num == input) {
				System.out.println("정답입니다.");
				break;
			} else if(r_num > input) {
				System.out.println("오답입니다.");
				System.out.println("입력한 숫자보다 랜덤숫자가 더 큽니다.");
			} else {
				System.out.println("오답입니다");
				System.out.println("입력한 숫자보다 랜덤숫자가 더 작습니다.");
			}
		}//for

		System.out.println("정답 : " + r_num);
	}//main

}//class
