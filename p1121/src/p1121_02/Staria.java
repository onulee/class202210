package p1121_02;

public class Staria extends Car {

	Staria(){
		this("Staria",25960000,259600);
	}
	Staria(String name,int price,int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
