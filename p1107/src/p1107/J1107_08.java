package p1107;

public class J1107_08 {

	public static void main(String[] args) {
		//객체선언
		Cal c = new Cal();
		int a = 100;
		int b = 3;
		int result1 = c.add(a, b);
		int result2 = c.sub(a, b);
		int result3 = c.multi(a, b);
		double result4 = c.div(a, b);
		System.out.println(a+b);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
