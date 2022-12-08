package p1121;

public class Wash extends Product {

	Wash(){
		this("그랑데 세탁기",90,9);
	}
	
	Wash(String productName,int price,int bonusPoint){
		this.productName = productName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
