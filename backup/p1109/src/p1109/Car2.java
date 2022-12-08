package p1109;

public class Car2 {

	static int carNo;
	int cNo;
	String color;
	String gearType;
	int door;
	
	{ 
		carNo++;
	   
	}
	
	Car2(){ //기본생성자
		 cNo = carNo;
	}
	
	Car2(String color,String gearType,int door){
		 cNo = carNo;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car2(Car2 c){
		
		this(c.color,c.gearType,c.door);
		 cNo = carNo;
	}
	

}
