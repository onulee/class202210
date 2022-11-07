package p1107;

public class J1107_09 {

	public static void main(String[] args) {
		// 넓이 구하는 프로그램
		
		// 직사각형 100,25   210,30
		// 마름모 100,25    210,30
		// 사다리꼴 100,25,10   210,30,10   
		
		// 호출해서 넓이를 출력하시오.
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.rect(100, 25));
		System.out.println(c2.rect(210, 30));
		System.out.println(c2.rhom(100, 25));
		System.out.println(c2.rhom(210, 30));
		System.out.println(c2.trape(100,25,10));
		System.out.println(c2.trape(210,30,10));

	}

}
