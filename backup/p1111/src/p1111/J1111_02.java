package p1111;


public class J1111_02 extends Object {

	public static void main(String[] args) {
		
		
		CaptionTv ctv1 = new CaptionTv();
		CaptionTv ctv2 = new CaptionTv();
		
		Tv t1 = new Tv();
		
		// 다형성 - 조상의 참조변수로 자손의 객체를 다루는것
		Tv t2 = new CaptionTv(); 
//		Caption c2 = new Tv(); //error
		
		

	}

}
