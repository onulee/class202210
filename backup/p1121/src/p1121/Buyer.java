package p1121;

import java.util.ArrayList;

public class Buyer {
	String name;    //구매자
	int money;      //보유금액(단위:만원)
	int bonusPoint; //보너스포인트
	Product[] cart = new Product[10]; //구매배열
	ArrayList<Product> list = new ArrayList<Product>();
	// Object클래스를 담을수 있음
	// 객체배열의 장점 : 선언을 하면 자동 10개가 만들어짐.
	// 11개에 자동으로 10개 추가 됨.삭제시 1칸씩으로 앞으로 당겨짐.
	int i = 0;
	
	Buyer(){}
	Buyer(String name,int money,int bonusPoint){
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	
	//구매메소드
	void buy(Product p) {
		
		if(money < p.price) { //잔액을 비교해서 물건을 구매하지 못하도록 함.
			System.out.println("잔액이 부족합니다. 금액을 충전하세요.!!");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		list.add(p); //구매한 상품을 list에 저장  cart[i] = p;
		i++;
	}

}
