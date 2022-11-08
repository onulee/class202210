package p1108;

public class J1108_10 {

	public static void main(String[] args) {
		//객체선언
		Data2 d2 = new Data2();
		d2.x = 10;
		System.out.println(d2.x); //10
		System.out.println(d2);   //주소값
		
		// 메소드 호출
		change(d2);
		
		System.out.println(d2.x); //1000

	}
	
	static void change(Data2 d2) {
		d2.x=1000;
	}
	

}

class Data2{
	int x;
}
