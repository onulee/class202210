package p1121;

public class Ref extends Product {
	Ref(){
		this("bespoke 냉장고",150,15);
	}
	
	Ref(String productName,int price,int bonusPoint){
		this.productName = productName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}
