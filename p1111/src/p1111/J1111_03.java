package p1111;

public class J1111_03 {

	public static void main(String[] args) {
		Car c1 = null;  //참조변수선언
//		c1.drive(); //null값이기에 사용하면 에러!
		FireEngine fe = new FireEngine(); //객체선언
		fe.water();
		FireEngine fe2 = null;
		c1 = fe;   // 다형성
		c1.drive();
		fe2 = (FireEngine)c1;
		fe2.water();
		
		
		

	}

}
