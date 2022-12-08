package p1025;

public class J1025_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		// 10 + 4 = 14
		// 10 - 4 = 6
		// 10 * 4 = 40
		// 10 / 4 = 2.5
		
		
//		int a = 100;
//		int b = 1000000000;
		double d = 9.254567;
		String name = "홍길동";
		// 문자열 : %s, 정수형 : %d, 실수형 : %f, 문자 : %c, 논리형 : %b
		System.out.printf("이름:%s ,점수:%05d, 평균:%010.3f \t",name,a,d);
		System.out.printf("%,020d", b);

	}

}
