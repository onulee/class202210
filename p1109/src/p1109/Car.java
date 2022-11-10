package p1109;

public class Car {
	static int carNo=0;
	String color;
	String gearType;
	int door;

	Car(){ // 다른생성자 호출 this
		
	}
		
	Car(String color,String gearType,int door){
		// 인스턴스 변수를 지정하는 this
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		this(c.color,c.gearType,c.door);
	}
	
	
	
}
