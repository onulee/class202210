package p1108;

public class J1108_05 {

	public static void main(String[] args) {
		Data d = new Data(); //객체선언
		d.x = 10;
		System.out.println("d.x의 처음 값 : "+d.x); //10
		J1108_05.change(d.x);
		System.out.println("change메소드 호출후 d.x의 값 : "+d.x);
		
	}//main메소드
	
	static int change(int x) {  //매개변수 기본형 타입, 참조형 타입 - 배열 변수 int[] arr = new int[3];
		x = 1000;
		System.out.println("change메소드 x의 값 : "+x); //1000
		return x;
	}

}//class


class Data{
	int x;
}//class