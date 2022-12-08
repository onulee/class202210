package p1021;

public class J1021_07 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println("------------------------------");
		a++;
		b = a; // a의 값을 먼저 대입을 하고, 1을 증가.   a = a + 1   a=1
		// b=0, a=1
		System.out.println(b);
		++a;
		b = a; // a의 값을 1을 증가시키고, 대입을 해라
		// a=1 인데 1을 증가 a=2, a=2를 b에 대입 , b=2
		System.out.println(b);
		
		--a;  // a = a - 1
		a--;  // a = a - 1

	}

}
