package p1109;

public class J1109_01 {
	public static void main(String[] args) {
		Car c1 = new Car(); //white,auto,4
		                    // null,null,0
		
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		Car c2 = new Car("purple","auto",8);
		
		Car c3 = new Car(c2); //객체복사
		
//		c3 = c2; // 주소공유
		
		
		
		
	}

}
