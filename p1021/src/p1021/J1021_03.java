package p1021;

public class J1021_03 {

	public static void main(String[] args) {
		boolean power = true;
		char ch = 'A';
		char ch2 ='\u0041'; //A
		char ch6 = 65;
		char ch3 = '\t';  //사이띄우기
		char ch4 = 'B';
		char ch5 = '\n';  //줄바꿈
		byte b = 127;
		short s = 32767;
		int oct = 0100;  //8진수 : 0을 붙이면 8진수
		int hex = 0x100; // 16진수 : 0x 붙이면 16진수 
		System.out.print(ch);
		System.out.print(ch5);
		System.out.print(ch4);
		System.out.print(ch6);
		System.out.println();
		System.out.println(oct);
		System.out.println(hex);
		
		System.out.println("--------------------");
		long num = 10000000000L;
		float f = 3.14f;
		float ff = 100f;
		double d = 3.14;
		System.out.println(ff);
		
		char c1 = ' ';
		System.out.println((int)c1);
		String s1 ="";
		char c2=' ';
		
		char c3 = 'a';
		System.out.println(c2);
		

	}

}
