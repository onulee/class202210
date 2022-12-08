package p1021;

public class J1021_06 {

	public static void main(String[] args) {
		// 형변환
		int a = 65;
		char ch = (char)a;
		System.out.println(ch);
		System.out.println("-----------------------");
		char ch2 = 'a';
		int b = (int)ch2;
		System.out.println(b);
		float f = 1.6f;
		int c = (int)f;
		System.out.println(c);
		float f2 = (float)c;
		System.out.println(f2);
		
		System.out.println("--------------------------");
		byte bb = 100;
		int d = bb; //  큰타입으로 변경시 (byte)타입 생략가능
		
		long a2 = 1000L;
		int num1 = (int)a2; // 작은타입으로 변경시 (int)타입 생략불가
		
		
		
		

	}

}
