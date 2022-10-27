package p1027;

import java.util.Scanner;

public class J1027_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" [가위바위보 게임]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("가위 바위 보 게임을 합니다. 원하는 번호를 입력하세요.>>");
		// 컴퓨터가 정한 가위바위보 숫자
		int r_num = (int)(Math.random()*3)+1;
		// 내가 입력한 숫자
		int input = scan.nextInt();
		// r_num - input = -2,-1,0,1,2
		// 승리! 무승부! 패전!
		switch(r_num-input) {
		
		// 승리할때
		case -1: case 2:
			System.out.println("승리!");
			break;
		case 0: // 무승부
			System.out.println("무승부!");
			break;
		case -2: case 1:
			System.out.println("패전!");
			break;
		}
		
		if(r_num==1) {
			System.out.println("랜덤 : 가위");
		}else if(r_num==2) {
			System.out.println("랜덤 : 바위");
		}else {
			System.out.println("랜덤 : 보");
		}
		
		if(input==1) {
			System.out.println("자신 : 가위");
		}else if(input==2) {
			System.out.println("자신 : 바위");
		}else if(input==3) {
			System.out.println("자신 : 보");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		// 승 : -1,2
		// 무 : 0
		// 패 : -2,1
		
		// 1 -> 2 (승) -1 가위
		// 1 -> 1 (무) 0
		// 1 -> 3 (패) -2

		// 2 -> 3 (승) -1 바위
		// 2 -> 2 (무) 0
		// 2 -> 1 (패) 1
		
		// 3 -> 1 (승) 2 보
		// 3 -> 3 (무) 0
		// 3 -> 2 (패) 1
		
		
		
//		int r_num = (int)(Math.random()*3)+1;
//		int input = scan.nextInt();
//		
//		if(r_num==input) {
//			System.out.println("당첨입니다 상품증정!");
//		}else {
//			System.out.println("다음기회에! 도전하세요.");
//		}
//		
//		System.out.println("당첨번호 : "+r_num);
		
		
		
		
		
		// 1부터 50까지 랜덤숫자를 출력하는 프로그램을 구성하시오.
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);
//		System.out.println((int)(Math.random()*50)+1);

	}

}
