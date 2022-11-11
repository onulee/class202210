package p1111;

public class J1111_05 {

	public static void main(String[] args) {
		P1 p = new C1(); //다형성
		System.out.println(p.x); //100
		p.method();              //부모메소드
		
		C1 c = new C1(); //객체선언
		System.out.println(c.x); //200
		c.method();              //자손메소드

	}

}
