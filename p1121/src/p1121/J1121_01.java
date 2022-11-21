package p1121;

import java.util.Scanner;

public class J1121_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("류승택님이 로그인하셨습니다.!!");
		Buyer ryu = new Buyer("류승택",1000,0);
		
		while(true) {
			System.out.println("[ 삼성프라자 ]");
			System.out.println("인기추천 상품 빅세일");
			System.out.println("1. 75인치 smartTV"); //100,10
			System.out.println("2. bespoke 냉장고");  //ref 150,15
			System.out.println("3. 그랑데 세탁기");     //wash 90,9
			System.out.println("4. 무풍 에어콘");      // cond 120,12
			System.out.println("8. 구매 상품리스트");
			System.out.println("9. 현재 보유금액 및 보너스포인트");
			System.out.println("---------------------");
			System.out.println("구매하고 싶은 물건을 선택하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				ryu.buy(new Tv()); //1대구매
				System.out.println("75인치 smartTV 1대가 구매되었습니다.");
				break;
			case 2:
				ryu.buy(new Ref()); //1대구매
				System.out.println("bespoke 냉장고 1대가 구매되었습니다.");
				break;
			case 3:
				ryu.buy(new Wash()); //1대구매
				System.out.println("그랑데 세탁기 1대가 구매되었습니다.");
				break;
			case 4:
				ryu.buy(new Cond()); //1대구매
				System.out.println("무풍 에어콘 1대가 구매되었습니다.");
				break;
				
			case 8:
				System.out.println("[ 구매상품 리스트 ]");
				for(int i=0;i<ryu.i;i++) {
					System.out.printf("%s, ",ryu.cart[i].productName);
				}
				System.out.println(ryu.i+"개 상품을 구매했습니다.");
				
				break;
				
			case 9:
				System.out.println("보유금액 : "+ryu.money);
				System.out.println("보너스포인트 : "+ryu.bonusPoint);
				break;
				
			
			}
			
			
			
			
		}
		
		
		
		
		

	}

}
