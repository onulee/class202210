package p1122_03;

public class J1122_07 {

	public static void main(String[] args) {
		Time t1 = new Time(); //객체선언
		
		System.out.println(t1.second);
		t1.second=100;
		System.out.println(t1.second);
		
		
		System.out.println(t1.getHour());
		t1.setHour(10);
		System.out.println(t1.getHour());

	}

}
