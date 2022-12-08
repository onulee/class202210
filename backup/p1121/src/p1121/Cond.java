package p1121;

public class Cond extends Product {
	Cond(){
		this("무풍 에어콘",120,12);
	}
	
	Cond(String productName,int price,int bonusPoint){
		this.productName = productName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}
