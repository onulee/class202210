package p1024;

public class J1024_02 {

	public static void main(String[] args) {
		byte a = 10;  //127
		byte b = 20;
		byte c = (byte)(a + b);
		//int c = a + b;
		
		char ch1 = '9';
		char ch2 = '0'; //48
		char ch3 = 'a'; //97
		char ch4 = 'A'; //65
		
		char ch5 = ++ch3;  // * char변수에 ++,-- 사용가능
		int ch6 = ch3 + 3; // a:97+3=100
		System.out.println(ch5);
		
		float f = 1.0f;
		float result = f + a; //a=10
		
		double dd = 1.0;
		dd = dd + a; //11.0
		
		
		
		
	}
}
