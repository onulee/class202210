package p1121_02;

public class Ioniq6 extends Car {

	Ioniq6(){
		this("Ioniq6",52000000,520000);
	}
	Ioniq6(String name,int price,int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
