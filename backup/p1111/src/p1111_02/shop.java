package p1111_02;

public class shop {
	public static void main(String[] args) {
		// 소비자 1명 생성
		System.out.println("1. 머니충전");
		System.out.println("2. TV구매");
		System.out.println("3. 컴퓨터구매");
		System.out.println("4. 세탁기구매");
		System.out.println("7. 보너스사용");
		System.out.println("8. 구매내역");
		System.out.println("9. 잔액확인");
		
		Buyer ryu = new Buyer(10000,0);
		Tv tv = new Tv(); //객체선언,다형성변경
		ryu.buy(tv);
		ryu.buy(tv);
		ryu.buy(tv);
		Computer com = new Computer();
		ryu.buy(com);
		ryu.buy(com);
		Wash wash = new Wash();
		ryu.buy(wash);
		ryu.buy(wash);
		ryu.buy(wash);
		ryu.buy(wash);
		// 오버로딩,메소드 이름은 같고,타입,개수가 다른것
		
		
		
		
	}

}
