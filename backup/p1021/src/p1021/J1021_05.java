package p1021;

public class J1021_05 {

	public static void main(String[] args) {
		byte b = 127;
//		byte c = 128;  에러 //127
		int a = 2147483647;
		int num = a + 1;
		System.out.println(num); // 2147483648
		
		System.out.println("-----------------------");
		int n1 = 1000000;
		int n2 = 1000000;
		int n3 = 1000000;
		int result = n1*n2; //1000000;
		System.out.println(n1*n2/n3);  //
		

	}

}
