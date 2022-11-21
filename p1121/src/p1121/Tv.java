package p1121;

public class Tv extends Product {
	
	Tv(){
		this("75인치 smartTV",100,10);
	}
	
	Tv(String productName,int price,int bonusPoint){
		this.productName = productName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}
