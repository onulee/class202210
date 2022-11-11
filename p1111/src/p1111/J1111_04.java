package p1111;

public class J1111_04 {

	public static void main(String[] args) {
		Car c1 = null;
		Car c2 = null;
		Ambulance a1 = new Ambulance();
		Ambulance a2 = null;
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		c1 = a1;  //Ambulance -> Car
		c2 = f1;  //FireEngine -> Car
		
//		f2 = (FireEngine)c1; //Am -> Fire
		System.out.println("확인");
		
		
//		if(c1 instanceof FireEngine) {
//			f2 = (FireEngine)c1;
//			System.out.println("소방차 객체입니다.");
//		}else {
//			a2 = (Ambulance)c1;
//			System.out.println("앰블런스 객체입니다.");
//		}
		
		

	}

}
