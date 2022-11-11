package p1111_02;

public class Wash extends Product {

	Wash(){  //기본생성자
		this("세탁기",150,15); //다른생성자 호출
	}
	
	Wash(String name,int price,int bonusPoint){ //생성자
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
