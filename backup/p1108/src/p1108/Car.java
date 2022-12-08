package p1108;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){//기본생성자
//		door = 5; //this위에는 사용할수 없음
//		this("white","Auto",4);
		// 다른 생성자 호출
		// Car("white","Auto",4);
		
	}
	
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	

}
