package p1107;

public class J1107_01 {

	public static void main(String[] args) {
		Tv t = new Tv(); //객체선언,인스턴스선언
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t.channel=7;
		t2 = t;
		System.out.println(t2.channel);
		t2.channel=80;
		System.out.println(t.channel);
		
		t3.channel = 5;
		System.out.println(t2.channel);
		
		t3.channel = t2.channel;
		System.out.println(t3.channel);
		
		t3.channel=5;
		System.out.println(t2.channel);
	
		
		
//		t.channel=7;
//		t.power();
//		t.channelUp();
//		
//		System.out.println(t.channel);
		

	}

}
