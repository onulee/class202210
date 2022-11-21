package p1121_02;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String input = "",userId="",userPw="";
		int choice = 0;
		
		
		// 로그인부분
		while(true) {
			System.out.println("로그인을 하셔야 프로그램에 접속이 가능합니다.!");
			System.out.println("로그인 하시겠습니까?(y/n)");
			input = scan.next();
			if(input.equals("Y") || input.equals("y")) {
				System.out.println("아이디를 입력하세요.>>");
				userId = scan.next();
				System.out.println("패스워드를 입력하세요.>>");
				userPw = scan.next();
				if(userId.equals("ryu") && userPw.equals("1234")) {
					System.out.println("류승택님 환영합니다. 차량구매가 가능한 사이트로 이동합니다.");
					
					//---------------------------------------->
					
					// 류승택님 로그인
					Member ryu = new Member("ryu","류승택",5000,0);
					//온라인구매부분
					while(true) {
						System.out.println("[ 현대자동차 구로디지털 온라인지점 ]");
						System.out.println("인기차량 빅세일");
						System.out.println("1. 그랜져");   //100,10
						System.out.println("2. 산타페");   //ref 150,15
						System.out.println("3. 아이오닉6"); //wash 90,9
						System.out.println("4. 스타리아");  // cond 120,12
						System.out.println("5. 보너스포인트 전환");      
						System.out.println("7. 금액충전");
						System.out.println("8. 구매 상품리스트");
						System.out.println("9. 현재 보유금액 및 보너스포인트");
						System.out.println("---------------------");
						System.out.println("구매하고 싶은 물건을 선택하세요.>>");
						choice = scan.nextInt();
						
						switch(choice) {
						
						case 1:
							ryu.buy(new Grandeur());
							System.out.printf("현재 보유금액 : %,d %n",ryu.money);
							break;
						case 2:
							ryu.buy(new Santafe());
							System.out.printf("현재 보유금액 : %,d %n",ryu.money);
							break;
						case 3:
							ryu.buy(new Ioniq6());
							System.out.printf("현재 보유금액 : %,d %n",ryu.money);
							break;
						case 4:
							ryu.buy(new Staria());
							System.out.printf("현재 보유금액 : %,d %n",ryu.money);
							break;
							
						case 5:
							System.out.println(" [ * 보너스포인트는 50만원부터 전환가능!! ]");
							if(ryu.bonusPoint<500000) {
								System.out.println("50만원 이상부터 전환가능합니다.");
								break;
							}
							System.out.println("현재 포인트 : "+ryu.bonusPoint);
							System.out.println("변경할 포인트를 입력하세요.>>");
							choice = scan.nextInt();
							if(ryu.bonusPoint<choice) {
								System.out.println("입력한 포인트가 더 많습니다. 다시 한번 확인해주세요.!!");
								break;
							}
							
							ryu.bonusPoint = ryu.bonusPoint - choice;
							ryu.money = ryu.money + choice;
							System.out.println("전환이 완료되었습니다.!!");
							break;
							
						case 7:
							System.out.println("충전금액을 입력하세요.>>");
							choice = scan.nextInt();
							ryu.money = ryu.money + choice;
							System.out.printf("충전금액 : %,d %n",choice);
							System.out.printf("현재보유금액 : %,d %n",ryu.money);
							
							break;
							
						case 8:
							System.out.println("[ 구매상품 리스트 ]");
							System.out.println("총 구매상품 개수 : "+ryu.list.size());
							System.out.printf("구매상품리스트 : ");
							for(int i=0;i<ryu.list.size();i++) {
								System.out.printf("%s ,",ryu.list.get(i).name);
							}
							System.out.println();
							
							break;
							
						case 9:
							System.out.printf("보유금액 : %,d %n",ryu.money);
							System.out.printf("보너스포인트 : %,d %n",ryu.bonusPoint);
							break;
							
						
						}//switch
						
					}//while
					
					
					//-------------------------------------->
					
					
				}else {
					System.out.println("아이디 또는 패스워드가 일치하지 않습니다. 다시 입력하세요.");
				}//if

			}else {
				System.out.println("프로그램을 종료합니다.!!");
				break;
			}//if
		}//while
		
		
		
		
		
	}

}
