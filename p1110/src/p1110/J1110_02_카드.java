package p1110;

import java.util.Scanner;

public class J1110_02_카드 {

	public static void main(String[] args) {
		// Deck객체선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		Deck d = new Deck();
		
		while(true) {
			System.out.println("[ 포커 카드게임 ]");
			System.out.println("1. 카드섞기");
			System.out.println("2. 카드 1장 받기");
			System.out.println("3. 카드 5장 받기");
			System.out.println("4. 내카드 보기");
			System.out.println("9. 게임리셋");
			System.out.println("10. 프로그램종료");
			System.out.println("--------------");
			System.out.println("원하는 번호를 선택하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				d.shuffle();
				System.out.println("카드를 섞습니다.");
				break;
				
			case 2:
				System.out.println("카드를 뽑아주세요.(0-51)");
				choice = scan.nextInt();
				Card c = d.pick(choice); //내가 뽑은 카드
				
				System.out.printf("%s,%s \n",c.kind,c.number);
				break;
			}
			
			
			
		}
		
		
		
		
//		System.out.println("원하는 카드를 뽑아주세요.>>(0-51)");
//		int choice = scan.nextInt();
//		Card c = d.pick(choice);
//				
//		System.out.printf("%s,%s \n",c.kind,c.number);
//		
//		
//		for(int i=0;i<d.c.length;i++) {
//			System.out.printf("카드 %s,%s \n",d.c[i].kind,d.c[i].number);
//		}

	}

}
