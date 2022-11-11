package p1111_02;

public class Tv extends Product {
	
	Tv(){  //기본생성자
		this("TV",100,10); //다른생성자 호출
	}
	
	Tv(String name,int price,int bonusPoint){ //생성자
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}
