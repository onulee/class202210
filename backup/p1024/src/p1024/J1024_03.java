package p1024;

public class J1024_03 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a * b;
//		System.out.println(c);
		double d2 = 0;
		d2 = 100000/3;  //3.33333333
		System.out.println(d2); //3.3333...
		
		char c1 = 'a';
		char c2 = (char)(c1 + 1); //97+1=98 -> b 
		System.out.println(c2);
		
		char c3 = ++c2;
		System.out.println(c3);
		char c4 = (char)(c1-32); //소문자-대문자 = 32
		System.out.println(c4);
		
		char c5 = 'A';
		System.out.println((char)(c5+32));
		
		int i = '1'-'0'; // 0:48, 1:49, 2:50, 3:51, 4:52, 5:53
		System.out.println(i); //
		
		
		
		
		
		double f = 5.0;
		int result = (int)f + 5;
		
		double dd = 85.4;
		result = (int)dd;
		
		
		
		
		
		

	}

}
