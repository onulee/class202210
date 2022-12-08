package p1111_02;

public class Computer extends Product{

	int cpuType;
	int ramType;
	int ramEa;
	
	Computer(){  //기본생성자
		this("컴퓨터",200,20); //다른생성자 호출
	}
	
	Computer(String name,int price,int bonusPoint){ //생성자
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
